#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct Block
{
    char pid[10];
    int start;
    int end;
    int is_free;
    struct Block *next;
} Block;
Block *head = NULL;
void init(int size)
{
    head = (Block *)malloc(sizeof(Block));
    strcpy(head->pid, "");
    head->start = 0;
    head->end = size - 1;
    head->is_free = 1;
    head->next = NULL;
}
void request(char *pid, int size, char strategy)
{
    Block *curr = head;
    Block *best_block = NULL;
    int best_size = -1;
    while (curr != NULL)
    {
        if (curr->is_free && (curr->end - curr->start + 1) >= size)
        {
            int curr_size = curr->end - curr->start + 1;
            if (strategy == 'F')
            {
                best_block = curr;
                break;
            }
            else if (strategy == 'B')
            {
                if (best_size == -1 || curr_size < best_size)
                {
                    best_size = curr_size;
                    best_block = curr;
                }
            }
            else if (strategy == 'W')
            {
                if (best_size == -1 || curr_size > best_size)
                {
                    best_size = curr_size;
                    best_block = curr;
                }
            }
        }
        curr = curr->next;
    }
    if (best_block != NULL)
    {
        Block *new_block = (Block *)malloc(sizeof(Block));
        strcpy(new_block->pid, best_block->pid);
        new_block->start = best_block->start + size;
        new_block->end = best_block->end;
        new_block->is_free = 1;
        new_block->next = best_block->next;
        strcpy(best_block->pid, pid);
        best_block->end = best_block->start + size - 1;
        best_block->is_free = 0;
        best_block->next = new_block;
    }
    else
    {
        printf("Error\n");
    }
}
void release(char *pid)
{
    Block *curr = head;
    while (curr != NULL)
    {
        if (!curr->is_free && strcmp(curr->pid, pid) == 0)
        {
            curr->is_free = 1;
            strcpy(curr->pid, "");
        }
        curr = curr->next;
    }
    curr = head;
    while (curr != NULL && curr->next != NULL)
    {
        if (curr->is_free && curr->next->is_free)
        {
            Block *temp = curr->next;
            curr->end = temp->end;
            curr->next = temp->next;
            free(temp);
        }
        else
        {
            curr = curr->next;
        }
    }
}
void compact()
{
    int curr_addr = 0;
    Block *curr = head;
    Block *new_head = NULL;
    Block *new_tail = NULL;
    int total_free = 0;
    while (curr != NULL)
    {
        if (!curr->is_free)
        {
            int size = curr->end - curr->start + 1;
            Block *b = (Block *)malloc(sizeof(Block));
            strcpy(b->pid, curr->pid);
            b->start = curr_addr;
            b->end = curr_addr + size - 1;
            b->is_free = 0;
            b->next = NULL;
            if (new_head == NULL)
            {
                new_head = b;
                new_tail = b;
            }
            else
            {
                new_tail->next = b;
                new_tail = b;
            }
            curr_addr += size;
        }
        else
        {
            total_free += curr->end - curr->start + 1;
        }
        curr = curr->next;
    }
    if (total_free > 0)
    {
        Block *b = (Block *)malloc(sizeof(Block));
        strcpy(b->pid, "");
        b->start = curr_addr;
        b->end = curr_addr + total_free - 1;
        b->is_free = 1;
        b->next = NULL;
        if (new_head == NULL)
        {
            new_head = b;
        }
        else
        {
            new_tail->next = b;
        }
    }
    curr = head;
    while (curr != NULL)
    {
        Block *temp = curr;
        curr = curr->next;
        free(temp);
    }
    head = new_head;
}
void stat()
{
    Block *curr = head;
    while (curr != NULL)
    {
        if (curr->is_free)
        {
            printf("Addresses [%d:%d] Unused\n", curr->start, curr->end);
        }
        else
        {
            printf("Addresses [%d:%d] Process %s\n", curr->start, curr->end, curr->pid);
        }
        curr = curr->next;
    }
}
int main(int argc, char *argv[])
{
    if (argc != 2)
        return 1;
    init(atoi(argv[1]));
    char cmd[20];
    while (1)
    {
        printf("allocator> ");
        scanf("%s", cmd);
        if (strcmp(cmd, "X") == 0)
        {
            break;
        }
        else if (strcmp(cmd, "RQ") == 0)
        {
            char pid[10];
            int size;
            char strategy[2];
            scanf("%s %d %s", pid, &size, strategy);
            request(pid, size, strategy[0]);
        }
        else if (strcmp(cmd, "RL") == 0)
        {
            char pid[10];
            scanf("%s", pid);
            release(pid);
        }
        else if (strcmp(cmd, "C") == 0)
        {
            compact();
        }
        else if (strcmp(cmd, "STAT") == 0)
        {
            stat();
        }
    }
    return 0;
}