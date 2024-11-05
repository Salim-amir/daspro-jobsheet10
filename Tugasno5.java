import java.util.Scanner;

public class Tugasno5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int[] A = new int[10];
        
        System.out.println("Masukkan 10 nilai untuk array A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            A[i] = input.nextInt();
        }
        
        System.out.print("Masukkan nilai N yang ingin dicari: ");
        int N = input.nextInt();

        boolean ditemukan = false;
        int i = 0;

        while (i < 10) {
            if (A[i] == N) {
                ditemukan = true;
                break;
            }
            i++;
        }
        
        if (ditemukan) {
            System.out.println("Nilai " + N + " ditemukan pada indeks ke-" + (i+1));
        } else {
            System.out.println("Nilai " + N + " tidak tersedia dalam array.");
        }
        
        input.close();
    }
}
