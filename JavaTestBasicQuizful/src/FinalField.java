
public class FinalField {
    final String s;

    public FinalField() {
        s = "default";
    }

    public FinalField(String s) {
        this.s = "default1";
    }

    public static void main(String[] args) {
        System.out.println(new FinalField().s);
    }
}