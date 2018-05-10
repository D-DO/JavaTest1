public class IntDoudleBouble {

    private double x = 2;
    public static void multX(IntDoudleBouble a, double n){
        a.setX(a.getX()*n);
    }
    public double getX() {return x;}
    public void setX(double xn) {x = xn;}
    public static void trippleValue(double x){
        x*=3;
    }
    public static IntDoudleBouble resetX(IntDoudleBouble a){
        a = new IntDoudleBouble();
        return a;
    }
    public static void main(String[] args) {
        int x = 3;
        trippleValue(x);
        IntDoudleBouble anA = new IntDoudleBouble();
        multX(anA,x);
        resetX(anA);
        x=0;
        System.out.print(anA.getX());
    }
}

//class IntDoudleBouble {
//    private Double x = 2;
//    public static void multX(IntDoudleBouble a, Double n) {
//        a.setX(a.getX()*n);
//    }
//    public Double getX() { return x; }
//    public void setX(Double xn) { x = xn; }
//    public static void trippleValue(Double x) {
//        x*=3;
//    }
//    public static IntDoudleBouble resetX(IntDoudleBouble a) {
//        a = new IntDoudleBouble();
//        return a;
//    }
//    public static void main(String[] args) {
//        Double x = 4;
//        trippleValue(x);
//        IntDoudleBouble anA = new IntDoudleBouble();
//        multX(anA,x);
//        resetX(anA);
//        System.out.print(anA.getX());
//    }
//}