import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n=== CHƯƠNG TRÌNH TÍNH TOÁN ===");
            System.out.println("1. Tính năng Cộng/Trừ");
            System.out.println("2. Tính năng Nhân/Chia");
            System.out.println("3. Giải phương trình bậc nhất (ax + b = 0)");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập số thứ nhất: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Nhập số thứ hai: ");
                    double b1 = scanner.nextDouble();
                    System.out.println("Kết quả Cộng: " + PhepTinhCongTru.cong(a1, b1));
                    System.out.println("Kết quả Trừ: " + PhepTinhCongTru.tru(a1, b1));
                    break;
                case 2:
                    System.out.print("Nhập số thứ nhất: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Nhập số thứ hai: ");
                    double b2 = scanner.nextDouble();
                    System.out.println("Kết quả Nhân: " + PhepTinhNhanChia.nhan(a2, b2));
                    try {
                        System.out.println("Kết quả Chia: " + PhepTinhNhanChia.chia(a2, b2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Nhập hệ số a: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Nhập hệ số b: ");
                    double b3 = scanner.nextDouble();
                    System.out.println("Kết quả: " + GiaiPhuongTrinh.bacNhat(a3, b3));
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
            }
        } while (luaChon != 0);

        scanner.close();
    }
}