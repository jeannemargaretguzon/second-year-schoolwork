/* 
    Submitted by:
    BSIT 2-5
    Guzon, Jeanne Margaret L. 
*/
 
#include<stdio.h>

// Write a program in C to delete an element at desired position from an array.

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
    
// create an temporary variables for deletion
    int deleted = 0;
    
	do  {
	    printf("Input the position where to delete: ");
        scanf("%d", &deleted);
    } while (deleted < 0 || deleted > size);
    
// comparing values
    for (i = 0; i < size; i++)  {	  
		if (deleted-1 == i){                // -1 for the starting i = 0    
			while (i < size) {        
			    array[i] = array[i+1];     // moving the next items left
				
				i++;
		    }
		}
	}
	
	//array[size - 1] = 0;                    // making the last item empty or 0
	
	printf("The new list is : ");
    for(i = 0; i < size - 1; i++)         {  // no need to display the last item
        printf("%d\t", array[i]);
    };
}



