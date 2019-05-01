import java.awt.*;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("whats type of tringle are you solving for? 1, 2, or 3");
        System.out.println("1. Right triangle");
        System.out.println("2. Isoceles");
        System.out.println("3. Equaletral");

        choice = input.nextInt();

        if (choice ==1);
        rightTriangle();
        else if (choice ==2);
        isoclesTriangle();
        else if (choice ==3);
        equalateralTriangle();
        else
            triangleDoesNotExist();
    }
    public static void isoclesTriangle(){
    }
public static void equalateralTriangle(){
        //all sides are equal find the parimeter and hight
}
public static void rightTriangle(){
        
}
}