import java.util.Scanner;

public class pemilihan_08 {
    public pemilihan_08(){
    }

 public static void main(String[] args) {
      Scanner cd = new Scanner(System.in);
      System.out.println("==============================");
      System.out.println("Program Menghitung Nilai Akhir");
      System.out.println("==============================");
      System.out.print("Masukkan Nilai Tugas : ");
      float tugas = cd.nextFloat();
      System.out.print("Masukkan Nilai Kuis  : ");
      float kuis = cd.nextFloat();
      System.out.print("Masukkan Nilai UTS   : ");
      float uts = cd.nextFloat();
      System.out.print("Masukkan Nilai UAS   : ");
      float uas = cd.nextFloat();
      if (uas >= 0.0F && uas <= 100.0F && uts >= 0.0F && uts <= 100.0F && kuis >= 0.0F && kuis <= 100.0F && tugas >= 0.0F && tugas <= 100.0F) {
         float nilaiAkhir = tugas * 0.2F + kuis * 0.2F + uts * 0.3F + uas * 0.3F;
         int nilai = (int)nilaiAkhir;
         String nilaiHuruf;
         if (nilai > 80 && nilai <= 100) {
            nilaiHuruf = "A";
         } else if (nilai > 73 && nilai <= 80) {
            nilaiHuruf = "B+";
         } else if (nilai > 65 && nilai <= 73) {
            nilaiHuruf = "B";
         } else if (nilai > 60 && nilai <= 65) {
            nilaiHuruf = "C+";
         } else if (nilai > 50 && nilai <= 60) {
            nilaiHuruf = "C";
         } else if (nilai > 39 && nilai <= 50) {
            nilaiHuruf = "D";
         } else {
            nilaiHuruf = "E";
         }
         

         String hasil = !nilaiHuruf.equals("D") && !nilaiHuruf.equals("E") ? "SELAMAT ANDA LULUS" : "ANDA TIDAK LULUS";
         System.out.println("==============================");
         System.out.println("==============================");
         System.out.println("Nilai Akhir : " + nilaiAkhir);
         System.out.println("Nilai Huruf : " + nilaiHuruf);
         System.out.println("==============================");
         System.out.println("==============================");
         System.out.println(hasil);
         System.out.println("==============================");
      } else {
         System.out.println("==============================");
         System.out.println("==============================");
         System.out.println("Nilai tidak valid!");
         System.out.println("==============================");
         System.out.println("==============================");
      }

   }
    }
