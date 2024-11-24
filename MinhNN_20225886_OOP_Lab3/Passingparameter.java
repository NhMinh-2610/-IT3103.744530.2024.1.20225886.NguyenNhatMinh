package customer;
public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", "Adventure", "Unknown", 90, 15.99f);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella", "Animation", "Disney", 120, 20.00f);
        DigitalVideoDisc[] dvds = {jungleDVD, cinderellaDVD};//NguyenNhatMinh20225886
        swap(dvds, 0, 1);    
        System.out.println("Jungle DVD title: " + dvds[0].getTitle());
        System.out.println("Cinderella DVD title: " + dvds[1].getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());//NguyenNhatMinh20225886
        System.out.println("Jungle DVD title after change: " + jungleDVD.getTitle());
    }
    public static void swap(DigitalVideoDisc[] dvds, int index1, int index2) {
        DigitalVideoDisc tmp = dvds[index1];//NguyenNhatMinh20225886
        dvds[index1] = dvds[index2];//NguyenNhatMinh20225886
        dvds[index2] = tmp;//NguyenNhatMinh20225886
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd.setTitle(title);
    }
}