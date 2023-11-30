import java.util.Scanner;

public class TugasNo4_06 {
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } 
        else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Masukkan Bulan ke : ");
        n = sc.nextInt();

        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + n + " adalah " + Fibonacci(n));
    }   
}