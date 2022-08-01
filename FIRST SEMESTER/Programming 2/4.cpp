/* 
    Submitted by:
    BSIT 2-5
    Guzon, Jeanne Margaret L. 
*/
 
#include <stdio.h>
#include <stdlib.h>

// Write a program in C to create and display a circular linked list

struct node   {
	int data;
	   struct node *prev;
	   struct node *next;
}*HEAD;

void create_list(int n){
	//CREATING LIST
	int i, data;
	struct node *new_node, *prev_node;
	
	if (n >= 1){
		HEAD = (struct node*)malloc(sizeof(struct node));         //create a head node
		
		printf("\nInput the data for node 1: ");
	    scanf("%d", &data);
	    HEAD->data = data;                                        // assign value for the head node
	    
	    HEAD->next = NULL;                                        // make sure the next pointer is null
	    prev_node = HEAD;                                         // prev_node points to the head node
	    
		for(i = 2; i <= n; i++){
	    	new_node = (struct node*)malloc(sizeof(struct node)); // create a new node
	    	printf("\nInput the data for node %d: ", i); 
	        scanf("%d", &data);                                  
	        
	        new_node->data = data;                                // assign value
	        new_node->next = NULL;                                // make sure the next pointer is null
	        
	        prev_node->next = new_node;                           // connect the previous address to the current address
	        prev_node = new_node;                                 // make the current code the previous code
		}
		prev_node->next = HEAD;                                   // now connect the head to the tail to make it circular
	}
}

void display_list(){
	// DISPLAYING LIST
	struct node *CURRENT;
	int n = 1;
	
	if(HEAD == NULL){
		printf("List is not found.");
	}
	
	else{
		CURRENT = HEAD;
		printf("Data entered in the list are: \n");
		
		do {
			printf(" Data %d = %d\n", CURRENT->data);

            CURRENT = CURRENT->next;
            n++;
            
            printf("\n");
		} while (CURRENT != HEAD);
	}
}

int main(){
	int n;
	
	printf("Input the number of nodes: ");
	scanf("%d", &n);
	
    create_list(n);
    display_list();
	return 0;
}
