package udacityguessthemoviegame;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Edmilson
 */
public class Game {
    private String selectedMovie;
    private char[] updatedHiddenMovieName;
    
    private String selectMovie() throws Exception{
        int movieQuantity = 0;
        String [] moviesName = new String[100]; //No máximo 100 filmes
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNextLine()){
            moviesName[movieQuantity] = scanner.nextLine();
            movieQuantity ++;
        }
        int choosenOne = (int) (Math.random() * movieQuantity);
        selectedMovie = moviesName[choosenOne];
        return selectedMovie;
    }
    
    public String getSelectedMovie() throws Exception{
        return selectMovie();
    }
    
    public char[] hideMovieName(){
        char[] hiddenMovieName;
        hiddenMovieName = this.selectedMovie.toCharArray();
        for(int i=0;i<hiddenMovieName.length;i++){
            if(hiddenMovieName[i] != ' ')
                hiddenMovieName[i] = '_';
        }
        updatedHiddenMovieName = hiddenMovieName;
        return hiddenMovieName;
    }
    
    public char scanLetter(){
        char newletter;
        Scanner scanner = new Scanner(System.in);
        newletter = scanner.next(".").charAt(0);
        return Character.toLowerCase(newletter);
    }
    
    public boolean verifyLetter(char letter){
        boolean isLetterGuessed = false;
        int letterIndex = selectedMovie.indexOf(letter);
        while(letterIndex != -1){
            updatedHiddenMovieName[letterIndex] = letter;
            letterIndex = selectedMovie.indexOf(letter, letterIndex + 1);
            isLetterGuessed = true;
        }
        System.out.print("You are guessing:");
        System.out.println(updatedHiddenMovieName);
        return isLetterGuessed;
    }
    
    public boolean verifyMovie(){
        boolean isMovieGuessed = false;
        if(selectedMovie.equals(new String(updatedHiddenMovieName))){
            isMovieGuessed = true;
        }
        return isMovieGuessed;
    }
}

