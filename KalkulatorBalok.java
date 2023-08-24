import java.util.Scanner;
public class KalkulatorBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double panjang,lebar,tinggi;
        System.out.print("Masukkan panjang lebar tinggi balok : ");

        double volume,luas;
        
        panjang = input.nextDouble();
        lebar = input.nextDouble();
        tinggi = input.nextDouble();

        volume = panjang * lebar * tinggi;
        luas = 2 * panjang * lebar + panjang * tinggi + lebar * tinggi;

        System.out.println("volume = " + volume + "cm3");
        System.out.println("luas = " + luas + "cm2");

       
    }
    
}
