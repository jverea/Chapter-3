import java.util.Scanner;

public class NumbersDemo {
   public static void main (String[] args){
       int a ;
       int b;

       Scanner input = new Scanner(System.in);
       System.out.println("Please enter a whole number >>>");



       //; displayTwiceTheNumber(a , b);
       //; displayNumberPlusFive(a, b);
   }
   public static void displayTwiceTheNumber(int a, int b){

       a = a *2;
       b = b *2;
       displayResults ("Twice the number is",a);
       displayResults ("Twice the number is",b);
   }
   public static void displayNumberPlusFive(int y, int Z){

       y = y + 5;
       Z = Z + 5;
       displayResults ("Plus 5 to the number", y);
       displayResults ("Plus 5 to the number", Z);

   }
   public static void displayuNumberSquared(int c, int d) {

   }
   public static void displayResults(String display,int answser){
       System.out.println(display + answser);
   }
}
