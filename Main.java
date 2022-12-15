import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);
        int min = 0, max = 0, no;

        System.out.print("How many numbers to enter: ");
        int top = mec.nextInt();

        for (int i = 1; i <= top; i++) {
            System.out.print(i + ". Enter the number: ");
            no = mec.nextInt();
            if (i == 1) {
                max = no;
                min = no;
            } else if (no <= min) {
                min = no;
            }
            {
                max = no;
            }
        }
        System.out.println("The min number: " + min);
        System.out.println("The max number: " + max);
    }
}