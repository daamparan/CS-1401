#ifndef _HISTORY_
#define _HISTORY_

typedef struct s_Item {
  int id;
  char *str;
  struct s_Item *next, *before;
} Item;

typedef struct s_List {
  struct s_Item root;
} List;

/* Initialize the linked list to keep the history. */
void init_history(List *head);

/*Aids with the incrementaiton of the history 
by rearranging pointers etc
*/
void addBefore(Item *itemBef, Item *toAdd);
/* Add a history item to the end of the list.
   List* list - the linked list
   char* str - the string to store
*/
void add_history(List *list, char *str, int i);

/* Retrieve the string stored in the node where Item->id == id.
   List* list - the linked list
   int id - the id of the Item to find */
int get_history(List *list, int i);

/*Print the entire contents of the list. */
void print_history(List *list);

/*Free the history list and the strings it references. */
void free_history(List *list);

#endif
