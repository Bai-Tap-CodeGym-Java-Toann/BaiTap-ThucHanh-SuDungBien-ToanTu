package BaiTap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập độ c: ");
        System.out.println("độ f: " + (sc.nextDouble() * 9 / 5 + 32));
    }
}
