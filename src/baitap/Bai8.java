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
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (n >= entry.getKey()) {
                romanNumber.append(entry.getValue());
                n -= entry.getKey();
            }
        }
        System.out.println("Số La Mã: " + romanNumber);
    }
}
