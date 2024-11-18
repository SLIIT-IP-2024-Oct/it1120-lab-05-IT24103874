import java.util.Scanner;

public class IT24103874Lab5Q1{
    public static void main(String[] args){
        int Smaller;
        int Larger;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer : ");
        int A = input.nextInt();

        System.out.print("Enter the second integer : ");
        int B = input.nextInt();

        System.out.print("Enter the three integer : ");
        int C = input.nextInt();

        System.out.println("");
        System.out.println("User entered numbers are : " + A + " " + B + " " + C);

        if (A > B && B > C){
            Larger = A;
            Smaller =  C;
        } else if (A > C && C > B){ 
            Larger = A;
            Smaller =  B;
        } else if (C > A && A > B){
            Larger = C;
            Smaller = B;
        } else if (C > B && B > A){
            Larger = C;
            Smaller = A;
        } else if (B > A && A > C){
            Larger = B;
            Smaller = C;
        } else {
            Larger = B;
            Smaller = A;
        }

        System.out.println("The smallest number is : " + Smaller);
        System.out.println("The largest number is : " + Larger);
    }
}