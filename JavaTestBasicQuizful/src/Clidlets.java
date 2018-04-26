class Clidders {
    public final void flipper() {
        System.out.println("Flip a Clidder");
    }
}
public class Clidlets extends Clidders {
    // public void flipper() {    //Ошибка компиляции
    //        Пояснение: final метод нельзя переопределить в дочернем классе.
    {
        System.out.println("Flip a Clidlet");
        super.flipper();
    }

    public static void main(String[] args) {
        new Clidlets().flipper();
    }
}
