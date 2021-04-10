# Java Primitives and Control Flow

## you will write these methods for this lab 
**Pluralize**
- This method accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.
>
> ***Example output :***
- I own 1 dog.
- I own 2 cats.
- I own 0 turtles.
#
**Flipping Coins**
>
this method accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

flipNHeads(1)
>
> ***Example output :***

- tails
- heads
- tails
- tails
- heads
- heads
- It took 6 flips to flip 2 heads in a row.
 #
**Command Line Clock**
>
this method uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

Zero-pad single digit numbers as strings so the timestamp is always the same number of characters.
> ***Example output :***

- 12:10:58
- 12:10:59
- 12:11:00



