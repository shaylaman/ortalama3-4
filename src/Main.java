import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ortalama,sayi,k=0,toplam=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen Bir Tamsayı Giriniz:  ");
        sayi = inp.nextInt();
        for(int i = 1; i <= sayi; i++){
            if(i%12!=0){
                continue;
            }
            k++;
            toplam+=i;
        }
        ortalama = toplam/k;
        System.out.println("Ortalamanız: " + ortalama);


    }
}