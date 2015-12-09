/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rockpaperscissors;

import java.io.*;

public class RockPaperScissors {

  static String userChoiceWord, compChoiceWord;//will store the users choice and computer's choice - global so methods can access them
    static int tie, win, loss;//will store number of ties, wins & losses
    static int userChoice, compChoice;//stores the int value that will be analyzed by determineOutcome()
    static int randNum;//will store random number

    public static void main (String args []) throws IOException
    {BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

  int playAgain;
  playAgain=1;//starts up the first play again loop
  userChoiceWord="0";//sets strings equal to something in order to run
  compChoiceWord="0";


  System.out.println("ROCK PAPER SCISSORS");
  System.out.println("===================");

  do{//will repeat from here
  System.out.println();
  System.out.println("1=Rock");
  System.out.println("2=Paper");
  System.out.println("3=Scissors");
  System.out.println("===========");
  System.out.println("Choose:");
  userChoice = Integer.parseInt(br.readLine());//user enters their choice
  System.out.println();

  if(userChoice==1){//assigns a word to the users choice
  userChoiceWord=("Rock.");}
  if(userChoice==2){
  userChoiceWord=("Paper.");}
  if(userChoice==3){
  userChoiceWord=("Scissors.");}

  compChoice=randomWholeNumber(randNum);//sets the compChoice to the randNum

  if(compChoice==1){//assigns a word to the computers choice
  compChoiceWord=("Rock.");}
  if(compChoice==2){
  compChoiceWord=("Paper.");}
  if(compChoice==3){
  compChoiceWord=("Scissors.");}

  System.out.println("You have chosen "+userChoiceWord);//prints out the choices
  System.out.println("The computer has chosen "+compChoiceWord);

  if(userChoice==compChoice){//if the choices are the same, theres a tie
  tie=tie+1;}//stores number of ties
  if(((userChoice==1)&&(compChoice==2))||((userChoice==2)&&(compChoice==3))||((userChoice==3)&&(compChoice==1))){//lose conditions
  loss=loss+1;}//stores the number of losses
  if(((userChoice==1)&&(compChoice==3))||((userChoice==2)&&(compChoice==1))||((userChoice==3)&&(compChoice==2))){//win conditions
  win=win+1;}//stores number of wins

  System.out.println();
  System.out.println(determineOutcome(tie, loss, win, userChoice, compChoice));

  System.out.println();
  System.out.println("WINS: "+win);//displays stats
  System.out.println("LOSSES: "+loss);
  System.out.println("TIES: "+tie);
  System.out.println();
  System.out.println("Press 1 to play again.");
  playAgain=Integer.parseInt(br.readLine());//user decides to playagain
  }while(playAgain==1);//play again = 1, repeat program at do

 }//closes main


 public static int randomWholeNumber(int randNum){

 randNum = (int) ((Math.random()*3)+1);
 return (randNum);//gets a random computer choice

 }//closes randomWholeNumber

 public static String determineOutcome(int tie, int loss, int win, int userChoice, int compChoice){

  if(userChoice==compChoice){//if the choices are the same, theres a tie
  return "YOU'VE TIED";
  }

  if(((userChoice==1)&&(compChoice==2))||((userChoice==2)&&(compChoice==3))||((userChoice==3)&&(compChoice==1))){//lose conditions
  return "YOU LOSE";
  }

  if(((userChoice==1)&&(compChoice==3))||((userChoice==2)&&(compChoice==1))||((userChoice==3)&&(compChoice==2))){//win conditions
  return "YOU WIN";
  }

  else{
  return "error";}


 }

}
