package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.print.attribute.standard.Media;

public class Book extends Media {
    private static final long serialVersionUID = 1L;//NguyenNhatMinh20225886
    private List<String> authors = new ArrayList<>();//NguyenNhatMinh20225886

    public Book(int id, String title, String category, float cost) {
        super(id);//NguyenNhatMinh20225886
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author is already in the list");//NguyenNhatMinh20225886
            return;
        }
        authors.add(authorName);
        System.out.println("Added author successfully");
    }//NguyenNhatMinh20225886

    public void removeAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            System.out.println("Author is absent in the list");//NguyenNhatMinh20225886
            return;
        }
        authors.remove(authorName);
        System.out.println("Removed author successfully");//NguyenNhatMinh20225886
    }

    public List<String> getAuthors() {
        return authors;//NguyenNhatMinh20225886
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;//NguyenNhatMinh20225886
    }

    public void removeAuthor1(String authorName, List<String> author) {
        if (!author.contains(authorName)) {
            System.out.println("Author is absent in the list");//NguyenNhatMinh20225886
            return;
        }
        author.remove(authorName);
        System.out.println("Removed author successfully");//NguyenNhatMinh20225886
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();//NguyenNhatMinh20225886
        result = prime * result + Objects.hash(authors);//NguyenNhatMinh20225886
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;//NguyenNhatMinh20225886
        return Objects.equals(authors, other.authors);//NguyenNhatMinh20225886
    }

    private String getId() {
        return null;//NguyenNhatMinh20225886
    }

    private String getCost() {
        return null;//NguyenNhatMinh20225886
    }

    private String getTitle() {
        return null;//NguyenNhatMinh20225886
    }

    public void print() {
        System.out.println(getId() + ". Book " + getTitle() + " " + getCategory() + " - ");
        for (String author : authors) {
            System.out.print(author + " - ");//NguyenNhatMinh20225886
        }
        System.out.println(getCost() + "$");//NguyenNhatMinh20225886
    }
}
