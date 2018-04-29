public class TypesTutorial {
    public static void main(String... args) {
        A alpha = new B(0);
//        A betta = new A(1);

    }
}

class A {


    A(int x){            // - 1 -
        a(x);            // - 2 -
    }

    void a(int x) {
        System.out.println("A-a: " + x);
    }
}

//class B extends A {
//    B(int x) {// - 3 - //////////////////////////////////////////
//        a(x);            // - 4 -
//    }
//
//    void a(int x) {
//        System.out.println("B-a: " + x);
//    }
//}

class B extends A {
    B(int x) {
        super(x);
        a(x);
    }

    void a(int x) {
        System.out.println("B-a: " + x);
    }
}

// Ошибка компиляции в строке 1
// Ошибка компиляции в строке 2
//Ошибка компиляции в строке 3 //////////////////////////////
// Ошибка компиляции в строке 4

//Пояснение: В классе A отсутствует конструктор по-умолчанию,
//        поэтому конструктор класса B (потомок) первым делом должен
//        явно вызвать один из обьявленных конструкторов класса-родителя.