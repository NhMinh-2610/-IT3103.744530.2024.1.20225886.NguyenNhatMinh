package customer;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("DVD da duoc them.");//NguyenNhatMinh20225886
        } else {
            System.out.println("Khong the them DVD.");//NguyenNhatMinh20225886
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (dvdList != null) {
            for (DigitalVideoDisc disc : dvdList) {
                if (disc != null) {
                    if (qtyOrdered < MAX_NUMBER_ORDERED) {
                        itemsOrdered[qtyOrdered] = disc;
                        qtyOrdered++;
                        System.out.println("DVD da duoc them: " + disc.getTitle());
                    } else {
                        System.out.println("Khong the them DVD. Gio hang da day.");//NguyenNhatMinh20225886
                        break;
                    }
                } else {
                    System.out.println("Bo qua 1 DVD null trong danh sach.");//NguyenNhatMinh20225886
                }
            }
        } else {
            System.out.println("Danh sach DVD null, khong the them vao gio hang.");
        }//NguyenNhatMinh20225886
    }
}
public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    if (dvd1 != null) {
        itemsOrdered[qtyOrdered] = dvd1;
        qtyOrdered++;
    } else {
        System.out.println("Khong the them DVD1 null vao gio hang");//NguyenNhatMinh20225886
    }
    if (dvd2 != null) {
        itemsOrdered[qtyOrdered] = dvd2;
        qtyOrdered++;
    } else {
        System.out.println("Khong the them DVD2 null vao gio hang");//NguyenNhatMinh20225886
    }
}

public void searchById(int id) {
    System.out.println("Tim kiem DVD theo ID: " + id);
    boolean found = false;
    for (DigitalVideoDisc disc : itemsOrdered) {
        if (disc != null && disc.getId() == id) {
            System.out.println("Tim thay DVD: " + disc.toString());
            found = true;//NguyenNhatMinh20225886
            break;
        }
    }
    if (!found) {
        System.out.println("Khong tim thay DVD voi ID: " + id);//NguyenNhatMinh20225886
    }
}
//tieeu dde
// Lam kiem DVD theo tieu de
public void searchByTitle(String title) {
    System.out.println("Tim kiem DVD theo tieu de: " + title);
    boolean found = false;
    for (DigitalVideoDisc disc : itemsOrdered) {
        if (disc != null && disc.isMatch(title)) {
            System.out.println("Da tim thay DVD: " + disc.toString());
            found = true;//NguyenNhatMinh20225886
            break;
        }
    }
    if (!found) {
        System.out.println("Khong tim thay DVD voi tieu de: " + title);//NguyenNhatMinh20225886
    }
}

// Xoa DVD khoi gio hang
public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    boolean found = false;
    for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i] == disc) {
            // Di chuyen cac DVD con lai ve truoc
            for (int j = i; j < qtyOrdered - 1; j++) {
                itemsOrdered[j] = itemsOrdered[j + 1];//NguyenNhatMinh20225886
            }
            itemsOrdered[qtyOrdered - 1] = null;
            qtyOrdered--;
            System.out.println("DVD da bi xoa.");//NguyenNhatMinh20225886
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("DVD khong ton tai.");
    }
}
// Tinh tong chi phi cua tat ca cac DVD trong gio hang
public float totalCost() {
    float total = 0;
    for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i] != null) {
            total += itemsOrdered[i].getCost();//NguyenNhatMinh20225886
        }
    }
    return total;
}




public void searchById(int id) {
    System.out.println("Tim kiem DVD theo ID: " + id);
    boolean found = false;//NguyenNhatMinh20225886
    for (DigitalVideoDisc disc : itemsOrdered) {
        if (disc != null && disc.getId() == id) {
            System.out.println("Tim thay DVD: " + disc.toString());
            found = true;//NguyenNhatMinh20225886
            break;
        }
    }
    if (!found) {
        System.out.println("Khong tim thay DVD voi ID: " + id);//NguyenNhatMinh20225886
    }
}


// Tim kiem DVD theo tieu de
public void searchByTitle(String title) {
    System.out.println("Tim kiem DVD theo tieu de: " + title);
    boolean found = false;//NguyenNhatMinh20225886
    for (DigitalVideoDisc disc : itemsOrdered) {
        if (disc != null && disc.isMatch(title)) {
            System.out.println("Da tim thay DVD: " + disc.toString());
            found = true;//NguyenNhatMinh20225886
            break;//NguyenNhatMinh20225886
        }
    }
    if (!found) {
        System.out.println("Khong tim thay DVD voi tieu de: " + title);//NguyenNhatMinh20225886
    }
}



public boolean isMatch(String title) {
    return this.title.equalsIgnoreCase(title);
}




package customer;
public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();
        
        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);//NguyenNhatMinh20225886
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);//NguyenNhatMinh20225886
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "NguyenNhatMInh", 95, 18.99f);
        cart.addDigitalVideoDisc(dvd3);//NguyenNhatMinh20225886
        
        // Test the print method
        cart.printCart();
        
        // To do: Test the search methods here
        // Example: cart.searchByTitle("The Lion King");
    }
}
