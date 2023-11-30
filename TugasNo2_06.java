import java.util.Scanner;

public class TugasNo2_06 {

    public static int PenjumlahanRekursif(int n){
        if (n == 1) {
            return 1;
        } else {
            return n + PenjumlahanRekursif(n - 1);
        }
    }
    public static void ProsesRekursif(int n) {
        if (n == 1) {
            System.out.print("1");
        } else {
            ProsesRekursif(n - 1);
            System.out.print(" + " + n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int f = sc.nextInt();

        int hasil = PenjumlahanRekursif(f);
        System.out.println("Hasil penjumlahan : " + hasil);

        System.out.println("Proses penjumlahan : ");
        ProsesRekursif(f);
    }
}