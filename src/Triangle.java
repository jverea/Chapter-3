import java.awt.*;
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        System.out.println("What type of triangle are you solving for?");
        System.out.println("1. Right Triangle");
        System.out.println("2. Isocles");
        System.out.println("3. Equalteral");

        //choice = input.next.Int();


            //tringle with two equal sides always try to find the base and area
            Scanner input = new Scanner(System.in);
            double sideA;
            double sideB;
            double sideC;
            String sidechoice;
            System.out.println("What side of the triangle are you trying to solve for? A, B, C");
            sidechoice = input.next();

            if (sidechoice.equals("A")) {
                System.out.println("What is side b?>>> ");
                sideB = input.nextDouble();
                System.out.println("What is side c?>>> ");
                sideC = input.nextDouble();
                calucatesideA(sideB, sideC, sidechoice);
            } else if (sidechoice.equals("B")) {
            } else if (sidechoice.equals("C")) {
            } else
                System.out.println("That side does not exist on a tringle dummy!!!");
        }

        public static void calucatesideA ( double b, double c, String choice){
            double a;
            double squared;
            a = Math.sqrt(c * c - b * b);
            System.out.println("The side" + choice + "=" + a);
        }


    }
