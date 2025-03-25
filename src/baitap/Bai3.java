package baitap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bai3 {
    public static void main(String[] args) {
        Map<String, Integer> productMap = new LinkedHashMap<>();
        productMap.put("Clothing", 200);
        productMap.put("Laptop", 1200);
        productMap.put("Phone", 1000);
        productMap.put("watch", 1500);
        productMap.put("hand bag",5000);
        System.out.println(productMap);

        System.out.println("Giá của laptop sau khi thay đổi: ");
        productMap.put("Laptop", 1500);
        System.out.println(productMap.get("Laptop"));
        productMap.remove("Phone");
        System.out.println("Danh sách sau khi xóa Phone");
        System.out.print(productMap);
    }
}
