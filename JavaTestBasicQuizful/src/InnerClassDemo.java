class Outer {
    int outer_x = 100;

    class Inner {
        void display() {
            System.out.print("outer_x = " + outer_x + "; ");
        }
    }

    Inner inner = new Inner();


    void test() {
        for (int i = 0; i < 5; i++) {

//            class Inner {
//                void display() {
//                    System.out.print("outer_x = " + outer_x + "; ");
//                }
//            }
//
//            Inner inner = new Inner();

            inner.display();

        }
    }
}

public class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
} 