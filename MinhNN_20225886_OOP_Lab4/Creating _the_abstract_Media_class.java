package hust.soict.dsai.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(int id, String title) {
        this.id = id;//NguyenNhatMinh20225886
        this.title = title;//NguyenNhatMinh20225886
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;//NguyenNhatMinh20225886
        this.title = title;//NguyenNhatMinh20225886
        this.category = category;//NguyenNhatMinh20225886
        this.cost = cost;  //NguyenNhatMinh20225886
    }

    public void print() {
    }

    public int getId() {
        return id;//NguyenNhatMinh20225886
    }

    public void setId(int id) {
        this.id = id;//NguyenNhatMinh20225886
    }

    public String getTitle() {
        return title;//NguyenNhatMinh20225886
    }

    public String getCategory() {
        return category;//NguyenNhatMinh20225886
    }

    public void setCategory(String category) {
        this.category = category;//NguyenNhatMinh20225886
    }

    public float getCost() {
        return cost;//NguyenNhatMinh20225886
    }

    public void setCost(float cost) {
        this.cost = cost;  //NguyenNhatMinh20225886
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost + '}';//NguyenNhatMinh20225886
    }
}
