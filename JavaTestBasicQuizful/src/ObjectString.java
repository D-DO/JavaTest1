public class ObjectString {
    public static void main(String[] args) {
        Object obj = null;
        String str = new String("str");
        str = (String) obj;
        obj = new String("obj");
        System.out.println(obj+ ", " + str);

    }
}
