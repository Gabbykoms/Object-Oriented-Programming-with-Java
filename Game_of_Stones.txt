import java.util.Scanner;
public class Stones_Games{
    public static void main(String[] args){
        //This block of code welcomes the players to the game and gives them an overview of the whole game
        System.out.println("Welcome to the world's most advanced Stones Games after the age of stone men");
        System.out.println("In this game, the two players will choose from an available number of stones.");
        System.out.println("In the end, the one with an odd number wins");

        // This block of code is where i declare my variables and asks the players the number of stones they want to start with
        int totalStones, player1pick1 =0 , player2pick1 = 0, player1total = 0, player2total = 0,selectRange, remainder1;
        String player1, player2; 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many stones do you want to start with?:");
        totalStones = keyboard.nextInt();

        // This while loop ensures the players start with an odd number 
    while (totalStones <= 0 || totalStones%2 == 0){
            System.out.println("You can not start with 0 or a negative number");
            System.out.println("How many stones do you want to start with?:");
            totalStones = keyboard.nextInt();
        }
        
        // I take the names of the players so I can call them by name
        System.out.println("First player enter your name");
        player1 = keyboard.next();
        System.out.println("Second player enter your name");
        player2 = keyboard.next();

        // I display the total number of stones each player has and implores the first player to pick 
        System.out.println(player1 + " you have " + player1pick1 + " stones");
        System.out.println(player2 + " you have " + player2pick1 + " stones");
        System.out.println("There are " +totalStones +" stones available ");
        System.out.println(player1 + " make your pick from 1 and "+ totalStones/2 );
        player1pick1 = keyboard.nextInt();
        
        //This while loop ensures that the first player picks no more than they are allowed to take.
        while(player1pick1 <= 0 || player1pick1 > totalStones/2){
            System.out.println("You can not pick the entered number of stones");
            System.out.println("Pick a number from 1 and "+ totalStones/2);
            player1pick1 = keyboard.nextInt();
        }
        // I update the first player's total number of stones and display the total number of stones each has as well as the remainder
              player1total += player1pick1;
       System.out.println(player1 + " you have a total of " + player1total + " stones");
       System.out.println(player2 + " you have a total of " + player2total + " stones");
       remainder1 = totalStones - player1pick1;
       System.out.println("the remaining stones is " + remainder1);

       // The do -- while loop ensures that at least the program runs once and repeatedly asks for players' inputs
        do{
            if(remainder1 > 0){
            if (remainder1 > 2*player1pick1){
                System.out.println(player2+ " make your pick from 1 and " + 2*player1pick1 );
    } 
            else {
                System.out.println(player2 + " make your pick from 1 and "+ remainder1);
            }

            //I created the selectRange variable to check the remainder at each iteration stage so
            // that the player is either instructed to choose from 1 to 2times the initial player's pick or the remainder 
            selectRange = remainder1>2*player1pick1?2*player1pick1:remainder1;
           player2pick1 = keyboard.nextInt();
           while(player2pick1>selectRange || player2pick1<=0){
            System.out.println(player2 + " You can not pick outside the provided range 1 to "+selectRange);
            player2pick1 = keyboard.nextInt();
           }         
       
                player2total += player2pick1;           
           System.out.println(player2 + " you have a total of " + player2total + " stones");
           System.out.println(player1 + " you have a total of " + player1total + " stones");
           remainder1 -= player2pick1;
           System.out.println("the remaining stones is " + remainder1);
        }
           
           if( remainder1 > 0){
           if (remainder1 > 2*player2pick1){
            System.out.println( player1 +" make your pick from 1 and " + 2*player2pick1);
           }
           else{
            System.out.println(player1 +" make your pick from 1 and " + remainder1);
           }

           player1pick1 = keyboard.nextInt();
           selectRange=remainder1>2*player2pick1?2*player2pick1:remainder1;

           while (player1pick1>selectRange || player1pick1<=0){ 
            System.out.println("You can not pick outside the given range");
            System.out.println(player2 + " You can not pick outside the provided range 1 to "+selectRange);
            player1pick1 = keyboard.nextInt();
           }
           player1total += player1pick1;
           System.out.println(player1 + " you have a total of " + player1total + " stones");
           System.out.println(player2 + " you have a total of " + player2total + " stones");
           remainder1 -= player1pick1;
           System.out.println("the remaining stones is " + remainder1);
        }
        }
        while (remainder1 != 0);
        // This line of code runs when the stones are finished, checks and displays the one with odd number of stones as winner               
        if ((player1total)%2 != 0){
            System.out.println("Congratulations " + player1);
} 
            else {
                  System.out.println("Congratulations " + player2);
}
        }
    }







    
