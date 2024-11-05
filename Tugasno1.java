import java.util.Scanner;

public class Tugasno1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a;
        do {
            System.out.print("Input nilai a (1-29): ");
            a = scanner.nextInt();
        } while (a < 1 || a > 29);

        int i = 0;

        while (i <= a) {
            System.out.println("i: " + i + ", a: " + a);
            i++;
        }

        System.out.println("Selesai");
        scanner.close();
    }
}
