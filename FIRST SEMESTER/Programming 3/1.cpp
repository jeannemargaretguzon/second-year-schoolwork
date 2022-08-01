#include<stdio.h>
#define STACKSIZE 50

/*Write a program that will continuously accept a character 
and store in a stack until letter ‘Z’ is entered. */

int top = -1;		                                      // for the top element of the stack checking
char stack[STACKSIZE];                                    // using array to create a stack with limit of 50 values

void push(char letter) {
	/* function to push/store the letter in the stack */

	if (top == STACKSIZE-1) {                             // checking if its possible to insert
		printf("\nThe stack is full! Cannot insert.");        
	}
	else {
		top++;                             //  add 1 for the new value
	    stack[top] = letter;               //  replace the previous top with the new value
    }		
}

void display_contents(){
	/* function to display all the contents in the stack */
	if (top == -1) {
		printf("\nThe stack is empty!");
	}
	
	else{
		int i;
	    printf("\nDisplaying the contents of the stack\n");
	    
	    for(int i=0; i < STACKSIZE; i++) {
		    printf("%c", stack[i]);
	    }	
	}
}

int main(){
	char letter; // the character that will be stored
	
	while(letter != 'Z')   {  	
	    printf("\nEnter the desired character:");
	    scanf("%c", &letter);
	    push(letter);
	    printf("\n");
    }
	
	display_contents();
	
	return 0;
}
