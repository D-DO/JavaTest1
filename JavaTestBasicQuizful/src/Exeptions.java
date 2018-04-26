//Что будет напечатано в результате выполнения следующего кода:

//public class Exceptions {
//    public static void main(String[] args) {
////        try {
////            throw new UnsupportedOperationException();
////        } catch(Throwable t) {
////            System.out.print("1");
////        } catch(Exception e) {
////            System.out.print("2");
////        } catch(UnsupportedOperationException uoe) {
////            System.out.print("3");
////        }
//    }
//}


//
//           2
//
//            Код не скомпилируется ///
//
//            3
//
//            1
//
//            123
//
//            Пояснение: Код не скомпилируется. Все исключения в java наследуются от Throwable.
//                   В нескольких блоках catch обработка исключений должна идти вверх по иерархии
//                   исключений (в данном случае от более конкретного -
//                   UnsupportedOperationException до более общего - Throwable, но не наоборот).