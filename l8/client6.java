package l8;

public class client6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] in= {10,50,75,100,150,200,300 };
		bst b=new bst(in);

//b.printinrange(10, 260);
//b.replacewithsumlarger();
//
//b.display();
b.addreturn(30);

b.display();
System.out.println("-----------------");
b.remove(100);
b.display();
System.out.println("-----------------");
	}

}
