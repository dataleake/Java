import java.util.*;

public class game{

    public static Scanner selection = new Scanner(System.in);

    // Instances
    String title;

    // Constructor
    public game(String gameTitle) {
        title = gameTitle;
    }

    public static void gameSelection() {

        // Create a Scanner object
        //Scanner selection = new Scanner(System.in); 

        // Create different games
        game hangman = new game("Hangman");
        game scramble = new game("Scramble");
        game riddle = new game("Riddle");

        // Listing game options
        System.out.println("What game would you like to play?");
        
        // Title array
        String[] nameArray = new String[]{hangman.title, scramble.title, riddle.title};

        // Loop to display game options
        for(int i = 0; i < nameArray.length;i++){
            int viewI = i + 1;
            System.out.println("["+ viewI +"] "+nameArray[i]);
        }

        // Read user input
        int gameChoice = selection.nextInt();  
    
        System.out.println(nameArray[gameChoice-1] + " it is!");
    }

    // Main method
    public static void main(String[] args) {

        gameSelection();      


    }
}