public class remainder {
    public static void main(String[] args) {

        int remaider = divide(10, 15);
        evenOrOdd(remaider);

    }
    public static int divide(int a, int b) {
        return (a%b);
    }
    public static void evenOrOdd(int remaider) {
        if (remaider%2==1) {
            System.out.println("odd");
        } else {
            System.out.println(" even");
        }
    }


}