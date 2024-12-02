package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(int id, String title) {
        super(id, title);//NguyenNhatMinh20225886
        //NguyenNhatMinh20225886
    }

    public DigitalVideoDisc(int id, String title, String category, String director, float cost) {
        this(id, title);//NguyenNhatMinh20225886
        this.setCategory(category);//NguyenNhatMinh20225886
        this.setCost(cost);//NguyenNhatMinh20225886
        this.setDirector(director);//NguyenNhatMinh20225886
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        this(id, title, category, director, cost);//NguyenNhatMinh20225886
        this.setLength(length);//NguyenNhatMinh20225886
    }

    public void print() {
        System.out.println(getId() + ". DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + "$");
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());//NguyenNhatMinh20225886
        System.out.println("DVD length: " + this.getLength());//NguyenNhatMinh20225886
    }
}
