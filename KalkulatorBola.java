import java.util.Scanner;

public class KalkulatorBola {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jari,volume,luas;

        System.out.print("Masukkan jari bola: ");
        jari = input.nextDouble();

        volume = 4/3 * 3.14 * jari * jari * jari;  
        luas = 4 * 3.14 * jari * jari; 

        System.out.println("volume =  "  + volume + "cm3");
        System.out.println("luas = " + luas + "cm2");

        


        
    }
    
}
