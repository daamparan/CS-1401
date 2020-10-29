#include "tokenizer.h"
#include <stdlib.h>
#include <stdio.h>

int space_char(char c) {
  if (c == ' ' || c == '\t' || c == '\n') {
    return 1;
  }
  return 0;
}

int non_space_char(char c) {
  if (c == ' ' || c == '\t' || c == '\n'){
    return 0;
  }
  return 1;
}

char *word_start(char *str) {
  char *t;
  int i = 0;

  while (space_char(*str)) {
    str++;
  }
  if (*str == '\n'){
    t = '\0';
  }
  else {
    t = &*str;
  }
  return t;
}

char *word_end(char *str) {
  int i = 0;
  char *t;

  while (space_char(*str)) {
    str++;
}
  if (*str == '\n') {
    t = '\0';
    return t;
  }
  
  while (non_space_char(*str)) {
    str++;
  }
  t = &*str-1;
  return t;
}

int count_words(char *str) {
  int count = 0;
  int on = 1;
  int i = 0;

  while (on) {
    if (str[i] == '\n'){
      on = 0;
    }
    else if (non_space_char(str[i]) && space_char(str[i+1])){
      count++;
    }
    i++;
  }
  return count;
}

char *copy_str(char *inStr, short len) {
  char *t = (char*)malloc(len+1*(sizeof(char)));/* +1 to store the \0 at the end*/
  int i = 0;
  char *toRet;
  toRet = t;
  
  while (i <= len) { /*account extra empty */
    *t = *inStr;
    *t++;
    inStr++;
    i++;
  }
  *t = '\0';
  return toRet;
}

char **tokenize(char *str) {
  /*first find all we can about the passed string*/
  int len = count_words(str);
  char *dummy;
  char *dummy2;
  char **toRet;
  char **t = (char**)malloc(len+1*(sizeof(char*)));
  
  toRet = t;
  int len2 = 0;
  int i = 0;

  dummy = word_start(str);
  /*word start is done twice to attain first char and then the char
   of the following string if their is one */
  while (len) {
    dummy = word_start(dummy);
    len2 = ((word_end(dummy)) - dummy)+1;
    dummy2 = copy_str(dummy, len2);
    *t = dummy2;
    i++;
    len--;
    t++;
    dummy = word_end(dummy); /*go to the last char of the first word*/
    dummy++;/*start one place after the last char*/
  }
  *t = '\0';
  return toRet;
}

void print_tokens(char **tokens) {
  int i = 0;

  while (*tokens){
    printf("%s\n", *tokens);
    tokens++;
  }
}

void free_tokens(char **tokens) {
  int i = 0;

  while (*tokens != NULL){
    free(*tokens);
    tokens++;
  }
}


