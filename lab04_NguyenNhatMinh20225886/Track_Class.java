package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;//NguyenNhatMinh20225886
    private int length;//NguyenNhatMinh20225886

    public Track(String title, int length) {
        this.setTitle(title);//NguyenNhatMinh20225886
        this.setLength(length);//NguyenNhatMinh20225886
    }

    public String getTitle() {
        return title;//NguyenNhatMinh20225886
    }

    public void setTitle(String title) {
        this.title = title;//NguyenNhatMinh20225886
    }

    public int getLength() {
        return length;//NguyenNhatMinh20225886
    }

    public void setLength(int length) {
        this.length = length;//NguyenNhatMinh20225886
    }

    public void play() {
        System.out.println("Playing track: " + title);//NguyenNhatMinh20225886
        System.out.println("Track length: " + length + " seconds");//NguyenNhatMinh20225886
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;//NguyenNhatMinh20225886
        if (obj == null || getClass() != obj.getClass()) return false;//NguyenNhatMinh20225886
        Track track = (Track) obj;//NguyenNhatMinh20225886
        return track.getTitle().equals(this.getTitle()) && track.getLength() == this.getLength();//NguyenNhatMinh20225886
    }
}
