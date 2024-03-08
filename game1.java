import java.util.Random;
import java.util.Scanner;
public class game1 {
    Scanner sc=new Scanner(System.in);
    Random r =new Random();
    int n =r.nextInt(100);
    int input;
     private int noOfGuesses=0;

     public void setGuess(int no){
        this.noOfGuesses=no;
     }
     public int getGuess(){
     return noOfGuesses;
     }


    game1(){
       // System.out.println(n);

    }
    public void takeUserInput(){
        System.out.print("Guess the Number:");
        input =sc.nextInt();
    }
     public void isCorrectNumber(){
         noOfGuesses++;
            if(n==input){
                System.out.println("True");
                System.out.println("you have guessed in:" +noOfGuesses+ "rounds");
                
            } 
            else if(n>input){
                System.out.println("to low..");
            }
            else if(n<input){
                System.out.println("to high..");
            }  
        
    }
    public static void main(String[] args) {
        game1 g= new game1();
       
        while (true) { 
            
            g.takeUserInput();
            g.isCorrectNumber();
           
            
        }
    }
}
