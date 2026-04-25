#include <stdio.h>
#include <stdlib.h>
int page_table[256];
int tlb_page[16];
int tlb_frame[16];
int tlb_idx = 0;
char physical_memory[65536];
int next_frame = 0;
int main(int argc, char *argv[])
{
    if (argc != 2)
        return 1;
    FILE *address_file = fopen(argv[1], "r");
    FILE *backing_store = fopen("BACKING_STORE.bin", "rb");
    if (!address_file || !backing_store)
        return 1;
    for (int i = 0; i < 256; i++)
        page_table[i] = -1;
    for (int i = 0; i < 16; i++)
        tlb_page[i] = -1;
    int logical_address;
    while (fscanf(address_file, "%d", &logical_address) != EOF)
    {
        int offset = logical_address & 255;
        int page_num = (logical_address >> 8) & 255;
        int frame_num = -1;
        for (int i = 0; i < 16; i++)
        {
            if (tlb_page[i] == page_num)
            {
                frame_num = tlb_frame[i];
                break;
            }
        }
        if (frame_num == -1)
        {
            frame_num = page_table[page_num];
            if (frame_num == -1)
            {
                fseek(backing_store, page_num * 256, SEEK_SET);
                fread(physical_memory + (next_frame * 256), 1, 256, backing_store);
                frame_num = next_frame;
                page_table[page_num] = frame_num;
                next_frame++;
            }
            tlb_page[tlb_idx] = page_num;
            tlb_frame[tlb_idx] = frame_num;
            tlb_idx = (tlb_idx + 1) % 16;
        }
        int physical_address = (frame_num << 8) | offset;
        signed char value = physical_memory[physical_address];
        printf("Virtual address: %d Physical address: %d Value: %d\n",
               logical_address, physical_address, value);
    }
    fclose(address_file);
    fclose(backing_store);
    return 0;
}