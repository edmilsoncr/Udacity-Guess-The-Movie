package udacityguessthemoviegame;

/**
 *
 * @author Edmilson
 */
public class Main {
    
    public static void main(String[] args) throws Exception{
        Game game = new Game();
        String selectedMovie = game.getSelectedMovie();
        System.out.println(selectedMovie);
        
        char[] hiddenMovieName = game.hideMovieName();
        System.out.println("Welcome to 'GUESS THE MOVIE' game!!!");
        System.out.print("You are guessing:");
        System.out.println(hiddenMovieName);
        
        int wrongLetters = 0;
        boolean isMovieGuessed = false, isLetterGuessed;
        char newLetter;
        char[] wrongLettersList = new char[10];
        while(wrongLetters < 10 && !isMovieGuessed){
            System.out.print("You have guessed (" + wrongLetters + ") wrong letters: ");
            System.out.println(wrongLettersList);
            System.out.print("Guess a letter: ");
            newLetter = game.scanLetter();
            
            isLetterGuessed = game.verifyLetter(newLetter);
            if(!isLetterGuessed){
                wrongLettersList[wrongLetters] = newLetter;
                wrongLetters++;
            }
            
            if(wrongLetters == 10){
                System.out.println("You have guessed (" + wrongLetters + ") wrong letters");
                System.out.println("You loose!\nThe correct movie title is: '" + selectedMovie + "'");
            }
            
            isMovieGuessed = game.verifyMovie();
            if(isMovieGuessed){
                System.out.println("You win!\nYou have guessed: '" + selectedMovie + "' correctly");
            }
            
            
        }       
    }   
}
