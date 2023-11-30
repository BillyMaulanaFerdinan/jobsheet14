import java.util.Scanner;

public class TugasNo3_06 {

    public static boolean CekPrimaRekursif(int n, int i){
        if (n <= 1){
            return false;
        } else if (i > n / 2){
            return true;
        } else if (n % i == 0) {
            return false;
        } else {
            return CekPrimaRekursif(n, i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai  : ");
        int n = sc.nextInt();

        if (CekPrimaRekursif(n, 2)){
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
}