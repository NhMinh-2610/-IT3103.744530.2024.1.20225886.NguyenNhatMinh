package lab05.AimsProject;
import lab05.AimsProject.media.Media;
import java.util.ArrayList;
import java.util.List;
//NguyenNhatMinh20225886
public class Store {
    // Attribute
    private List<Media> itemsInStore = new ArrayList<Media>();//NguyenNhatMinh20225886
    // Constructor
    public Store() {
    }
    // Method to add a media
    public void addMedia(Media media) throws Exception {
        if (itemsInStore.contains(media)) {
            throw new Exception("Media is already in the list");
        }
        itemsInStore.add(media);//NguyenNhatMinh20225886
        System.out.println("Added");//NguyenNhatMinh20225886
    }

    // Method to remove a media
    public void removeMedia(Media media) throws Exception {
        // Search for disc
        int indexOfRemoved = itemsInStore.indexOf(media);//NguyenNhatMinh20225886

        // If not found
        if (indexOfRemoved == -1) {
            throw new Exception("Not found");//NguyenNhatMinh20225886
        }

        // Remove
        itemsInStore.remove(indexOfRemoved);//NguyenNhatMinh20225886

        // Notify
        System.out.println("Removed");//NguyenNhatMinh20225886
    }

    // Method to print all item in store
    public void printStore() {
        System.out.println("***********************STORE**********************");//NguyenNhatMinh20225886
        System.out.println("Items in store:");//NguyenNhatMinh20225886
        for (Media media : itemsInStore) {
            media.print();//NguyenNhatMinh20225886
        }
        System.out.println("**************************************************");//NguyenNhatMinh20225886
    }

    // Method to search for media in the store by title.
    public Media searchByTitle(String title) throws Exception {
        for (Media media: itemsInStore) {
            if (media.isMatch(title)) {
                return media;//NguyenNhatMinh20225886
            }
        }
        throw new Exception("Not found!");
    }

    // Getter and Setter
    public List<Media> getItemsInStore() {
        return itemsInStore;//NguyenNhatMinh20225886
    }

    public void setItemsInStore(List<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;//NguyenNhatMinh20225886
}
