package customer;
import java.util.ArrayList;
import java.util.List;
public class Store {
    // Danh sach cac DVD trong cua hang
    private List<DigitalVideoDisc> itemsInStore = new ArrayList<>();
    // Phuong thuc them DVD vao cua hang
    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);//NguyenNhatMinh20225886
            System.out.println("DVD da duoc them vao cua hang: " + dvd.getTitle());
        } else {
            System.out.println("Khong the them DVD null vao cua hang.");
        }
    }
    // Phuong thuc xoa DVD khoi cua hang
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.contains(dvd)) {
            itemsInStore.remove(dvd);//NguyenNhatMinh20225886
            System.out.println("DVD da duoc xoa khoi cua hang: " + dvd.getTitle());
        } else {
            System.out.println("DVD khong ton tai trong cua hang.");
        }
    }
    // Phuong thuc in danh sach DVD trong cua hang
    public void printStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("Cua hang khong co DVD nao.");
        } else {
            System.out.println("Danh sach DVD trong cua hang:");//NguyenNhatMinh20225886
            for (DigitalVideoDisc dvd : itemsInStore) {
                System.out.println(dvd.getTitle());
            }
        }
    }
}



package customer;

public class StoreTest {
    public static void main(String[] args) {
        // Tao cua hang
        Store store = new Store();
        //NguyenNhatMinh20225886
        // Tao cac DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Unknown", 90, 18.99f);//NguyenNhatMinh20225886
        //NguyenNhatMinh20225886//NguyenNhatMinh20225886
        // Them cac DVD vao cua hang
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        
        // In danh sach DVD trong cua hang
        System.out.println("Danh sach DVD sau khi them: ");
        store.printStore();//NguyenNhatMinh20225886
        
        // Xoa mot DVD khoi cua hang
        System.out.println("\nXoa DVD: " + dvd2.getTitle());
        store.removeDVD(dvd2);
        //NguyenNhatMinh20225886
        // In danh sach DVD sau khi xoa
        System.out.println("\nDanh sach DVD sau khi xoa:");
        store.printStore();
        
        // Thu xac dinh mot DVD khong ton tai
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Frozen", "Animation", "Unknown", 100, 22.99f);
        System.out.println("\nThu xoa DVD khong ton tai: " + dvd4.getTitle());
        store.removeDVD(dvd4);
    }
}

package customer;

public class Aim {
    public static void main(String[] args) {
        // Create a new cart//NguyenNhatMinh20225886
        Cart anOrder = new Cart();

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        if (checkDVD(dvd1)) {
            anOrder.addDigitalVideoDisc(dvd1);
        }

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", null, null, 0, 0);
        if (checkDVD(dvd2)) {
            anOrder.addDigitalVideoDisc(dvd2);//NguyenNhatMinh20225886
        }

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "NguyenNhatMinh", 95, 18.99f);
        if (checkDVD(dvd3)) {
            anOrder.addDigitalVideoDisc(dvd3);
        }

        // Print total cost
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }

// Phuong thuc kiem tra tinh hop le cua DVD
public static boolean checkDVD(DigitalVideoDisc dvd) {
    if (dvd.getTitle() == null || dvd.getTitle().isEmpty()) {
        System.out.println("DVD khong hop le: thieu tieu de.");
        return false;//NguyenNhatMinh20225886
    }
    if (dvd.getCost() < 0) {
        System.out.println("DVD khong hop le: gia tien am.");
        return false;//NguyenNhatMinh20225886
    }
    if (dvd.getLength() < 0) {
        System.out.println("DVD khong hop le: do dai am.");
        return false;//NguyenNhatMinh20225886
    }
    if (dvd.getCategory() == null || dvd.getCategory().isEmpty()) {
        System.out.println("DVD khong hop le: thieu danh muc.");
        return false;//NguyenNhatMinh20225886
    }
    return true;
}

}