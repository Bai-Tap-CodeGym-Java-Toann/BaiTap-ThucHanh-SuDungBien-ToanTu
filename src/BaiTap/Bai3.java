package BaiTap;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int currentYear = cal.get(Calendar.YEAR);
        System.out.println("nhập năm sinh: ");
        System.out.println("số tuổi của bạn là: "+(currentYear-sc.nextInt()));

    }
}
