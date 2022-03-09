import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int ulang;
        do{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("       Program Menghitung luas dan Volume      ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. Menghitung Balok");
            System.out.println("2. Menghitung Tabung");
            System.out.println("3. Exit");

            System.out.print("Pilih : ");
            int pilih = in.nextInt();

            switch(pilih){
                case 1:
                    double p, l, t;
                    System.out.print("Input nilai Panjang : ");
                    p = in.nextInt();
                    System.out.print("Input nilai Lebar : ");
                    l = in.nextInt();
                    System.out.print("Input nilai Tinggi : ");
                    t = in.nextInt();
                    balok b = new balok(p, l, t);

                    System.out.println("Luas Persegi Panjang = " + b.hitungLuas());
                    System.out.println("Keliling Persegi Panjang = " + b.hitungKeliling());
                    System.out.println("Volume Balok = " + b.hitungVolume());
                    System.out.println("Luas Permukaan Balok = " + b.hitungLuasP());
                    break;
                case 2:
                    double r;
                    System.out.print("Input nilai Tinggi : ");
                    t = in.nextInt();
                    System.out.print("Input nilai Jari - jari : ");
                    r = in.nextInt();
                    tabung tbg = new tabung(r, t);

                    System.out.println("Luas Lingkaran = " + tbg.hitungLuas());
                    System.out.println("Keliling Lingkaran = " + tbg.hitungKeliling());
                    System.out.println("Volume Tabung = " + tbg.hitungVolume());
                    System.out.println("Luas Permukaan Tabung = " + tbg.hitungLuasP());
            }
            System.out.print("Ulang Program? (Jika iya tekan 1 Jika tidak maka tekan 0)  : ");
            ulang = in.nextInt();
        }while(ulang == 1);
    }
}
