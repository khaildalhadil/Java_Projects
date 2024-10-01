/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class HangMan {

    public static void main(String args[]) {
        
        showLogo();
        String randomName = generateRnadomName();
//         to see the name ⬇
        System.out.println(randomName);
        makeDachidAndArrayOfString(randomName);
    }
    
    static String generateRnadomName() {
        
        String[] arabicNames = {
            "ahmed", "omar", "sara", "fatima", "khaled", 
            "hassan", "layla", "mohammed", "aisha", "youssef", 
            "rania", "zain", "mariam", "ibrahim", "noor",
            "salma", "ali", "noura", "tariq", "yasmin"
        };
        
        Random randomNum = new Random();
        int rnadomNumbers = randomNum.nextInt(arabicNames.length-1);
            
        return arabicNames[rnadomNumbers];
     
    }
    
    static void makeDachidAndArrayOfString(String randomName) {
        
        
        
        int size = randomName.length();
        char dachid[] = new char[size];
        
        for(int i = 0; i < randomName.length(); i++) {
            dachid[i] = '_';
        }
        
        System.out.print("wrod to guess: ");
        for (char x: dachid) {
            System.out.print(x+" ");
        }
        
        System.out.println();
        
        char[] nameInArray = randomName.toCharArray();
        
        gameStart(dachid, nameInArray);
    }
    
    
    static void gameStart(char dachid[], char[] nameInArray) {
        
        int hangMan = 0;
        int life = 6;
        //start the game ....
        while (String.valueOf(dachid).contains("_")) {
            Scanner s = new Scanner(System.in);
            
            //take the guess from user
            System.out.print("Guess a letter: ");
            char letter = s.next().charAt(0);
            //check if letter is in the char array         
            boolean found = false;
            for (char c: nameInArray) {
                if ( c ==  letter) {
                    found = true;
                }
            }
            
            if (found) {
//          loop over the word nameInArray
            for(int i = 0; i < nameInArray.length; i++) {
                if (letter == nameInArray[i]) {
                    dachid[i] = nameInArray[i];
                    } 
                }
                System.out.println("****** 6/"+ life +" Lives left");
            } else {
                System.out.println("You guessed "+ letter + " that's not in the word. You lose a life. ");
                hangMan++;
                showHangman(hangMan);
                life--;
                System.out.println("****** 6/"+ life +" Lives left");
                if (hangMan == 6) {
                    System.out.println("You are Loser you kill the man ＞﹏＜");
                    break;
                }
            }
            
            for (char x: dachid) {
                System.out.print(x+ " ");
            }
            
            System.out.println();
        }
        
        if(!String.valueOf(dachid).contains("_")) {
            System.out.println("YOu winnnn ");
        }
    }
    
    
    static void showLogo() {
                
        System.out.println(
        " _                                             \n" +
        "| |                                            \n" +
        "| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  \n" +
        "| '_ \\ / _' | '_ \\ / _' | '_ ' _ \\ / _' | '_ \\ \n" +
        "| | | | (_| | | | | (_| | | | | | | (_| | | | |\n" +
        "|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\n" +
        "                    __/ |                      \n" +
        "                   |___/");
        
    }
    
    
    static void showHangman(int hangMan) {
        String[] HANGMANPICS = {
            "  +---+\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|   |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " /    |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " / \\  |\n" +
            "      |\n" +
            "========="
        };
        
        System.out.println(HANGMANPICS[hangMan]);
    }

}


