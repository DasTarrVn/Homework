#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int compare(const void *a, const void *b)
{
    return (*(int *)a - *(int *)b);
}
int main(int argc, char *argv[])
{
    if (argc != 3)
        return 1;
    char *algo = argv[1];
    FILE *f = fopen(argv[2], "r");
    if (!f)
        return 1;
    int max_cyl;
    fscanf(f, "%d", &max_cyl);
    int req[10000];
    int n = 0;
    while (fscanf(f, "%d", &req[n]) != EOF)
    {
        n++;
    }
    fclose(f);
    int total = 0;
    int head = 0;
    if (strcmp(algo, "FCFS") == 0)
    {
        for (int i = 0; i < n; i++)
        {
            total += abs(head - req[i]);
            head = req[i];
        }
    }
    else if (strcmp(algo, "SCAN") == 0)
    {
        int sorted[10000];
        for (int i = 0; i < n; i++)
            sorted[i] = req[i];
        qsort(sorted, n, sizeof(int), compare);
        total += abs(head - max_cyl);
        total += abs(max_cyl - sorted[0]);
    }
    else if (strcmp(algo, "C-SCAN") == 0)
    {
        int sorted[10000];
        for (int i = 0; i < n; i++)
            sorted[i] = req[i];
        qsort(sorted, n, sizeof(int), compare);
        if (n > 0)
        {
            total += abs(head - max_cyl);
            total += max_cyl;
            int max_req = sorted[n - 1];
            total += max_req;
        }
    }
    printf("Total head movement %s: %d\n", algo, total);
    return 0;
}