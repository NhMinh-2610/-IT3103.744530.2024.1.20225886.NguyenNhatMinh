package Nhat_DeXX_20241;

public class Kindergarten_20225886 extends Child_20225886 {
    private String favoriteToy_20225886;

    public Kindergarten_20225886(String name_20225886, int age_20225886, String className_20225886, String favoriteToy_20225886) {
        super(name_20225886, age_20225886, className_20225886);
        this.favoriteToy_20225886 = favoriteToy_20225886;
    }

    public String getFavoriteToy_20225886() {
        return favoriteToy_20225886;
    }

    @Override
    public String toString() {
    	return "Kindergarten_20225886: " + super.toString() + ", favoriteToy_20225886: " + favoriteToy_20225886;
    }
}
