package baitap.Bai9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Integer, Product> products = new HashMap<Integer, Product>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*****************MENU******************");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. Cập nhật số lượng hoặc giá sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Tính tổng giá trị trong kho");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    updateProduct(scanner);
                    break;
                case 3:
                    deleteProduct(scanner);
                    break;
                case 4:
                    valueAllProducts();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.print("Lựa chọn của bạn không hợp lệ vui lòng chọn lại!");
            }
        }while (true);
    }
    public static void addProduct(Scanner scanner) {
        Product product = new Product();
        product.setId(products.size());
        System.out.print("Nhập vào tên sản phẩm");
        product.setName(scanner.nextLine());
        while (true) {
            System.out.print("Nhập vào giá sản phẩm: ");
            double price = Double.parseDouble(scanner.nextLine());
            if(price > 0){
                product.setPrice(price);
                break;
            }else {
                System.out.println("Giá không hợp lệ vui lòng nhập lại!");
            }
        }
        while (true) {
            System.out.print("Nhập vào số lượng sản phẩm");
            int quantity = Integer.parseInt(scanner.nextLine());
            if(quantity > 0){
                product.setQuantity(quantity);
                break;
            }else {
                System.out.println("Số lương không hợp lệ vui lòng nhập lại");
            }
        }
        products.put(product.getId(), product);
        System.out.println("Thêm mới thành công");
    }
    public static void updateProduct(Scanner scanner) {
        System.out.print("Nhập vào id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (products.containsKey(id)) {
            boolean Exit = false;
            do {
                System.out.println("*****************UPDATE******************");
                System.out.println("1. Sửa giá sản phẩm");
                System.out.println("2. Sửa số lượng sản phẩm");
                System.out.println("3. Thoát");
                System.out.print("Lựa chọn của bạn: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        while (true) {
                            System.out.print("Nhập vào giá sản phẩm: ");
                            double price = Double.parseDouble(scanner.nextLine());
                            if(price > 0){
                                products.get(id).setPrice(price);
                                break;
                            }else {
                                System.out.println("Giá không hợp lệ vui lòng nhập lại!");
                            }
                        }
                        break;
                    case 2:
                        while (true) {
                            System.out.print("Nhập vào số lượng sản phẩm");
                            int quantity = Integer.parseInt(scanner.nextLine());
                            if(quantity > 0){
                                products.get(id).setQuantity(quantity);
                                break;
                            }else {
                                System.out.println("Số lương không hợp lệ vui lòng nhập lại");
                            }
                        }
                        break;
                    case 3:
                        Exit = true;
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại!");
                }
            }while (!Exit);
            System.out.println("Cập nhật thành công");
        }else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }
    public static void deleteProduct(Scanner scanner) {
        System.out.print("Nhập vào id sản phẩm cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        if (products.containsKey(id)) {
            products.remove(id);
            System.out.println("Xóa thành công");
        }else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }
    public static void valueAllProducts() {
        double total = 0;
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            total += entry.getValue().getPrice()*entry.getValue().getQuantity();
        }
        System.out.println("Tổng số lượng sản phẩm trong kho" + total);
    }
}
