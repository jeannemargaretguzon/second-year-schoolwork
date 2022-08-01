/* 
    Submitted by:
    BSIT 2-5
    Guzon, Jeanne Margaret L. 
*/
 
#include<stdio.h>

// Write a program in C to sort elements of array in ascending order.

int main() {
// getting the array    
    int i = 0; 
	int size = 0;
	
    printf("Input the number of elements to be stored in the array : ");
    scanf("%d", &size);
    
    int array[size];
    printf("Input %d elements in the array:\n", size);
    for(i = 0; i < size; i++)  {
    	printf("element - %d = ", i);
        scanf("%d", &array[i]);
    };
	
// create an temporary variable for sorting
    int temp = 0;
    int j = 0;

// comparing values
    for (i = 0; i < size; i++)        { // for the 1st element of array
 	   for (j = i + 1; j < size; j++ ){ // for the 2nd element of array
		   if (array[i] > array[j])   {
    		    temp = array[i];        
    		    array[i] = array[j];    // switch the larger element to back
    		    array[j] = temp;
			}
        }
	}
	
	printf("Elements of array in sorted ascending order: \n");
    for(i = 0; i < size; i++)         {
        printf("%d\t", array[i]);
    };
}



