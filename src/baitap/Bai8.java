package baitap;

import java.util.*;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");

        System.out.print("Nhập vào một số nguyên: ");
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder romanNumber = new StringBuilder();
        while (n > 0) {
            if(n >= 1000){
                romanNumber.append("M");
                n -= 1000;
            } else if (n >= 900) {
                romanNumber.append("CM");
                n -= 900;
            }else if (n >= 500) {
                romanNumber.append("D");
                n -= 400;
            } else if (n >= 400) {
                romanNumber.append("CD");
                n -= 400;
            }else if (n >= 100) {
                romanNumber.append("C");
                n -= 100;
            }else if (n >= 90) {
                romanNumber.append("XC");
                n -= 90;
            }else if (n >= 50) {
                romanNumber.append("L");
                n -= 50;
            }else if (n >= 40) {
                romanNumber.append("XL");
                n -= 40;
            }else if (n >= 10) {
                romanNumber.append("X");
                n -= 10;
            }else if (n >= 9) {
                romanNumber.append("IX");
                n -= 9;
            }else if (n >= 5) {
                romanNumber.append("V");
                n -= 5;
            }else if (n >= 4) {
                romanNumber.append("IV");
                n -= 4;
            }else if (n >= 1) {
                romanNumber.append("I");
                n -= 1;
            }
        }
        System.out.println("Số La Mã: " + romanNumber);
    }
}
