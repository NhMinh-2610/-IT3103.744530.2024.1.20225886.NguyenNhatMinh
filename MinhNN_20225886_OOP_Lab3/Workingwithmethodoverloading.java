//1.1
public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    if (dvdList != null) {
        for (DigitalVideoDisc disc : dvdList) {
            if (disc != null) {
                if (qtyOrdered < MAX_NUMBER_ORDERED) {
                    itemsOrdered[qtyOrdered] = disc; qtyOrdered++;//NguyenNhatMinh20225886
                    System.out.println("DVD da duoc them: " + disc.getTitle());//NguyenNhatMinh20225886
                } else {
                    System.out.println("Khong the them DVD. Gio hang da day."); //NguyenNhatMinh20225886
                    break;//NguyenNhatMinh20225886
                }
            } else {
                System.out.println("Bo qua 1 DVD null trong danh sach.");//NguyenNhatMinh20225886
            }
        }
    } else {
        System.out.println("Danh sach DVD null, khong the them vao gio hang.");//NguyenNhatMinh20225886
    }
}

package customer;

public class Aim {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
        anOrder.addDigitalVideoDisc(dvd1);//NguyenNhatMinh20225886
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
        anOrder.addDigitalVideoDisc(dvd2);//NguyenNhatMinh20225886    
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "NguyenNhatMinh", 95, 18.99f); 
        anOrder.addDigitalVideoDisc(dvd3);//NguyenNhatMinh20225886
        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3}; 
        anOrder.addDigitalVideoDisc(dvdList); //NguyenNhatMinh20225886 
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }
}

//1.2
// Them hai DVD vao gio hang
public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    if (dvd1 != null) {
        items.add(dvd1);//NguyenNhatMinh20225886 
    } else {
        System.out.println("Khong the them DVD1 null vao gio hang.");
    }
    if (dvd2 != null) {
        items.add(dvd2);//NguyenNhatMinh20225886 
    } else {
        System.out.println("Khong the them DVD2 null vao gio hang.");
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
                    System.out.println("Khong the them DVD. Gio hang da day."); //NguyenNhatMinh20225886 
                    break; // Dung them neu vuot qua gioi han
                }
            } else {
                System.out.println("Bo qua 1 DVD null trong danh sach.");//NguyenNhatMinh20225886 
            }
        }
    } else {
        System.out.println("Danh sach DVD null, khong the them vao gio hang.");//NguyenNhatMinh20225886 
    }
}



package customer;
public class Aim {
    public static void main(String[] args) {
        // Tao mot gio hang moi
        Cart anOrder = new Cart();
        // Tao cac doi tuong DVD moi va them vao gio hang
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);//NguyenNhatMinh20225886
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", null, null, 0, 0);
        anOrder.addDigitalVideoDisc(dvd1, dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "NguyenNhatMinh", 95, 18.99f);//NguyenNhatMinh20225886
        anOrder.addDigitalVideoDisc(dvd3);
        System.out.println("Total Cost is: ");//NguyenNhatMinh20225886
        System.out.println(anOrder.totalCost());
    }
}

package otherproject;
import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 65536; i++) {
            r.nextInt(2);//NguyenNhatMinh20225886
        }
        System.out.println(System.currentTimeMillis() - start);
        
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) { 
            sb.append(r.nextInt(2));//NguyenNhatMinh20225886
        }
        sb.toString();//NguyenNhatMinh20225886
        System.out.println(System.currentTimeMillis() - start);
    }
}



package hust.soict.globalict.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        System.out.println("Starting GarbageCreator...");
        try {
            // Tao rat nhieu chuoi de gay ra "rac"
            while (true) {
                String garbage = new String("This is garbage: " + Math.random());//NguyenNhatMinh20225886
            }//NguyenNhatMinh20225886
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: Too much garbage created!");//NguyenNhatMinh20225886
        }
        System.out.println("Garbage Creator finished.");
    }
}




package otherproject;
import java.util.Random;

public class GarbageCreator {
    public static void main(String[] args) {
        int size = 10000;
        byte[] inputBytes = new byte[size];
        Random random = new Random();
        random.nextBytes(inputBytes);//NguyenNhatMinh20225886
        long startTime = System.currentTimeMillis();//NguyenNhatMinh20225886
        StringBuilder outputString = new StringBuilder(size);
        for (byte b : inputBytes) {
            outputString.append((char) b);//NguyenNhatMinh20225886
        }
        long endTime = System.currentTimeMillis();//NguyenNhatMinh20225886
        System.out.println("Time taken using StringBuilder: " + (endTime - startTime) + " ms");
    }
}




package otherproject;
import java.util.Random;
public class NoGarbage {
    public static void main(String[] args) {
        int size = 10000;
        byte[] inputBytes = new byte[size];
        Random random = new Random();//NguyenNhatMinh20225886
        random.nextBytes(inputBytes);//NguyenNhatMinh20225886
        long startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder(size);
        for (byte b : inputBytes) {
            char printableChar = (char) ((b & 0xFF) % 95 + 32);//NguyenNhatMinh20225886
            outputStringBuilder.append(printableChar);//NguyenNhatMinh20225886
        }
        outputStringBuilder.toString();//NguyenNhatMinh20225886
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken using StringBuilder: " + (endTime - startTime) + " ms");
    }
}
