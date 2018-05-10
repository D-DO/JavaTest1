public class StringTest {
    public static void main(String[] args) {
        String x = "Java";
        x.concat(" Rules!");
        System.out.println("x = " + x);
        x.toUpperCase();
        System.out.println("x = " + x);
        x.replace('a', 'X');
        System.out.println("x = " + x);

        StringBuilder x1 = new StringBuilder("Java");
        x1.append(" Rules!");
        System.out.println("x1 = " + x1);

        x1.replace(1, 2,"x");
        System.out.println("x1 = " + x1);

        String x2 = "Java";
        x2 = x2.concat(" Rules!");
        System.out.println("x2 = " + x2);
        x2 = x2.toUpperCase();
        System.out.println("x2 = " + x2);
        x2 = x2.replace('a', 'X');
        System.out.println("x2 = " + x2);
    }
}
