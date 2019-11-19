import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        int a;
        double b;
        float c;
        String x;
        char y;
        boolean i;
        a = 2;
        b = 3.2;
        c = 32.2f;
        x = "Paul";
        y = 'c';
        i = true;
        boolean cc=false;
        //sum(3, 2);
        sum(4, 5);
        suma(2, b);
        System.out.println(x + "aa");

        System.out.println("Ma numesc " + x + "si astazi este " + afisareCurrentDate());

        alabala(i);
        alabala2(cc);
    }

    static void alabala(boolean aaaa) {
        if (aaaa == true) {
            System.out.println("ala");
        } else {
            System.out.println("bala");
        }

    }

    static String alabala2(boolean i) {
        String mesaj;
        if (i) {
            mesaj = "ala";
        } else {
            mesaj = "bala";
        }
        System.out.println(mesaj);
        return mesaj;
    }

    static String afisareCurrentDate()


    {
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String currentDate = formatter.format(today);
        return currentDate;
    }


    static int sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    static int suma(int a, double b) {
        int suma = (int) (a + b);
        System.out.println(suma);
        return suma;
    }


}

