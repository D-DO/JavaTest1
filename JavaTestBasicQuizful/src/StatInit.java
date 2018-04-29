public class StatInit {

    public static void main(String[] args) {
        System.out.print(A1.i);
        System.out.print(B1.i);
    }
}

class A1 {
    static {
        i = 2;
    }
    static int i = 1;
};

class B1 {
    static int i = 1;
    static {
        i = 2;
    }
};