package l8;

//import java.util.LinkedList;

public class client3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		linkedlist list = new linkedlist();
//LinkedList list = new LinkedList();
		list.addlast(10);
		list.addlast(20);
		list.addfirst(30);
		list.addlast(40);
		list.display();
//list.addAt(50, 1);
list.addAt(30, 2);
list.addlast(50);
list.addlast(60);
list.addlast(70);

//		System.out.println(list.removeFirst());
//		list.display();
//		System.out.println(list.removeLast());
//		list.display();
	//System.out.println(list.removeAt(1));
	list.display();
//list.RDI();		
//list.display();
//list.RPI();		
//list.display();
//list.RPR();
//list.display();
//list.RDR();
////list.display();
//list.fold();
//list.display();
//System.out.println(list.mid());
////list.display();
//System.out.println(list.kthfromlast(2));
////list.RDR();
list.linkedListIntersection();
System.out.println(list.linkedListIntersection());
//list.display();
//detectloop();
list.kreverse(2);
list.display();
	}


}

