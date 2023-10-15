public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        double res = 0.0;
        try {
            res = (double) x/y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
}
