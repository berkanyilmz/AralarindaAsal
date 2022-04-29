public class Main {

    public static void aralarindaAsalMi(int a, int b) {
        int max = 0;
        boolean asalMi = true;
        if (a < b)
            max = b;
        else
            max = a;

        for (int i = 2; i < max/2; i++) {
            if (a % i == 0 && b % i == 0) {
                asalMi = false;
                break;
            }
        }
        if (asalMi)
            System.out.println("Aralarinda asaldir");
        else
            System.out.println("Aralarinda asal degil");
    }

    public static void main(String[] args) {
        aralarindaAsalMi(8, 21);
    }
}
