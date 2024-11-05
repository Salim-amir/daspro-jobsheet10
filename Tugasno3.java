import java.util.Scanner;

public class Tugasno3 {
    public static void main(String[] args) {
       
        String[] bulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Input angka (1 - 12): ");
        int n = scanner.nextInt();
        
        if (n >= 1 && n <= 12) {
            System.out.println("Bulan: " + bulan[n - 1]);
        } else {
            System.out.println("Angka tidak valid");
        }

        System.out.println("Selesai");
        scanner.close();
    }
}
