package BaiTap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập điểm toán: ");
        double toan = sc.nextDouble();
        System.out.println("nhập điểm hóa: ");
        double hoa = sc.nextDouble();
        System.out.println("nhập điểm lý: ");
        double sinh = sc.nextDouble();
        System.out.println("nhập điểm sinh: ");
        double ly = sc.nextDouble();
        System.out.print("điểm trung bình là: ");
        System.out.println((ly + hoa + sinh + toan) / 4);
    }

}
