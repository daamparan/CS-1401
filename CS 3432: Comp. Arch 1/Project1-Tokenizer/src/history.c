#include "history.h"
#include <stdio.h>
#include <stdlib.h>

void init_history(List *head) {
  head->root.next = head->root.before = &head->root;
  head->root.id = 0; /*the root will hold the default 0 to end loops*/
  head->root.str = "Empty";
}

void addBefore(Item *itemBef, Item *toAdd){
  Item *bef = itemBef->before; /*pointer to the previous one*/

  toAdd->next = itemBef;
  toAdd->before = bef;
  bef->next = itemBef->before = toAdd;
}

void add_history(List *list, char *str, int i) {
  /*make the Ltiem to add*/
  Item *toAdd = malloc(sizeof(Item));

  toAdd->id = i;
  toAdd->str = str;
  printf("%s\n", toAdd->str);
  addBefore(&list->root, toAdd);
}

int get_history(List *list, int i){
  Item *pointer = &list->root; 
  
  while (pointer->id != i) {
    pointer = pointer->next;
  }
  /*assuming that we exit the loop because of a match*/
  return pointer->id;
}

void print_history(List *list){
  Item *pointer = &list->root;
  pointer = pointer->next;
  
  do {
    printf("%d\n", pointer->id);
    pointer = pointer->next;
  } while (pointer->id != 0);			    
}

void free_history(List *list){
  Item *pointer = &list->root;
  Item *temp;
  pointer = pointer->next;
  
  while (pointer->id != 0){
    temp = pointer;
    free(pointer);
    pointer = temp->next;
  }
  list->root.next = list->root.before = &list->root;
}
