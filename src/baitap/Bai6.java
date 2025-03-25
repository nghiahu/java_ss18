package baitap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bai6 {
    public static void main(String[] args) {
        Map<String, Double> Student = new LinkedHashMap<>();
        Student.put("Nguyễn Văn A",7.5);
        Student.put("Nguyễn Văn B",6.5);
        Student.put("Nguyễn Văn C",4.0);
        Student.put("Nguyễn Văn D",8.5);
        Student.put("Nguyễn Văn E",5.5);
        Student.put("Nguyễn Văn F",4.5);
        Student.put("Nguyễn Văn G",9.5);
        Student.put("Nguyễn Văn H",9.0);
        Student.put("Nguyễn Văn K",8.5);
        Student.put("Nguyễn Văn M",6.5);
        System.out.println("Danh sách học sinh và điểm số của họ theo thứ tự thêm vào.");
        for (Map.Entry<String, Double> std : Student.entrySet()) {
            System.out.println(std.getKey() + " : " + std.getValue());
        }
        double avg = 0;
        for (Map.Entry<String, Double> std : Student.entrySet()) {
            avg += std.getValue();
        }
        avg = avg / Student.size();
        System.out.println("Điểm trung bình của tất cả học sinh: "+ avg);

        System.out.println("Danh sách học sinh sau khi xóa: ");
        Iterator<Map.Entry<String, Double>> StudentIter = Student.entrySet().iterator();
        while (StudentIter.hasNext()) {
            if (StudentIter.next().getValue() < 5.0) {
                StudentIter.remove();
            }
        }
        for (Map.Entry<String, Double> std : Student.entrySet()) {
            System.out.println(std.getKey() + " : " + std.getValue());
        }
    }
}
