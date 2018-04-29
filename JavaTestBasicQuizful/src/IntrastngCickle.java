public class IntrastngCickle {

    public static void main(String... args) {
//        for (byte i = 6, j = 0 ; (j += i++) <= 10; i >>= 1, System.out.print(--j));

        int ki = 6;
        int kj = 0;

        for (int i = 0; i <10 ; i++) {

            kj += ki++;
            ki>>=1;
            --kj;
            System.out.println(kj+"   "+ ki);

        }
    }
}
