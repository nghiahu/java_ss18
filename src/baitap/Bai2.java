package baitap;

import java.util.HashMap;
import java.util.Map;

public class Bai2 {
    public static void main(String[] args) {
        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("Laptop", 2000);
        productMap.put("Phone", 1500);
        productMap.put("Clothing", 500);

        System.out.println(productMap.containsKey("Laptop")?"Có sản phẩm laptop":"Không có sản phẩm laptop");
        System.out.println(productMap.containsValue(1000)?"Có sản phẩm có giá trị 1000":"Không có sản phẩm giá 1000");
    }
}
