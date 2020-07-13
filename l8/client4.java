package l8;

public class client4 {
	public static void main(String[] args) {
generictree gr=new generictree();
gr.display();
System.out.println(gr.size());
//10 3 20 2 50 0 60 0 30 0 40 2 70 0 80 0
//10 3 20 2 50 0 60 2 90 0 100 0 30 0 40 2 70 2 110 0 120 0 80 0
System.out.println(gr.max());
System.out.println(gr.find());
System.out.println(gr.height());
System.out.println("-------------------------");
gr.levelOrder();
System.out.println("-------------------------");
gr.levelorderlw2();
System.out.println("-------------------------");
gr.levelorderzz();
System.out.println("-------------------------");
	}

	
}
