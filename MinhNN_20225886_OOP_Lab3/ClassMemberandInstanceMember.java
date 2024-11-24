
package customer;
import java.util.Objects;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDisc = 0;
    private int id;//NguyenNhatMinh20225886
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor khong tham so
    public DigitalVideoDisc() {
        synchronized (DigitalVideoDisc.class) {
            nbDigitalVideoDisc++;//NguyenNhatMinh20225886
            this.id = nbDigitalVideoDisc;
        }
    }

    public int getId() {
        return id;
    }
}
    // Constructor day du
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;//NguyenNhatMinh20225886
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        synchronized (DigitalVideoDisc.class) {
            nbDigitalVideoDisc++;
            this.id = nbDigitalVideoDisc;
        }
    }
    public String getTitle() {
        return title;//NguyenNhatMinh20225886
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDirector() {
        return director;//NguyenNhatMinh20225886
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;//NguyenNhatMinh20225886
    }
    public void setLength(int length) {
        this.length = length;
    }
    public float getCost() {
        return cost;//NguyenNhatMinh20225886
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
    
    public String toString() {
        return "DVD-"+ title + 
               " - " + category + 
               " - " + director + 
               " - " + length + ": "+ 
               cost + "$" 
     }//NguyenNhatMinh20225886
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DigitalVideoDisc disc = (DigitalVideoDisc) obj;//NguyenNhatMinh20225886
        return Objects.equals(title, disc.title) &&
               Objects.equals(category, disc.category) &&
               Objects.equals(director, disc.director);//NguyenNhatMinh20225886
    }