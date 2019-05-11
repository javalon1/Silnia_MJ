public class SilniaRekurencyjna {

  /*  public static int silnia(int n) {
        System.out.println(n);

        if (n < 2) {
            return 1;
        }
        return n * silnia(n - 1);
    } */

    public static void main(String[] args) {

        System.out.println(silnia(5));

    }

    public static double ciag(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 0.5;
        }
        return -ciag(n - 1) * ciag2(n - 2);
    }

    public static int ciag2(int n) {
        if(n ==1){
            return  -1;
        }
        return -ciag2(n-1) * n -3;
    }

    public static int silnia(int n) {

        System.out.println(n);
        if (n<2){
            return 1;
        }
        return n * silnia(n -1);

    }




}
