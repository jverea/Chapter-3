import java.util.Scanner;

public class Temperatures {
    public static void main (String[] args){

        int userEntryOne;
        int userEntryTwo;
        int userEntryThree;

        double coversonOne;
        double coversonTwo;
        double coversonthree;
        Scanner input = new  Scanner (System.in);

        System.out.print("Please enter an Temperature at 8:00am >>");
        userEntryOne = input.nextInt();
        System.out.print("Please enter another Temperature at 12:00pm >>");
        userEntryTwo = input.nextInt();
        System.out.print("Please enter another Temperature at 5:00pm >>");
        userEntryThree = input.nextInt();

        coversonOne = (userEntryOne - 32) * 0.5556 ;
        coversonTwo = (userEntryTwo - 32) * 0.5556 ;
        coversonthree = (userEntryThree - 32) * 0.5556 ;

        System.out.println("At 8:00am you had " + userEntryOne + " degress faheriet " + coversonOne + " degreds celsuhdys" );
        System.out.println("At 12:00pm you had " + userEntryTwo + " degress faheriet " + coversonTwo + " degreds celsuhdys" );
        System.out.println("At 5:00pm you had " + userEntryThree + " degress faheriet " + coversonthree + " degreds celsuhdys" );
    }
}
