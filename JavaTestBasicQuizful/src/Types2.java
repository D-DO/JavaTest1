class ClassA1 {
    int x = 1;

    public void printX() {
        System.out.println(getX());
    }

    public int getX() {
        return x;
    }
}

class ClassB1 extends ClassA1 {
    int x = 2;


    public void printX() {
        System.out.println(getX());
    }
    public int getX() {
        return x + 1;
    }
}

public class Types2 {
    public static void main(String[] args) {
        ClassA a = new ClassB();
        System.out.println(a.x);
       a.printX();

    }
} 