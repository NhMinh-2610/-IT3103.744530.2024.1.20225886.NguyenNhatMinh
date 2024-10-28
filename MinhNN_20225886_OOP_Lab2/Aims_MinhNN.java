
public class Aims_MinhNN_20225886 {
	public static void main(String[] args) {
		Cart anOrder = new Cart_MinhNN_20225886();

        DigitalVideoDisc_MinhNN_20225886 dvd1 = new DigitalVideoDisc_MinhNN_20225886("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc_MinhNN_20225886(dvd1);

        DigitalVideoDisc_MinhNN_20225886 dvd2 = new DigitalVideoDisc_MinhNN_20225886("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc_MinhNN_20225886(dvd2);

        DigitalVideoDisc_MinhNN_20225886 dvd3 = new DigitalVideoDisc_MinhNN_20225886("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc_MinhNN_20225886(dvd3);

        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
      
		anOrder.removeDigitalVideoDisc_MinhNN_20225886(dvd1);
		anOrder.removeDigitalVideoDisc_MinhNN_20225886(dvd1);
	}
}
