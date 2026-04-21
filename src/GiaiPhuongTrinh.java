public class GiaiPhuongTrinh {
    
    public static String bacNhat(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                return "Phương trình có vô số nghiệm.";
            } else {
                return "Phương trình vô nghiệm.";
            }
        } else {
            double x = -b / a;
            return "Nghiệm của phương trình là x = " + x;
        }
    }
}