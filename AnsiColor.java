// package LevelUp;

public class AnsiColor{
    /*
        White: (char)27 + "[00m"
        Black: (char)27 + "[0;30m"
        Dark Gray: (char)27 + "[1;30m"
        Gray: (char)27 + "[0;37m"
        Brown: (char)27 + "[0;33m"
        Clear: (char)27 + "[2J"
        Red: (char)27 + "[0;31m"
        Light Red: (char)27 + "[1;31m"
        Yellow: (char)27 + "[1;33m"
        Green: (char)27 + "[0;32m"
        Light Green: (char)27 + "[1;32m"
        Cyan: (char)27 + "[0;36m"
        Light Cyan: (char)27 + "[1;36m"
        Blue: (char)27 + "[0;34m"
        Light Blue: (char)27 + "[1;34m"
        Purple: (char)27 + "[0;35m"
        Light Purple: (char)27 + "[1;35m"
    */

    AnsiColor(){ }

    public void ansiColor(String statement, String color){
        if(color == "white" || color == "White"){
            System.out.println((char)27 + "[00m" + statement + (char)27 + "[00m");
        } else if (color == "clear" || color == "Clear"){
            System.out.println((char)27 + "[2J" + statement + (char)27 + "[00m");
        } else if(color == "light cyan" || color == "Light cyan" || color == "light Cyan" || color == "Light Cyan"){
            System.out.println((char)27 + "[1;36m" + statement + (char)27 + "[00m");
        } else if(color == "yellow" || color == "Yellow"){
            System.out.println((char)27 + "[1;33m" + statement + (char)27 + "[00m");
        }
    }

    // White
    public void white(String statement){
        System.out.println((char)27 + "[00m" + statement + (char)27 + "[00m");
    }
    public void white(String statement, String modifier){
        if(modifier == "clear"){
            System.out.println((char)27 + "[2J" + (char)27 + "[00m" + statement + (char)27 + "[00m");
        }
    }

    // Black
    public void black(String statement){
        System.out.println((char)27 + "[0;30m" + statement + (char)27 + "[00m");
    }
    public void black(String statement, String modifier){

    }

    // Dark Grey
    public void darkGrey(String statement){
        System.out.println((char)27 + "[1;30m" + statement + (char)27 + "[00m");
    }
    public void darkGrey(String statement, String modifier){

    }

    // Grey
    public void grey(String statement){
        System.out.println((char)27 + "[0;37m" + statement + (char)27 + "[00m");
    }
    public void grey(String statement, String modifier){

    }

    // Brown
    public void brown(String statement){
        System.out.println((char)27 + "[0;33m" + statement + (char)27 + "[00m");
    }
    public void brown(String statement, String modifier){

    }

    // Red
    public void Red(String statement){
        System.out.println((char)27 + "[0;31m" + statement + (char)27 + "[00m");
    }
    public void Red(String statement, String modifier){

    }

    // Light Red
    public void lightRed(String statement){
        System.out.println((char)27 + "[1;31m" + statement + (char)27 + "[00m");
    }
    public void lightRed(String statement, String modifier){

    }

    // Yellow
    public void yellow(String statement){
        System.out.println((char)27 + "[1;33m" + statement + (char)27 + "[00m");
    }
    public void yellow(String statement, String modifier){

    }

    // Green
    public void Green(String statement){
        System.out.println((char)27 + "[0;32m" + statement + (char)27 + "[00m");
    }
    public void Green(String statement, String modifier){

    }

    // Light Green
    public void lightGreen(String statement){
        System.out.println((char)27 + "[1;32m" + statement + (char)27 + "[00m");
    }
    public void lightGreen(String statement, String modifier){

    }

    // Cyan
    public void cyan(String statement){
        System.out.println((char)27 + "[0;36m" + statement + (char)27 + "[00m");
    }
    public void cyan(String statement, String modifier){

    }

    // Light Cyan
    public void lightCyan(String statement){
        System.out.println((char)27 + "[1;36m" + statement + (char)27 + "[00m");
    }
    public void lightCyan(String statement, String modifier){

    }

    // Blue
    public void blue(String statement){
        System.out.println((char)27 + "[0;34m" + statement + (char)27 + "[00m");
    }
    public void blue(String statement, String modifier){

    }

    // Light Blue
    public void lightBlue(String statement){
        System.out.println((char)27 + "[0;34m" + statement + (char)27 + "[00m");
    }
    public void lightBlue(String statement, String modifier){

    }

    // Purple
    public void purple(String statement){
        System.out.println((char)27 + "[0;35m" + statement + (char)27 + "[00m");
    }
    public void purple(String statement, String modifier){

    }

    // Light Purple
    public void lightPurple(String statement){
        System.out.println((char)27 + "[1;35m" + statement + (char)27 + "[00m");
    }
    public void lightPurple(String statement, String modifier){

    }
}

