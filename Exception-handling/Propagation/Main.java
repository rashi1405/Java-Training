// exception propagation 


class temp {
    public static void main(String[] args) {
        first();
    } 
    public static void first() {
        try {
            second();
        } catch (ArithmeticException e) {
            System.out.println("Exception Handelled !!!");
        }
    } 
    public static void second() {
        System.out.println(10/0);
    } 
}
