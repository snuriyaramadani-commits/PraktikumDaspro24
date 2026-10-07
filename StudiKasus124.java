import java.util.Scanner;
public class StudiKasus124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int hargaPerCup =18000;
    int totalHarga;
    int diskon;
    int totalBayar = 0;
    int kembalian;
    int kurang; 

System.out.print("masukkan jumlah cup: ");
    int jumlahCup = sc.nextInt();
    System.out.println("Masukkan uang bayar: ");
    int uangBayar = sc.nextInt();

    totalHarga = jumlahCup * hargaPerCup; 
    diskon = 0;

if (totalHarga >= 100000){
    diskon = totalHarga * 10/100;
}
    System.out.println("Total harga: " + totalHarga);
    System.out.println("Diskon: " + diskon);
    System.out.println("Total bayar:" + totalBayar);
     if (uangBayar >= totalBayar) {
        kembalian = uangBayar - totalBayar;
        System.out.print("kembalian: " + kembalian);
     }else {
     kurang = totalBayar - uangBayar;
     System.out.println("Uang tidak cukup, uang kurang Rp " + kurang);
     }


sc.close();
}
    }

