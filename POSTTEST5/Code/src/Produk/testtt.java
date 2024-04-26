public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); 
            System.out.println("Result: " + result); 
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static final int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return dividend / divisor;
    }
}

