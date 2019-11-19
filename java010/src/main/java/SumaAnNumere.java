
public class SumaAnNumere {
    public static void main(String[] args) {
        sumaNrConsecutive(5);
        numarParImparCuAfisare(98);
        System.out.println(numarParImparFaraAfisare(87));
        foobar(15);
    }

    static int sumaNrConsecutive(int n) {
        int suma;
        int suma2;
        suma = (n * (n - 1)) / 2;
        suma2 = ((n + 1) * n) / 2;
        System.out.println(suma);
        System.out.println(suma2);
        return 0;
    }

    static void numarParImparCuAfisare(int z) {
        if (z % 2 == 0) {
            System.out.println("este par");
        } else {
            System.out.println("nu este par");
        }
    }

    static String numarParImparFaraAfisare(int z) {
        String rezultat;
        if (z % 2 == 0) {
            rezultat = "este par";
        } else {
            rezultat = "nu este par";
        }
        return rezultat;
    }

    public static void foobar(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        if (n % 3 == 0) {
            System.out.println("foo");
        }
        if (n % 5 == 0) {
            System.out.println("bar");
        }
    }
}
