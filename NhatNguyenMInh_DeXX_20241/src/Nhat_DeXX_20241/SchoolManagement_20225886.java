package Nhat_DeXX_20241;

import java.util.ArrayList;

public class SchoolManagement_20225886 {
    private ArrayList<Child_20225886> children = new ArrayList<>();

    public SchoolManagement_20225886() {
    }
    public void addChild_20225886(Child_20225886 child) {
        children.add(child);
        System.out.println("Cháu " + child.getName_20225886() + " đã được thêm vào danh sách!");
    }

    public void displayAll_20225886() {
        System.out.println("***************************************************");
        System.out.println("Hiển thị thông tin danh sách các cháu - 20225886");
        for (Child_20225886 child : children) {
            child.toString();
        }
        System.out.println("***************************************************\n");
    }

    public void searchByName_20225886(String name) {
        boolean found = false;
        for (Child_20225886 child : children) {
            if (child.getName_20225886().equalsIgnoreCase(name)) {
                System.out.println("Đã tìm thấy cháu:");
                child.toString();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy cháu nào có tên: " + name);
        }
    }
}
