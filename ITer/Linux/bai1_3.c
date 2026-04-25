#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <math.h>

int req[10000];
int n = 0;
int max_cyl;
int res_fcfs, res_scan, res_cscan;

int compare(const void *a, const void *b)
{
    return (*(int *)a - *(int *)b);
}

void *fcfs(void *arg)
{
    int head = 0, total = 0;
    for (int i = 0; i < n; i++)
    {
        total += abs(head - req[i]);
        head = req[i];
    }
    res_fcfs = total;
    pthread_exit(NULL);
}

void *scan(void *arg)
{
    int sorted[10000];
    for (int i = 0; i < n; i++)
        sorted[i] = req[i];
    qsort(sorted, n, sizeof(int), compare);
    res_scan = max_cyl + (max_cyl - sorted[0]);
    pthread_exit(NULL);
}

void *cscan(void *arg)
{
    int sorted[10000];
    for (int i = 0; i < n; i++)
        sorted[i] = req[i];
    qsort(sorted, n, sizeof(int), compare);
    int max_req = sorted[n - 1];
    res_cscan = max_cyl * 2 + max_req;
    pthread_exit(NULL);
}

int main(int argc, char *argv[])
{
    if (argc != 2)
        return 1;
    FILE *f = fopen(argv[1], "r");
    if (!f)
        return 1;

    fscanf(f, "%d", &max_cyl);
    while (fscanf(f, "%d", &req[n]) != EOF)
        n++;
    fclose(f);

    pthread_t t1, t2, t3;
    pthread_create(&t1, NULL, fcfs, NULL);
    pthread_create(&t2, NULL, scan, NULL);
    pthread_create(&t3, NULL, cscan, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    pthread_join(t3, NULL);

    printf("FCFS: %d\nSCAN: %d\nC-SCAN: %d\n", res_fcfs, res_scan, res_cscan);

    int best = res_fcfs;
    if (res_scan < best)
        best = res_scan;
    if (res_cscan < best)
        best = res_cscan;
    printf("Optimal movement is: %d\n", best);

    return 0;
}