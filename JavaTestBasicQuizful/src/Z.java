public class Z {
    public void print(Object o){
        System.out.println("Obj");
    }
    public void print(String o){
        System.out.println("Str");
    }
    public void print(Integer o){
        System.out.println("Int");
    }

    public static void main(String[] args) {
        Z z = new Z();
        z.print((String) null);
    }
}
