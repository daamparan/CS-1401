#include <stdio.h>
#include <stdlib.h>
#include "tokenizer.h"
#include "history.h"
#define MAX 100

int main()
{
  /*Gather user input to use*/
  char userInput[100];
  List head;
  char **rec;
  char *t;
  init_history(&head);
  int count = 0; /*for the words that we have added*/
  int x = 0;
  
  printf(">");
  while (userInput[0] != '\n') {
    fgets(userInput, MAX, stdin);
    t = &userInput[0];
    x = *t - '0';
    /*First we check incase its number to attain history*/
    if (x <= count){
      printf("Place in the Link List: %d\n", get_history(&head, x));
    }
    /*Then if the user enters for the history*/
    else if (*t == 'h') {
      printf("Here we have the history, the ID's of all we have\n");
      print_history(&head);
    }
    else{
      count++;
      add_history(&head, userInput, count);
      rec = tokenize(userInput);
      printf("Tokenized Result: \n\n");
      print_tokens(rec);
    }
    printf(">");
  }
  return 0;
}

