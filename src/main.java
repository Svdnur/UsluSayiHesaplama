import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a,b;
        int total =1;

        System.out.println( "Üssü alınacak sayıyı giriniz :");
        a = scan.nextInt();

        System.out.println( "Üs olacak sayıyı giriniz : ");
        b = scan.nextInt();

        for ( int i = 1 ; i <= b ; i++) {

            total *= a;

        }
        System.out.println( " Üs işleminin sonucu :" + total );
    }

}
