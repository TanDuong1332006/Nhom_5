public class PhepTinhNhanChia {
    
    public static double nhan(double a, double b) {
        return a * b;
    }

    public static double chia(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Lỗi: Không thể chia cho 0!");
        }
        return a / b;
    }
}