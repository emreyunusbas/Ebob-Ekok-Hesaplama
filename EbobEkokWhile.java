import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int ekok = sayi1 * sayi2;

        int i = 1;
        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int j = sayi1 * sayi2;
        while (j >= sayi1 && j >= sayi2) {
            if (j % sayi1 == 0 && j % sayi2 == 0) {
                ekok = j;
            }
            j++;
        }

        System.out.println("Girilen sayıların EBOB değeri: " + ebob);
        System.out.println("Girilen sayıların EKOK değeri: " + ekok);
    }
}
