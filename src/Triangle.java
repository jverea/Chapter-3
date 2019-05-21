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

      //  if (choice ==1)
      //      rightTriangle();
      //  else if (choice ==2)
        // isoclesTriangle();
      //  else if (choice ==3)
      //      equalateralTriangle();
      //  else
      //      triangleDoesNotExist();
    }
    public static void isoclesTriangle() {
        Scanner input = new Scanner(System.in);
        double sideA;
        double sideB;
        double sideC;
        String sidechoice;

    }

    {
//  public static void equlateralTriangle (){
        Scanner input = new Scanner(System.in);

}

    public static void rightTriangle(){
        Scanner input = new Scanner (System.in);
        double sideA;
        double sideB;
        double sideC;
        String sidechoice;

        System.out.println("what side of the triangle are you trying to solve for? A, B, C");
        sidechoice = input.next();

        if (sidechoice.equals("A")){
            System.out.println("what is side B? >>>");
            sideB = input.nextDouble();
            System.out.println("what is side C? >>>");
            sideC = input.nextDouble();
            //calculateSideA_B(sideC, sideB, sidechoice);
        }
        else if(sidechoice.equals("B")){
            System.out.println("what is side A? >>>");
            sideA = input.nextDouble();
            System.out.println("what is side C? >>>");
            sideC = input.nextDouble();
            //calculateSideA_B(sideC, sideA, sidechoice);
        }
        else if(sidechoice.equals("C")){
            System.out.println("what is side A? >>>");
            sideA = input.nextDouble();
            System.out.println("what is side B? >>>");
            sideB = input.nextDouble();
            //calculateSideC(sideA, sideB, sidechoice);
        }

    }
 // public static void calculateSideA_B(double side1, double side2, String choice){
        double aORb;
   //   aORb = Math.sqrt(side1*side1 - side2*side2);
 //    system.out.println("Side " +choice + " = " + aORb);

//  public static void calculateSideC(double side1, double side2, String choice){
        double c;
   //   c = Math.sqrt(side1*side1 + side2*side2);
  //    System.out.println("Side " + choice + " = " + c);
//
    public static void triangleDoesNotExist(){
        System.out.println("That side does not exist."); }
}
