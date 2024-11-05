import java.util.Scanner;

public class Tugasno4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int i = 0;
        
        while (i < 10) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            int nilai = input.nextInt();
            
            sum += nilai; 
            i++; 
        }
        
        double rataRata = sum / 10.0;
        System.out.println("Rata-rata: " + rataRata);
        
        input.close();
    }
}
