package baitap;

import java.util.Map;
import java.util.TreeMap;

public class Bai4 {
    public static void main(String[] args) {
        Map<String, Double> employee = new TreeMap<>();

        employee.put("E001",10000.0);
        employee.put("E002",8000.0);
        employee.put("E003",15000.0);
        employee.put("E004",12000.0);
        employee.put("E005",20000.0);

        for (Map.Entry<String, Double> emp : employee.entrySet()) {
            System.out.println("Id: " + emp.getKey() + " - Lương:" + emp.getValue());
        }

        System.out.println("Lương nhân viên E003 sau khi that đổi: " + employee.put("E003",18000.0));
        employee.remove("E004");
        System.out.println("Danh sách sau khi xóa nhân viên");
        for (Map.Entry<String, Double> emp : employee.entrySet()) {
            System.out.println("Id: " + emp.getKey() + " - Lương:" + emp.getValue());
        }
    }
}
