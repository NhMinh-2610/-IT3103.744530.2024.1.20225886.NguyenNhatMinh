package hust.soict.dsai.aims.media;

public class CompactDisc {
    public class Disc extends Media {
        private String director;
        private int length;//NguyenNhatMinh20225886

        public Disc(int id, String title) {
            super(id, title);
            //NguyenNhatMinh20225886
        }

        public Disc(int id, String title, String category, float cost, String director, int length) {
            super(id, title, category, cost);//NguyenNhatMinh20225886
            this.director = director;//NguyenNhatMinh20225886
            this.length = length;//NguyenNhatMinh20225886
        }

        public String getDirector() {
            return director;//NguyenNhatMinh20225886
        }

        public void setDirector(String director) {
            this.director = director;//NguyenNhatMinh20225886
        }

        public int getLength() {
            return length;//NguyenNhatMinh20225886
        }

        public void setLength(int length) {
            this.length = length;//NguyenNhatMinh20225886
        }
    }
}