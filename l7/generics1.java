package l7;

public class generics1 {

	public static void main(String[] args) {

		// Pair<String, Integer> p = new Pair<>();

		LinkedListGeneric<car> ll = new LinkedListGeneric<>();

		car[] carr = new car[5];
		carr[0] = new car(100, "Black", 40);
		carr[1] = new car(300,  "White",2);
		carr[2] = new car(40, "Grey", 56);
		carr[3] = new car(80, "Red", 89);
		carr[4] = new car(90, "Yellow", 3);

		ll.addFirst(carr[0]);
		ll.addLast(carr[1]);
		ll.addLast(carr[2]);
		ll.addLast(carr[3]);
		ll.addFirst(carr[4]);

		ll.display();

	}
}
