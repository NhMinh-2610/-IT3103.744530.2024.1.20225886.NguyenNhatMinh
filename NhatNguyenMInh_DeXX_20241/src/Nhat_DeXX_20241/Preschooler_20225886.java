package Nhat_DeXX_20241;

public class Preschooler_20225886 extends Child_20225886 {
    private String guardian_20225886;

    public Preschooler_20225886(String name_20225886, int age_20225886, String className_20225886, String guardian_20225886) {
        super(name_20225886, age_20225886, className_20225886);
        this.guardian_20225886 = guardian_20225886;
    }

    public String getGuardian_20225886() {
        return guardian_20225886;
    }

    @Override
    public String toString() {
    	
    	return "Preschooler_20225886: " + super.toString() + ", guardian_20225886: " + guardian_20225886;
    }
}
