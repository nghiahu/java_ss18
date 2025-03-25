package baitap;

import java.util.HashMap;
import java.util.Map;

public class Bai1 {
    public static void main(String[] args){
        Map<String, Double> studentMap = new HashMap<>();

        studentMap.put("Nguyễn Văn A",7.0);
        studentMap.put("Nguyễn Văn B",6.5);
        studentMap.put("Nguyễn Văn C",8.0);
        studentMap.put("Nguyễn Văn D",7.5);
        studentMap.put("Nguyễn Văn E",9.0);

        for(String name : studentMap.keySet()){
            System.out.println(name + " : " + studentMap.get(name));
        }

        System.out.println("Điểm của sinh viên A:");
        System.out.println(studentMap.get("Nguyễn Văn A"));
    }
}
