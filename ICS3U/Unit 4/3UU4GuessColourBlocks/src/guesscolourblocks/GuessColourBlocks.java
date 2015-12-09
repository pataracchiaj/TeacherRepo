/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package guesscolourblocks;
import java.io.*;

public class GuessColourBlocks {
static int computerBlock1, computerBlock2, computerBlock3;//computer's blocks   1-red, 2-green, 3-blue, 4-yellow
    static int randNum;//will store computers random number
    static String firstGuess, secondGuess, thirdGuess;//stores users guesses
    static int guess1, guess2, guess3;//stores an integer value that correlates with the user's guess
    static int coloursCorrect;//will store the number of correct colours
    static int positionsCorrect;//will store the number of colours in the correct position



    public static void main (String args []) throws IOException
    {
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

    int tryAgain=1;//initializes first do-while loop

    System.out.println("Guess the Blocks");
    System.out.println("================");
    System.out.println();
    System.out.println("In this game, there are four different coloured blocks (red, green, blue, and yellow).");
    System.out.println("The computer hides three different coloured blocks from you. You then try to");
    System.out.println("guess the colours and the order of the blocks.");
    System.out.println();
    do{
    newGame();//the computer will generate three random blocks in this method
    System.out.println("Enter your first guess (R, G, B, Y):");
    firstGuess=br.readLine();//gets users guess
    firstGuess=firstGuess.toUpperCase();//makes user's guess uppercase

    //converts guess to digit code
    if(firstGuess.equals("R")){
    guess1=1;}
    if(firstGuess.equals("G")){
    guess1=2;}
    if(firstGuess.equals("B")){
    guess1=3;}
    if(firstGuess.equals("Y")){
    guess1=4;}

    System.out.println();
    System.out.println("Enter your second guess (R, G, B, Y):");
    secondGuess=br.readLine();//gets users guess
    secondGuess=secondGuess.toUpperCase();//makes user's guess uppercase

    if(secondGuess.equals("R")){
    guess2=1;}
    if(secondGuess.equals("G")){
    guess2=2;}
    if(secondGuess.equals("B")){
    guess2=3;}
    if(secondGuess.equals("Y")){
    guess2=4;}


    System.out.println();

    System.out.println("Enter your third guess (R, G, B, Y):");
    thirdGuess=br.readLine();//gets users guess
    thirdGuess=thirdGuess.toUpperCase();//makes user's guess uppercase

    if(thirdGuess.equals("R")){
    guess3=1;}
    if(thirdGuess.equals("G")){
    guess3=2;}
    if(thirdGuess.equals("B")){
    guess3=3;}
    if(thirdGuess.equals("Y")){
    guess3=4;}

    System.out.println();

    coloursCorrect = checkColoursCorrect(guess1, guess2, guess3);//will go to method checkColoursCorrect to find the number of colours the user got correct
    positionsCorrect = checkPositionsCorrect (guess1, guess2, guess3);//will go to method checkPositionsCorrect to find any correct positions

    //prints users guesses and computer's blocks

    System.out.println("Your Guesses: "+firstGuess+" "+secondGuess+" "+thirdGuess);

    //will store the first letter of the computer's colours
    String compColour1="";
    String compColour2="";
    String compColour3="";

    //converts random generated ints into associated first letter of the colour
    if(computerBlock1==1){
    compColour1="R";}
    if(computerBlock1==2){
    compColour1="G";}
    if(computerBlock1==3){
    compColour1="B";}
    if(computerBlock1==4){
    compColour1="Y";}

    if(computerBlock2==1){
    compColour2="R";}
    if(computerBlock2==2){
    compColour2="G";}
    if(computerBlock2==3){
    compColour2="B";}
    if(computerBlock2==4){
    compColour2="Y";}

    if(computerBlock3==1){
    compColour3="R";}
    if(computerBlock3==2){
    compColour3="G";}
    if(computerBlock3==3){
    compColour3="B";}
    if(computerBlock3==4){
    compColour3="Y";}

    System.out.println("Comp Guesses: "+compColour1+" "+compColour2+" "+compColour3);
    System.out.println();



    //prints score
    System.out.println("Number of Colours Correct = " + coloursCorrect);
    System.out.println("Number of Positions Correct = " + positionsCorrect);
    System.out.println();
    System.out.println("Enter 1 to try again.");
    tryAgain=Integer.parseInt(br.readLine());//user inputs their choice
    System.out.println();

    }while(tryAgain==1);//will repeat if the user inputs 1 when asked to try again


    }//closes main body

    public static int checkColoursCorrect(int guess1, int guess2, int guess3)
    {
    coloursCorrect = 0;//sets coloursCorrect to 0

    if((guess1==computerBlock1)||(guess1==computerBlock2)||(guess1==computerBlock3)){//add 1 to colours correct if it fits the correct condition
    coloursCorrect = coloursCorrect+1;}
    if((guess2==computerBlock1)||(guess2==computerBlock2)||(guess2==computerBlock3)){
    coloursCorrect = coloursCorrect+1;}
    if((guess3==computerBlock1)||(guess3==computerBlock2)||(guess3==computerBlock3)){
    coloursCorrect = coloursCorrect+1;}

    return (coloursCorrect);//will return the total number of colours correct
    }//closes checkColoursCorrect method

    public static int checkPositionsCorrect(int guess1, int guess2, int guess3)
    {
    positionsCorrect = 0;//sets positionsCorrect to 0

    //if the guess matches the block, the position is correct therefore add 1 to the amount of positions correct
    if(guess1==computerBlock1){
    positionsCorrect = positionsCorrect+1;}

    if(guess2==computerBlock2){
    positionsCorrect = positionsCorrect+1;}

    if(guess3==computerBlock3){
    positionsCorrect = positionsCorrect+1;}

    return (positionsCorrect);//will return the total number of positions correct

    }//closes checkPositionsCorrect method

    public static int randomWholeNumber(int randNum){
    return randNum=(int) ((Math.random()*4)+1);//generates and returns a random number to wherever called between 4 & 1
    }//closes randomWholeNumber method

    public static void newGame()
    {//generate a colour for each computer's block
    computerBlock1=randomWholeNumber(randNum);
    computerBlock2=randomWholeNumber(randNum);
    computerBlock3=randomWholeNumber(randNum);
    }//closes newGame method

}
