import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Basamak sayısı: ");
        int basamakSayisi = in.nextInt();
        int yildizSayisi= 1+((basamakSayisi-1)*2);
        int boslukSayisi = 0;

        while (boslukSayisi!=basamakSayisi){
            for (int a =0; a<boslukSayisi; a++){
                System.out.print(" ");
            }
            for (int i=0; i<yildizSayisi; i++){
                System.out.print("*");
            }
            yildizSayisi-=2;
            boslukSayisi++;
            System.out.println();
        }
    }
}
