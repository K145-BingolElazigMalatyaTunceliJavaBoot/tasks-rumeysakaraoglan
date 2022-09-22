

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class asalSayi {

  /* NOTLARI YAZDIRMA
   public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        int not = sayi.nextInt();
        String harf;


        if (not >= 0 && not <= 35) {
            System.out.println("Harf notu: FF");
        } else if (not > 35 && not <= 50) {
            System.out.println("Harf notu: DC");
        } else if (not > 50 && not <= 70) {
            System.out.println("Harf notu: BB");
        } else if (not > 70 && not <= 100) {
            System.out.println("Harf notu: AA");
        }
    }
    */

/*
    ASAL SAYI BULMA VE TOPLAMA
    public static void main(String[] args) {
        int toplam=0;
        List<Integer> primeNumbers =new ArrayList<Integer>();
        for( int i=3; i<100;i++){

            if( isPrimeNumber(i) ){
                primeNumbers.add( i);
            }
        }

        for( int number : primeNumbers){
            System.out.println( number);
        }
        for (int number: primeNumbers){
            toplam+=number;
        }
        System.out.println("Toplam = " + toplam);
    }

    private static boolean isPrimeNumber(int number) {

        boolean isPrime = true;//asalMi

        if(number==1){
            isPrime = false;
            return isPrime;
        }

        if(number<2){
            isPrime = false;
            return isPrime;
        }
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0) {
                isPrime=false;
            }

        }
        return isPrime;

    }


 */

/*
   200 İLE 300 ARASI

    public static void main(String[] args) {
        int i ;
        int toplam=0;
        for (i=200;i<500;i++){
            if (i%3==0){
                i++;
            }
            else{
                toplam += i;
            }
        }
        System.out.println("Toplam = " + toplam);
    }
 */



    //SAYI 0 İLE 500 ARALIĞI SAYI
  /*  public static void main(String[] args) {
        odev1();
    }
     private static int randomNumber(int min, int max){
        int result =  (int)(Math.random()*(max-min+1)+min); //Sayı aralığı oluşturdum
        return result;
    }
    private static boolean isNumberRange(int number, int startNumber, int endNumber){
        boolean result =false;
        if( number >=startNumber && number<=endNumber)
            result =true;

        return  result;
    }
    private static void odev1(){

        int number = randomNumber(0,500);
        int count=1;//kac seferde bulundur

        //sonuz dongu aliyoruz
        while (true)
        {
            if( isNumberRange(number,50,100)){
                break;
            }
            number = randomNumber(0,500);
            count++;
        }

        System.out.println("Random Sayı: " + number);
        System.out.println("deneme sayısı: " + count);
    }

   */


}





