import java.util.*;
public class ListM {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> ar = new ArrayList<Integer>();
            List temp = ar; //1 
            temp.add(new java.util.Date()); //2 
            temp.add(new Float(1.66));
            Iterator it = ar.iterator();
            while (it.hasNext())
                System.out.println(it.next());
            System.out.println(ar.get(0));
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}

//    Успешное выполнение программы
//
//        Пояснение:
//
//        Коллекция temp не является типизированной, поэтому метод temp.add()
//        успешно выполняется даже для объектов "неправильного" типа.
//
//        Исключение возникнет, если при обращении к элементам коллекции ar
//        явно или неявно будет выполняться преобразование к типу Integer.
//        В данном примере такого нет, поэтому обход коллекции также выполнится успешно
//
//        Чтобы предотвратить добавление в коллекцию "неправильных" элементов,
//        можно использовать представление с проверкой, например, такое:
//
//        List temp = Collections.checkedList(ar, Integer.class);