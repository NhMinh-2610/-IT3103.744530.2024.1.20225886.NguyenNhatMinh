package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private List<Media> itemsOrdered = new ArrayList<>();//NguyenNhatMinh20225886

    public Cart() {
    }//NguyenNhatMinh20225886

    public void addMedia(Media media) {
        itemsOrdered.add(media);//NguyenNhatMinh20225886
        System.out.println("Added successfully");//NguyenNhatMinh20225886
    }

    public void removeMedia(Media media) {
        int indexOfRemoved = itemsOrdered.indexOf(media);//NguyenNhatMinh20225886
        if (indexOfRemoved == -1) {
            System.out.println("Not found media!");//NguyenNhatMinh20225886
            return;
        }
        itemsOrdered.remove(indexOfRemoved);//NguyenNhatMinh20225886
        System.out.println("Removed successfully");//NguyenNhatMinh20225886
    }

    public double totalCost() {
        float cost = 0;//NguyenNhatMinh20225886
        for (Media media : itemsOrdered) {
            cost += media.getCost();
        }
        return Math.round(cost * 100.0) / 100.0;//NguyenNhatMinh20225886
    }

    public void printCart() {
        System.out.println("**** Cart ****");//NguyenNhatMinh20225886
        System.out.println("Ordered Items: ");//NguyenNhatMinh20225886
        for (Media media : itemsOrdered) {
            media.print();
        }
        System.out.println("Total cost: " + totalCost());//NguyenNhatMinh20225886
        System.out.println("***************************");//NguyenNhatMinh20225886
    }

    // Search by ID
    public void searchById(int id) {
        System.out.println("Search media by ID: " + id);//NguyenNhatMinh20225886
        boolean found = false;//NguyenNhatMinh20225886
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                found = true;//NguyenNhatMinh20225886
                media.print();//NguyenNhatMinh20225886
            }
        }
        if (!found) {
            System.out.println("Not found media!");//NguyenNhatMinh20225886
        }
    }

    // Search by title
    public void searchByTitle(String title) {
        System.out.println("Search media by title: " + title);//NguyenNhatMinh20225886
        boolean found = false;//NguyenNhatMinh20225886
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                found = true;//NguyenNhatMinh20225886
                media.print();//NguyenNhatMinh20225886
            }
        }
        if (!found) {
            System.out.println("Not found media!");//NguyenNhatMinh20225886
        }
    }

    public void emptyCart() {
        itemsOrdered.clear();//NguyenNhatMinh20225886
    }

    public List<Media> getItemsOrdered() {
        return itemsOrdered;//NguyenNhatMinh20225886
    }

    // Search by title using user input
    public void searchByUserInput() {
        Scanner scanner = new Scanner(System.in);//NguyenNhatMinh20225886
        System.out.println("Enter the title: ");
        String inputTitle = scanner.nextLine();//NguyenNhatMinh20225886
        int checkItemFound = 0;//NguyenNhatMinh20225886
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(inputTitle)) {
                System.out.println(media.toString() + " found!");//NguyenNhatMinh20225886
                checkItemFound = 1;
            }
        }
        if (checkItemFound == 0) {
            System.out.println(inputTitle + " not found!");//NguyenNhatMinh20225886
        }
        scanner.close();//NguyenNhatMinh20225886
    }
}
