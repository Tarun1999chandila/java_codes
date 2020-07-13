package Graph;

public class gpclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
graph gp=new graph(7);
gp.addedge(1, 4, 2);
gp.addedge(1, 2, 1);
gp.addedge(2, 3, 3);
gp.addedge(3, 4, 3);
gp.addedge(4, 5, 5);
gp.addedge(5, 6, 6);
gp.addedge(5, 7, 3);
gp.addedge(6, 7, 9);
System.out.println(gp);
//gp.containsedge(1, 7);
//gp.removeedge(2, 3);
//gp.removeedge(6, 7);
//gp.removeedge(4, 5);
//gp.numedge();
System.out.println(gp.bfs(1, 6));
System.out.println(gp.dfs(1, 6));
gp.bft();
System.out.println("--------------------");
gp.dft();
System.out.println("------");
System.out.println(gp.iscyclic());
System.out.println(gp.isconnected());
System.out.println(gp.istree());
System.out.println(gp.getcc());
System.out.println("---------");
System.out.println(gp.isbipartite());
	}

}
