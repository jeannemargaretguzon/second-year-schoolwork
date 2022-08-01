/* 
    Submitted by:
    BSIT 2-5
    Guzon, Jeanne Margaret L. 
*/

#include<stdio.h>

// Write a program in C to find the maximum and minimum element in an array.

int main() {
// getting the array    
    int i;
	int size;
	
    printf("Input the number of elements to be stored in the array : ");
    scanf("%d", &size);
    
    int array[size];
    printf("Input %d elements in the array:\n", size);
    for(i = 0; i < size; i++)  {
    	printf("element - %d = ", i);
        scanf("%d", &array[i]);
    };
	
// let 1st element be the min and max temporarily
    int max = array[0]; 
    int min = array[0];

// comparing values
    for (i = 1; i < size; i++)  {	
		if (array[i] > max)
    		max = array[i];	
		    else if (array[i] < max)
		        min = array[i];
	}
	
	printf("Maximum element is : %d", max);
	printf("\nMinimum element is : %d\n", min);
}



