package BaiTap;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập bán kính: ");
        double r = sc.nextDouble();
        System.out.println("diện tích là: " + (r * r * Math.PI));
        System.out.println("chu vi là: " + (2 * r * Math.PI));
    }
}
