package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

public class Store {
    // Danh sách các DVD trong cửa hàng
    private List<Media> itemsInStore = new ArrayList<>();

    // Phương thức thêm DVD vào cửa hàng
    public Store() {
    }

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Added successfully");
    }

    public void removeMedia(Media media) {
        int indexOfRemoved = itemsInStore.indexOf(media);
        if (indexOfRemoved == -1) {
            System.out.println("Not found media");//NguyenNhatMinh20225886
            return;
        }
        itemsInStore.remove(indexOfRemoved);//NguyenNhatMinh20225886
        System.out.println("Removed successfully");//NguyenNhatMinh20225886
    }

    public List<Media> getItemsInStore() {
        return itemsInStore;//NguyenNhatMinh20225886
    }

    public void setItemsInStore(List<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;//NguyenNhatMinh20225886
    }

    public void print() {
        System.out.println("****** LIST ITEMS IN STORE ******");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());//NguyenNhatMinh20225886
        }
        System.out.println("**********************************");
    }

    // Tìm kiếm media theo ID
    public Media findMediaById(int id) {
        for (Media media : itemsInStore) {
            if (media.getId() == id) {
                return media;//NguyenNhatMinh20225886
            }
        }
        return null;
    }

    // Tìm kiếm media theo tiêu đề
    public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;//NguyenNhatMinh20225886
            }
        }
        return null;//NguyenNhatMinh20225886
    }
}
