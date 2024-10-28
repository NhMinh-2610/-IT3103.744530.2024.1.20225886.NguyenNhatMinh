
public class Cart_MinhNN_20225886 {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc_MinhNN_20225886 itemOrdered[] = 
			new DigitalVideoDisc_MinhNN_20225886 [MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc_MinhNN_20225886(DigitalVideoDisc_MinhNN_20225886 disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full. Cannot add more discs.");
        }
    }
	public void removeDigitalVideoDisc_MinhNN_20225886(DigitalVideoDisc_MinhNN_20225886 disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].equals(disc)) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemOrdered[j] = itemOrdered[j+1];
				}
				itemOrdered[qtyOrdered - 1] = null;
				qtyOrdered--;
				System.out.println("The disc has been removed.");
				return;
			}
		}
		System.out.println("Cannot found the disc in the cart!");
	}
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemOrdered[i].getCost();
		}
		return total;
	}
	
}
