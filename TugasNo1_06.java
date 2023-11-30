import java.util.Scanner;

public class TugasNo1_06 {
    
    public static void DescenRekursif(int n) {
        if (n>= 0){
            System.out.print(n + " ");
            DescenRekursif(n - 1);
        }
    }
    public static void DescenIteratif(int n){
        for (int i = n; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int n = sc.nextInt();

        System.out.println("Menggunakan rekursif : ");
        DescenRekursif(n);

        System.out.println("\nMenggunakan iterarif : ");
        DescenIteratif(n);

        sc.close();
    }
}