# Udacity-Guess-The-Movie
Project developed for Udacity course: Object Oriented Programming in Java

The rules of the game are simple, the computer randomly picks a movie title, and shows you how many letters it's made up of. Your goal is to try to figure out the movie by guessing one letter at a time.

If a letter is indeed in the title the computer will reveal its correct position in the word, if not, you lose a point. If you lose 10 points, game over!

BUT the more correct letters you guess the more obvious the movie becomes and at a certain point you should be able to figure it out.

The program will randomly pick a movie title from a text file that contains a large list of movies.

You can download a sample text file to play with from the resources tab or create your own list of movie titles.

Once the computer picks a random title, it will display underscores "_" in place of the real letters, thereby only giving away the number of letters in the movie title.

Then it will wait for the player to enter their first letter guess.

If the letter was indeed in the word, the underscores "_" that match that letter will be replaced with the correct letter revealing how many letters have matched their guess and where they are.

If their guess isn't in the movie title, then the output will display the same output as the previous step as well as any letters that have been previously guessed wrong.

Eventually, if the player manages to guess all the letters in the movie title correctly before they lost 10 points, they win



## Project instructions:

1. Write some code that will simply read the movie list and display the whole list.
2. Then add to your code to randomly pick one movie and display that title only.
3. Then convert its letters to underscores (_) and display that instead, and so on.
4. Once you've got that part done start reading the user's input and search for it in the title.
5. Work on revealing the correct letters and displaying them.
6. Add the logic to keep track of wrong letters so they don't lose points for guessing the same letter twice.
7. After that, you can keep track of how many wrong guesses and end the game if they lose.
8. Finally, detect when they have guessed all the letters and let them know they've won!
