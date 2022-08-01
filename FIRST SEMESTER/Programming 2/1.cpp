/* 
    Submitted by:
    BSIT 2-5
    Guzon, Jeanne Margaret L. 
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* Write a program that will initally create an UNSORTED list containing the following and then run the program:
    Mitch
	Diane
	Jack
	Robbie
	Katherine 
*/

struct node {
	char name[10];
		struct node *next;
}*HEAD, *temp, *temp1;

void display_list(struct node *HEAD){                                    // printing the whole list
    	printf("\t\t\t Memory Address\n");    
	do {
	    printf("\t%s\t\t%p", HEAD->name, &HEAD->name);
	    HEAD = HEAD->next;
	    printf("\n");
    } while (HEAD != NULL);
}

void insert_morrie(struct node *new_node, struct node *prev_node){       // inserting morrie
	new_node = (struct node*) malloc(sizeof(struct node)); 
	if (new_node == NULL) {
	    printf("Failed to insert Morrie.");                             // to alert if the insertion failed
	}
	strcpy(new_node->name, "Morrie");                           
	new_node->next = NULL; 
	prev_node->next = new_node;                                   
	prev_node = new_node;
}

void delete_jack(struct node *HEAD, struct node *prev_node){          // deleting jack	
	int address, i=1;
    temp = HEAD;
	printf("\n\n\t Jack's Memory Location: ");
    scanf("%d", &address);
	for(i=1; i < address-1; i++) {
		temp1 = temp1->next;
	}
	temp1 = temp->next;
	temp = temp1->next;
	free(temp);
}
	
int main(){
	int i;
    struct node *prev_node, *new_node;
    
    HEAD = NULL;
    HEAD = (struct node*) malloc(sizeof(struct node)); 
	strcpy(HEAD->name, "Mitch");                          
	HEAD->next = NULL;
	prev_node = HEAD;
	
    new_node = (struct node*) malloc(sizeof(struct node)); 
	strcpy(new_node->name, "Diane");                          
	new_node->next = NULL; 
	prev_node->next = new_node;
	prev_node = new_node;
	
	new_node = (struct node*) malloc(sizeof(struct node)); 
	strcpy(new_node->name, "Jack");                           
	new_node->next = NULL; 
	prev_node->next = new_node;                                   
	prev_node = new_node;
	
	new_node = (struct node*) malloc(sizeof(struct node)); 
	strcpy(new_node->name, "Robbie");                          
	new_node->next = NULL; 
	prev_node->next = new_node;                                   
	prev_node = new_node;
	
	new_node = (struct node*) malloc(sizeof(struct node)); 
	strcpy(new_node->name, "Katherine");                            
	new_node->next = NULL; 
	prev_node->next = new_node;                                   
	prev_node = new_node;
	
	printf("Displaying Unsorted List\n");
	display_list(HEAD);
	
	insert_morrie(prev_node, new_node);
	printf("\nAfter adding Morrie\n");
	display_list(HEAD);
	
	delete_jack(HEAD, prev_node);
	printf("\nAfter removing Jack\n");
	display_list(HEAD);
}


