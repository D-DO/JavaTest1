public class CharTest {
    public static void main(String[] args) {
        char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1 + c2 + c3);

        System.out.println(49+49+49);
    }
}


//    её и не нужно знать, главное знать основные кода ascii(разрыв строки, пробел, цифры, буквы)
//        char c2 = '\u0031'; что бы перевести его в ASCII код, то просто переведи юникод
//        из 16-ричного представления в 10-ричное
//        То есть '\u0031'==49=="1".
//        Для особых: u0031(3*16 + 1 = 49)
//