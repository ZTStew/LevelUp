import java.util.Scanner;
import java.util.HashMap;

import classes.*;


public class LevelTest {
    public static void main(String[] args){
        // narrator: light cyan
        // damage: red
        // optionals: yellow

        AnsiColor ansi = new AnsiColor();

        Boolean exitCheck = false;
        while(exitCheck == false){
            // introduces user to LevelUp, clears screen
            ansi.white("Welcome to LevelUp.", "clear");
            // ansi.ansiColor("", "light cyan");
            ansi.ansiColor("Enter what you want to do:", "light cyan");
            ansi.ansiColor("1) Start || 2) Controls || 3) Exit", "white");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if(input.indexOf("start") == 0 || input.indexOf("Start") == 0 || input.indexOf("1") == 0){
                StartGame();

            } else if(input.indexOf("controls") == 0 || input.indexOf("Controls") == 0 || input.indexOf("2") == 0){
                System.out.println("| - - - - - - - - - - - - - - - - - - - - |");
                System.out.println("Controls:");
                System.out.println("Just type out the option you want to select or input the numerical value of the option you want.");
                System.out.println("You may type: 'Exit' at any time to exit the program.");

            } else if(input.indexOf("exit") == 0 || input.indexOf("Exit") == 0 || input.indexOf("quit") == 0 || input.indexOf("Quit") == 0 || input.indexOf("3") == 0){
                System.out.println("Exiting...");
                exitCheck = true;
            }
        }


    }

    private static void StartGame(){

        AnsiColor ansi = new AnsiColor();
        
        System.out.println("");
        ansi.ansiColor("Your story starts in the outer territory of the kingdom.", "light cyan");
        ansi.ansiColor("Your past life forgotten, you must now make a new name for yourself. Speaking of which, what is your name?", "light cyan");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Human user = new Human(input);

        Boolean yesNo = false;
        while(yesNo == false){
            ansi.ansiColor(user.getName() + ", is that right?", "light cyan");
            ansi.ansiColor("(y/n)", "yellow");
            input = scanner.nextLine();
            if(input.indexOf("y") == 0){
                yesNo = true;
            } else {
                ansi.ansiColor("Then What Is Your Name?", "light cyan");
                input = scanner.nextLine();
                user.setName(input);
            }
        }

        System.out.println((char)27 + "[1;36m" + "Great! Your name is " + user.getName() + "! You are just a simple farmer a pesant, there is nothing special about you, but you have always felt you were destanded for more.");
        System.out.println("Your goal is simple, become either famous or infamous. The path to glory will be hard and will take time.");
        System.out.println("With age a constant threat, you must work fast to achieve your goals." + (char)27 + "[00m");

        Boolean gameLoop = true;
        while(gameLoop){
            System.out.println("\n");
            System.out.println(user.getDate() + " || " + user.getStats());
            // user.showLevelTables();
            System.out.println("What would you like to do?");
            gameLoop = user.action();
            // input = scanner.nextLine();

            // if(input.indexOf(""))

            
            // user.setGold(user.getGold() + 1);
            // user.setExp(user.getExp() + 5);
        }
    }
}
