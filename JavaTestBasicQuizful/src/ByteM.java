public class ByteM {
    public static void main(String[] args) {
        byte b = 12;
//        byte k = b + 1;
        byte k = (byte) (b + 1);
        System.out.println(k);
    }
}

//Пояснение: При выполнении арифметических действий со значениями типа
//        byte, char, short, они неявно приводятся к типу int.
//        Поэтому результат выражения b+1 также будет иметь тип int.
//        Чтобы его можно было присвоить переменной k,
//        нужно использовать явное приведение типа:
//
//        byte k = (byte)(b + 1);