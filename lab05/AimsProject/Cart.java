package lab05.AimsProject;
//NguyenNhatMinh20225886
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lab05.AimsProject.media.DigitalVideoDisc;
import lab05.AimsProject.media.Media;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    // Attribute
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    private int numOfDVDs;//NguyenNhatMinh20225886

    // Constructor
    public Cart() {
        numOfDVDs = 0;//NguyenNhatMinh20225886
    }

    // Method to add a new media
    public void addMedia(Media media) throws Exception {
        if (itemsOrdered.contains(media)) {
            throw new Exception("Media is already in the list");//NguyenNhatMinh20225886
        }
        itemsOrdered.add(media);//NguyenNhatMinh20225886
        if (media.getClass() == DigitalVideoDisc.class) {
            numOfDVDs++;
        }//NguyenNhatMinh20225886
        System.out.println("Added to cart successful");
    }

    // Method to remove a media
    public void removeMedia(Media media) throws Exception {
        // Search for media//NguyenNhatMinh20225886
        int indexOfRemoved = itemsOrdered.indexOf(media);//NguyenNhatMinh20225886

        // If not found//NguyenNhatMinh20225886
        if (indexOfRemoved == -1) {
            throw new Exception("Not found");//NguyenNhatMinh20225886
        }

        // Remove
        itemsOrdered.remove(indexOfRemoved);//NguyenNhatMinh20225886
        if (media.getClass() == DigitalVideoDisc.class) {
            numOfDVDs--;
        }

        // Notify
        System.out.println("Removed");//NguyenNhatMinh20225886
    }

    // Method to calculate the total cost
    public double totalCost() {
        float cost = 0;
        for (Media media: itemsOrdered) {
            cost += media.getCost();//NguyenNhatMinh20225886
        }

        return Math.round(cost * 100.0) / 100.0;//NguyenNhatMinh20225886
    }

    // Method to print the list of ordered items of a cart,
    // the price of each item, and the total price
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");//NguyenNhatMinh20225886
        for (Media media : itemsOrdered) {
            media.print();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**************************************************");
    }

    // Method to search for media in the cart by ID and display the search results.
    public Media searchByID(int id) throws Exception {
        for (Media media: itemsOrdered) {
            if (media.getId() == id) {
                return media;//NguyenNhatMinh20225886
            }
        }
        throw new Exception("Not found!");//NguyenNhatMinh20225886
    }

    // Method to search for media in the cart by title.
    public Media searchByTitle(String title) throws Exception {
        for (Media media: itemsOrdered) {
            if (media.isMatch(title)) {
                return media;//NguyenNhatMinh20225886
            }
        }
        throw new Exception("Not found!");//NguyenNhatMinh20225886
    }

    // Method to sort by title and print
    public void sortByTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE);//NguyenNhatMinh20225886
        printCart();
    }

    // Method to sort by cost and print
    public void sortByCost() {
        itemsOrdered.sort(Media.COMPARE_BY_COST);//NguyenNhatMinh20225886
        printCart();
    }

    // Getter and Setter

    public int getNumOfDVDs() {
        return numOfDVDs;
    }

    public void setNumOfDVDs(int numOfDVDs) {
        this.numOfDVDs = numOfDVDs;//NguyenNhatMinh20225886
    }

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;//NguyenNhatMinh20225886
    }
}
