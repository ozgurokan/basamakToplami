import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenler oluşturulur
        int number, digitCounter = 0, tempNumber, digitSum = 0;

        // kullanıcıdan kontrol etmek istediği sayı alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz :");
        number = input.nextInt();

        //kullanıcıdan alınan değeri kaybetmemek için tempNumber değişkeninde saklanır ve işlemler bu değişken ile yapılır
        tempNumber = number;

        // basamak sayısı bulunur
        do {
            tempNumber /= 10;
            digitCounter++;
        } while (tempNumber != 0);

        // basamak sayısı bulma işleminde tempNumber değişkeni sıfıra eşitlendiği için tekrar number sayısına eşitlenir
        tempNumber = number;


        // basamak sayısı kez döngü yapılır ve her döngüde digitSum değişkenine kalan eklenir. daha sonra tempnumber değikeni 10a bölünerek bir önceki basamağa ulaşılır
        for (int i = 0; i < digitCounter; i++) {

            digitSum += tempNumber % 10;
            tempNumber = tempNumber / 10;
            System.out.println(tempNumber);
        }

        System.out.println("Basamak Sayısı: " + digitCounter);
        System.out.println("Basamakların Toplamı: " + digitSum);


    }
}