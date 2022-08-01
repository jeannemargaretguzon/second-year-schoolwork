/* 
    Submitted by:
    BSIT 2-5
    Guzon, Jeanne Margaret L. 
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
    Write a program to add two integer linked lists. Design your solution so that the same
    logic adds the first numbers (units� position) as well as the rest of the number. In other
    words, do not have special one-time logic for adding the units� position.
*/

struct node
{
    int value;
    struct node *next;
};

struct node *A1, *A2, *A3, *A4, *A5;
struct node *B1, *B2, *B3, *B4, *B5;
struct node *result_1, *result_2, *result_3, *result_4, *result_5;

struct node *HEAD, *temp;

void display_array(){
	temp = HEAD;
    while (temp != NULL)
    {
        printf("|%d|<--", temp->value);
        temp = temp->next;
    }
    printf("\n");
}

array_1() {
    A1 = (struct node *)malloc(sizeof(struct node));
    A1->value = 4;
    A1->next = NULL;
    HEAD = A1;

    A2 = (struct node *)malloc(sizeof(struct node));
    A2->value = 3;
    A2->next = NULL;
    A1->next = A2;

    A3 = (struct node *)malloc(sizeof(struct node));
    A3->value = 1;
    A3->next = NULL;
    A2->next = A3;

    A4 = (struct node *)malloc(sizeof(struct node));
    A4->value = 3;
    A4->next = NULL;
    A3->next = A4;

    A5 = (struct node *)malloc(sizeof(struct node));
    A5->value = 5;
    A5->next = NULL;

}
array_2(){
    B1 = (struct node *)malloc(sizeof(struct node));
    B1->value = 1;
    B1->next = NULL;
    HEAD = B1;

    B2 = (struct node *)malloc(sizeof(struct node));
    B2->value = 7;
    B2->next = NULL;
    B1->next = B2;

    B3 = (struct node *)malloc(sizeof(struct node));
    B3->value = 2;
    B3->next = NULL;
    B2->next = B3;
}

addition(){
    result_1 = (struct node *)malloc(sizeof(struct node));
    result_1->value = A1->value;                                 // nothing to add because there's no counterpart
    result_1->next = NULL;
    HEAD = result_1;

    result_2 = (struct node *)malloc(sizeof(struct node));
    result_2->value = A2->value;                                 // nothing to add because there's no counterpart                       
    result_2->next = NULL;
    result_1->next = result_2;

    result_3 = (struct node *)malloc(sizeof(struct node));
    result_3->value = (A3->value + B1->value);                    
    result_3->next = NULL;
    result_2->next = result_3;

    result_4 = (struct node *)malloc(sizeof(struct node));
    result_4->value = (A4->value + B2->value);
    result_4->next = NULL;
    result_3->next = result_4;

    result_5 = (struct node *)malloc(sizeof(struct node));
    result_5->value = (A5->value + B3->value);
    result_5->next = NULL;
    result_4->next = result_5;

    if (result_5->value > 9)
    {
        result_5->value = 0;
        result_4->value = result_4->value + 1;
    }
    
    if (result_4->value > 9)  {
        result_4->value = 0;
        result_3->value = result_3->value + 1;
    }
}

int main()  {
    array_1();
    printf("\nElements in First Array :  ");
    display_array();

    printf("\n");

    array_2();
    printf("\nElements in Second Array :+");
    display_array();

    addition();
    printf("\n\t\tResult:     ");
    display_array();

    return 0;
}



