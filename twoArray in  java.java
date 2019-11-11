import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // input variables
        int[] numArray1 = new int[1];
        int[] numArray2 = new int[1];
        //input scanner
        System.out.println("please enter  numArray 1: ");
        Scanner num1 = new Scanner(System.in);
        numArray1[0] = num1.nextInt();
        System.out.println("please enter numArray 2: ");
        Scanner num2 = new Scanner(System.in);
        numArray2[0] = num2.nextInt();

        if (numArray1[0] == numArray2[0]) {
            System.out.println("The two arrays are identical");
        }
        else{
            System.out.println("The two arrays are not identical");
        }

    }
}
