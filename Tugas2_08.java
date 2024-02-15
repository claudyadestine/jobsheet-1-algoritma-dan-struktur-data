import java.util.Scanner;

public class Tugas2_08 {
   static Scanner cd =  new Scanner(System.in);
   static int jarak, kecepatan, waktu;
   
   public static void main(String[] args) {
      System.out.println("Menu");
      System.out.println("1. Rumus Kecepatan");
      System.out.println("2. Rumus Jarak");
      System.out.println("3. Rumus Waktu");
      System.out.print("Pilih 1/2/3 : ");
      int menu = cd.nextInt();

      switch (menu) {
         case 1:
            menuKecepatan();
            break;
         case 2:
            menuJarak();
            break;
         case 3:
            menuWaktu();
            break;
         default:
            System.out.println("Menu tidak valid!");
      }

   }

   static void menuKecepatan() {
      System.out.println("Rumus Kecepatan");

      System.out.print("Masukkan jarak(m) : ");
      jarak = cd.nextInt();

      System.out.print("Masukkan waktu(s) : ");
      waktu = cd.nextInt();

      kecepatan = kecepatan(jarak, waktu);
      System.out.println("Hasil perhitungan kecepatan : " + kecepatan + " m/s");
   }

   static int kecepatan(int jarak, int waktu) {
      int rumusKecepatan = jarak / waktu;
      return rumusKecepatan;
   }

   static void menuJarak() {
      System.out.println("Rumus Jarak");

      System.out.print("Masukkan kecepatan(m/s) : ");
      kecepatan = cd.nextInt();
      System.out.print("Masukkan waktu(s) : ");
      waktu = cd.nextInt();

      jarak = jarak(kecepatan, waktu);
      System.out.println("Hasil perhitungan jarak : " + jarak + " m");
   }

   static int jarak(int kecepatan, int waktu) {
      int rumusJarak = kecepatan * waktu;
      return rumusJarak;
   }

   static void menuWaktu() {
      System.out.println("Rumus Waktu");

      System.out.print("Masukkan jarak(m) : ");
      jarak = cd.nextInt();
      System.out.print("Masukkan kecepatan(m/s) : ");
      kecepatan = cd.nextInt();
      
      waktu = waktu(kecepatan, jarak);
      System.out.println("Hasil perhitungan waktu : " + waktu + " s");
   }

   static int waktu(int kecepatan, int jarak) {
      int rumusWaktu = jarak / kecepatan;
      return rumusWaktu;
   }
}