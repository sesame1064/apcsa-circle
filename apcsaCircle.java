import java.util.Scanner;

public class apcsaCircle {

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter a diameter: ");
    double givenDiameter = in.nextDouble();

    double area = Math.PI * Math.pow((givenDiameter / 2),2);

    System.out.print("The area of a circle with a diameter of " + givenDiameter + " is ");
    System.out.printf("%.1f.", area);

  }

}
