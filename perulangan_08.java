import java.util.Scanner;

public class perulangan_08{
     public perulangan_08() {
   }
    public static void main(String[] args) {
        Scanner cd = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        long n = cd.nextLong(); 
        long nilaiAkhir = n % 100L;
        if (nilaiAkhir < 10L) {
           nilaiAkhir += 10L;
        }
  
        System.out.println("n : " + nilaiAkhir);
  
        for(int i = 1;i <= nilaiAkhir; ++i) {
           if (i % 2 == 0) {
              if (i != 6 && i != 10) {
                 System.out.print("" + i + " ");
              }
           } else {
              System.out.print("* ");
           }
        }
  
     }
}