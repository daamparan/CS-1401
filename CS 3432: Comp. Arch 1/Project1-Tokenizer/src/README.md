Project 1: Tokenizer
====================
# Instructions:
You should document your tokenizer in this file.

This file is written in the refreshingly simple 'markdown' text
formatting language.

To learn about text formatting using markdown we encourage you to examine
- [../README.md](../README.md)
- the online [Markdown Guide](https://www.markdownguide.org/).

#simpleUI Instructions:
simpleUI tackles on the first milestone of the Tokenizer project.
That is the ability to read input, store it, and finally print it.

#Running simpleUI
To run simpleUI you need to simply compile simpleUI.c and run the a.out
file with NO needed input to begin.

#Entering Information
A ">" symbol is displayed which indicates you to begin typing when
ready. Once you press enter the word is shown back in the console as
a message. Once you enter as well it will prompt for another input.

#Exiting/Ending
To end the program simply press ctrl+c on windows and for other OS
give an invalid input similar to windows preferably.  

#MileStone 2
Completion of working with string methods, these can identify the beginning
char, end char, if it is a space or not space and to count the words in the
string

#For *word_end: The input string has got to have a space at the end before
entering, for example "My string ". Reason being is that the methods do not
identify the end '\0', As far as I can tell. I will update this fix as soon as
I find a solution.

#MileStone 3
Memory allocation methods are done. Tokenize makes tokens out of the user
input string, copy string, print, and free.
HOWEVER for some reason when i tokenize more than 4 words, when they are
priniting the address is given or pure gibberish such as '$$#@d'. So please
only input a string of length 3 to see it properly print things etc.

#Completion
Along with the source files an included make file is given that compiles the
files needed for simpleUI and it also has a clean that will remove unecessary
files.

#Work Arounds and Bugs
For the simpleUI it will run while you give it input, enter strings EXCEPT
those that begin with an h since it will run the print history from the Link
List. Also if you'd like to see the history of a particular spot, enter whole
numbers. For example 1,2,3. KEEP in mind however that the you must have added
strings before calling the history to see. To exit the loop make the loop
error, I personally use Ctrl+C twice.

Last note, the linklist has a bug which does not print the str that is held
within the individual items. It seems as if it is not storing them, I
attempted to re-check and re-write with no avail. 

