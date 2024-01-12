import java.util.*;

public class QuadraticSolver{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Quadratic Solver!");
        System.out.println("Please put in a, b, and c");
        double a = input.nextDouble();
        double b = input.nextDouble();  
        double c = input.nextDouble();
        double answer1 = ((-1*b) + Math.sqrt((b*b) - ((4*a*c))))/(2*a);
        System.out.print("Your answers are: " + answer1);
        System.out.println("Yay");

    }
}