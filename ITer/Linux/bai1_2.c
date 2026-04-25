#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main(int argc, char *argv[])
{
    if (argc != 4)
        return 1;
    int max_cyl = atoi(argv[1]);
    int num_accesses = atoi(argv[2]);
    FILE *f = fopen(argv[3], "w");
    if (!f)
        return 1;
    fprintf(f, "%d\n", max_cyl - 1);
    srand(time(NULL));
    for (int i = 0; i < num_accesses; i++)
    {
        fprintf(f, "%d\n", rand() % max_cyl);
    }
    fclose(f);
    return 0;
}