public class Tugasno2 {
    public static void main(String[] args) {
        int a = 10;
        int i = 0;
        while (i < 10) {
            a = i + 1;
            i++;
        }
        i = 9;
        while (i >= 0) {
            System.out.println("a: " + a);
            i--;
        }

        System.out.println("Selesai");
    }
}
