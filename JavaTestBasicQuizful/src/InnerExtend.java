public class InnerExtend {
    class A3 {
        String str = "ab";

        A3() {
            printLength();
        }

        void printLength() {
            System.out.println(str.length());
        }
    }

    class B3 extends A3 {
//        final static String str = "abc";
//        final String str = "abc";
         String str = "abc";

        void printLength() {
            System.out.println(str.length());
        }
    }

    public static void main(String[] args) {
        new InnerExtend().new B3();
    }
}

//    В результате выполнения данного кода возникнет NullPointerException,
//        так как, создавая объект класса B, сначала вызывается
//        конструктор супер класса (родителя). В конструкторе родителя
//        происходит вызов метода printLength(), который переопределен
//        в подклассе (наследнике), внутри этого метода идет обращение
//        к переменной str наследника, которая еще не проинициализирована
//        и равна null, так как конструктор родителя еще не закончил свою
//        работу, отсюда и исключение.
//
//        В действительности, вызов не финальных методов
//        в конструкторе класса - это плохая практика, так как
//        не статические переменные в Java инициализируются
//        после вызова конструктора супер класса (родителя).