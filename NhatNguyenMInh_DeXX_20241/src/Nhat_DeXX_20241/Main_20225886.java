package Nhat_DeXX_20241;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_20225886 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Child_20225886> children = new ArrayList<>();
        String choice;
        
        while (true) {
            System.out.println("\nChọn 1. Thêm cháu");
            System.out.println("Chọn 2. Hiển thị danh sách các cháu");
            System.out.println("Chọn 3. Tìm kiếm cháu theo tên");
            System.out.println("Chọn 4. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextLine();

            if (choice.equals("1")) {
                // Chức năng Thêm cháu
                System.out.println("\nNhập dữ liệu - NguyeNhatMinh - 20225886");
                System.out.println("a. Thêm Preschooler_20225886");
                System.out.println("b. Thêm Kindergarten_20225886");
                System.out.print("Chọn a hoặc b: ");
                String type = scanner.nextLine();

                if (type.equals("a")) {
                	System.out.print("Họ tên sinh viên_20225886");
                    System.out.print("Họ tên_20225886: ");
                    String name_20225886 = scanner.nextLine();
                    System.out.print("Tuổi_20225886: ");
                    int age_20225886 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Lớp_20225886: ");
                    String className_20225886 = scanner.nextLine();
                    System.out.print("Người giám hộ_20225886: ");
                    String guardian_20225886 = scanner.nextLine();
                    children.add(new Preschooler_20225886(name_20225886, age_20225886, className_20225886,guardian_20225886));
                } else if (type.equals("b")) {
                    // Thêm Kindergarten
                	System.out.print("Họ tên sinh viên_20225886");
                    System.out.print("Họ tên_20225886: ");
                    String name_20225886 = scanner.nextLine();
                    System.out.print("Tuổi_20225886: ");
                    int age_20225886 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Lớp_20225886: ");
                    String className_20225886 = scanner.nextLine();
                    System.out.print("Đồ chơi yêu thích_20225886: ");
                    String favoriteToy_20225886 = scanner.nextLine();
                    children.add(new Kindergarten_20225886(name_20225886, age_20225886, className_20225886, favoriteToy_20225886));
                }

            } else if (choice.equals("2")) {
                // Chức năng Hiển thị danh sách cháu
                System.out.println("\nHiển thị thông tin_NguyenNHhatMInh_20225886:");
                for (Child_20225886 child : children) {
                    System.out.println(child.toString());  // Using toString() to display info
                    System.out.println("-------------------------------------");
                }

            } else if (choice.equals("3")) {
                // Chức năng Tìm kiếm theo tên
                System.out.print("\nNhập tên cháu cần tìm: ");
                String searchName = scanner.nextLine();
                boolean found = false;
                for (Child_20225886 child : children) {
                    if (child.getName_20225886().equalsIgnoreCase(searchName)) {
                        // Directly display info when found
                        System.out.println("Đã tìm thấy cháu:");
                        System.out.println(child.toString());  // Using toString() to display info
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Không tìm thấy cháu với tên: " + searchName);
                }

            } else if (choice.equals("4")) {
                // Chức năng Thoát
                System.out.println("Thoát khỏi chương trình – NguyenNHatMInh– 744530");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }

        scanner.close();
    }
}