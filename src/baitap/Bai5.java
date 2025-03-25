package baitap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai5 {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<String, Double>();
        products.put("Clothing", 300.0);
        products.put("Phone", 1200.0);
        products.put("Laptop", 650.0);
        products.put("watch", 800.0);
        products.put("hand bag",2000.0);


        System.out.println("Mảng sau lọc và sắp xếp");
        Map<Double, Double> mapFilter = new HashMap<>();
        for (Map.Entry<String, Double> product : products.entrySet()) {
            if(product.getValue() >= 500 && product.getValue() <= 1500) {
                mapFilter.put(product.getValue(), product.getValue());
            }
        }
        List<Map.Entry<Double, Double>> listFilter = new ArrayList<>(mapFilter.entrySet());
        for (int i = 0; i < listFilter.size(); i++) {
            for (int j = i + 1; j < listFilter.size(); j++) {
                if(listFilter.get(i).getKey() > listFilter.get(j).getKey()) {
                    Map.Entry<Double, Double> temp = listFilter.get(i);
                    listFilter.set(i, listFilter.get(j));
                    listFilter.set(j, temp);
                }
            }
        }
        for (Map.Entry<Double, Double> entry : listFilter) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
