package baitap.bai10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*******************MENU***********************");
            System.out.println("1. Thêm nhân viên mới");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Tính tổng lương của tất cả nhân viên");
            System.out.println("4. Tính lương trung bình");
            System.out.println("5. Tìm nhân viên có lương cao nhất");
            System.out.println("6. Tìm nhân viên có lương thấp nhất");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    displayEmployee();
                    break;
                case 3:
                    salaryAll();
                    break;
                case 4:
                    avgSalary();
                    break;
                case 5:
                    maxSalary();
                    break;
                case 6:
                    minSalary();
                    break;
                case 7:
                    System.exit(0);
                default:
            }
        }while (true);
    }
    public static void addEmployee(Scanner scanner) {
        Employee employee = new Employee();
        employee.setId(employees.size());
        System.out.print("Nhập vào tên nhân viên: ");
        employee.setName(scanner.nextLine());
        while (true){
            System.out.print("Nhập vào tiền lương: ");
            double salary = Double.parseDouble(scanner.nextLine());
            if(salary > 0){
                employee.setSalary(salary);
                break;
            }else {
                System.out.print("Số tiền lương không hợp lệ vui lòng nhập lại");
            }
        }
        employees.put(employee.getId(), employee);
    }
    public static void displayEmployee() {
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
    public static void salaryAll(){
        double salary = 0;
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            salary += entry.getValue().getSalary();
        }
        System.out.println("Lương của tất cả nhân viên: " + salary);
    }
    public static void avgSalary(){
        double salary = 0;
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            salary += entry.getValue().getSalary();
        }
        salary /= employees.size();
        System.out.println("Lương trung bình của nhân viên: " + salary);
    }
    public static void maxSalary(){
        Employee maxSalary = employees.get(0);
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getSalary() > maxSalary.getSalary()) {
                maxSalary = entry.getValue();
            }
        }
        System.out.println("Nhân viên có lương cao nhất: ");
        System.out.println(maxSalary.toString());
    }
    public static void minSalary(){
        Employee minSalary = employees.get(0);
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getSalary() < minSalary.getSalary()) {
                minSalary = entry.getValue();
            }
        }
        System.out.println("Nhân viên có lương thấp nhất: ");
        System.out.println(minSalary.toString());
    }
}
