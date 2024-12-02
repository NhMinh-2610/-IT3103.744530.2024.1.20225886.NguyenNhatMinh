package hust.soict.dsai.aims.media;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        if (o1.getCost() > o2.getCost()) {
            return -1;  //NguyenNhatMinh20225886
        } else if (o1.getCost() < o2.getCost()) {
            return 1;   //NguyenNhatMinh20225886
        } else {
            // Nếu cost bằng nhau, so sánh theo title
            if (o1.getTitle() != null && o2.getTitle() != null) {
                return o2.getTitle().compareTo(o1.getTitle()); //NguyenNhatMinh20225886
            }
            // Nếu một trong hai title là null
            if (o1.getTitle() == null && o2.getTitle() != null) {
                return 1;  //NguyenNhatMinh20225886
            }
            if (o1.getTitle() != null && o2.getTitle() == null) {
                return -1;//NguyenNhatMinh20225886
            }
            return 0; //NguyenNhatMinh20225886
    }
}

package hust.soict.dsai.aims.media;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        // So sánh theo title trước
        if (o1.getTitle() != null && o2.getTitle() != null) {
            int titleComparison = o1.getTitle().compareTo(o2.getTitle());
            if (titleComparison != 0) {
                return titleComparison;  //NguyenNhatMinh20225886
            }
        }
        // Nếu title giống nhau hoặc một trong hai null, so sánh theo cost
        if (o1.getCost() > o2.getCost()) {
            return -1;  // o1 có cost lớn hơn o2//NguyenNhatMinh20225886
        } else if (o1.getCost() < o2.getCost()) {
            return 1;   // o1 có cost nhỏ hơn o2//NguyenNhatMinh20225886
        }
        return 0;  //NguyenNhatMinh20225886
    }
}
