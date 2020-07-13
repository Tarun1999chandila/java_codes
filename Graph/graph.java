package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class graph {
	private int numv;
	private int[][] matrix;

	public graph(int v) {
		numv = v;
		matrix = new int[numv + 1][numv + 1];
	}

	public void addedge(int u, int v, int cost) {
		matrix[u][v] = cost;
		matrix[v][u] = cost;
	}

	public int removeedge(int u, int v) {
		int temp = matrix[u][v];
		matrix[u][v] = 0;
		matrix[v][u] = 0;
		return temp;
	}

	public int numedge() {
		int count = 0;

		for (int i = 1; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				if (matrix[i][j] != 0)
					count++;
			}
		}
		return count;
	}

	public boolean containsedge(int u, int v) {
		return matrix[u][v] != 0;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 1; i <= numv; i++) {
			str += i + "->";
			for (int j = 1; j <= numv; j++) {
				if (matrix[i][j] != 0) {
					str += j + "@" + matrix[i][j];
				}

			}
			str += "\n";
		}
		return str;
	}

	public boolean haspath(int src, int dst, HashMap<Integer, Boolean> visited) {
		visited.put(src, true);
		if (src == dst) {
			return true;
		}
		// boolean ans=false;
		for (int nbr = 1; nbr < matrix[0].length; nbr++) {
			if (matrix[nbr][dst] != 0 && !visited.containsKey(nbr)) {
				boolean ans = haspath(nbr, dst, visited);
				if (ans) {
					return true;
				}
			}

		}
		return false;
	}

	public void printllpaths(int src, int dst, HashMap<Integer, Boolean> visited, String asf) {
		visited.put(src, true);
		if (src == dst) {
			System.out.println(asf + src);
			visited.remove(asf);
			return;
		}
		// boolean ans=false;
		for (int nbr = 1; nbr < matrix[0].length; nbr++) {
			if (matrix[nbr][dst] != 0 && !visited.containsKey(nbr)) {
				printllpaths(nbr, dst, visited, asf + src);

			}

			visited.remove(src);
		}

	}

	public class pair {
		private int vname;
		private String psf;
private String color;
		public pair(int v, String s) {
			this.vname = v;
			this.psf = s;

		}
		public pair(int v, String s,String color) {
			this.vname = v;
			this.psf = s;
this.color=color;
		}

	}

	public boolean bfs(int src, int dst) {
		HashMap<Integer, Boolean> visited = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		pair sp = new pair(src, src + "");
		queue.addLast(sp);
		while (!queue.isEmpty()) {
			pair rp = queue.removeFirst();
			if (visited.containsKey(rp.vname)) {
				continue;
			}
			visited.put(rp.vname, true);
			if (rp.vname == dst) {
				System.out.println(rp.psf);
				return true;
			}
			for (int nbr = 1; nbr < matrix[0].length; nbr++) {
				if (matrix[rp.vname][nbr] != 0 && !visited.containsKey(nbr)) {
					pair np1 = new pair(nbr, rp.psf + nbr);
					queue.addLast(np1);
				}
			}
		}
		return false;
	}

	public boolean dfs(int src, int dst) {
		HashMap<Integer, Boolean> visited = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		pair sp = new pair(src, src + "");
		queue.addFirst(sp);
		while (!queue.isEmpty()) {
			pair rp = queue.removeFirst();
			if (visited.containsKey(rp.vname)) {
				continue;
			}
			visited.put(rp.vname, true);
			if (rp.vname == dst) {
				System.out.println(rp.psf);
				return true;
			}
			for (int nbr = 1; nbr < matrix[0].length; nbr++) {
				if (matrix[rp.vname][nbr] != 0 && !visited.containsKey(nbr)) {
					pair np1 = new pair(nbr, rp.psf + nbr);
					queue.addFirst(np1);
				}
			}
		}
		return false;
	}

	public void bft() {
		HashMap<Integer, Boolean> visited = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		for (int src = 0; src < matrix[0].length; src++) {
			if (visited.containsKey(src)) {
				continue;

			}
			pair sp = new pair(src, src + "");
			queue.addLast(sp);
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();
				if (visited.containsKey(rp.vname)) {
					continue;
				}
				visited.put(rp.vname, true);
				System.out.println(rp.vname + "via" + rp.psf);
				for (int nbr = 1; nbr < matrix[0].length; nbr++) {
					if (matrix[rp.vname][nbr] != 0 && !visited.containsKey(nbr)) {
						pair np1 = new pair(nbr, nbr + rp.psf);
						queue.addLast(np1);
					}
				}
			}
		}

	}

	public void dft() {
		HashMap<Integer, Boolean> visited = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		for (int src = 0; src < matrix[0].length; src++) {
			if (visited.containsKey(src)) {
				continue;

			}
			pair sp = new pair(src, src + "");
			queue.addFirst(sp);
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();
				if (visited.containsKey(rp.vname)) {
					continue;
				}
				visited.put(rp.vname, true);
				System.out.println(rp.vname + "via" + rp.psf);
				for (int nbr = 1; nbr < matrix[0].length; nbr++) {
					if (matrix[rp.vname][nbr] != 0 && !visited.containsKey(nbr)) {
						pair np1 = new pair(nbr, nbr + rp.psf);
						queue.addFirst(np1);
					}
				}
			}
		}

	}

	public boolean iscyclic() {
		HashMap<Integer, Boolean> visited = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		for (int src = 0; src < matrix[0].length; src++) {
			if (visited.containsKey(src)) {
				continue;

			}
			pair sp = new pair(src, src + "");
			queue.addLast(sp);
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();
				if (visited.containsKey(rp.vname)) {
					return true;
				}
				visited.put(rp.vname, true);
				// System.out.println(rp.vname+"via"+rp.psf);
				for (int nbr = 1; nbr < matrix[0].length; nbr++) {
					if (matrix[rp.vname][nbr] != 0 && !visited.containsKey(nbr)) {
						pair np1 = new pair(nbr, nbr + rp.psf);
						queue.addLast(np1);
					}
				}
			}

		}
		return false;
	}

	public boolean isconnected() {
		HashMap<Integer, Boolean> visited = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		int count = 0;
		for (int src = 1; src < matrix[0].length; src++) {
			if (visited.containsKey(src)) {
				continue;

			}
			count++;
			pair sp = new pair(src, src + "");

			queue.addLast(sp);

			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();
				if (visited.containsKey(rp.vname)) {
					continue;
				}
				visited.put(rp.vname, true);
				// System.out.println(rp.vname+"via"+rp.psf);
				for (int nbr = 1; nbr < matrix[0].length; nbr++) {
					if (matrix[rp.vname][nbr] != 0 && !visited.containsKey(nbr)) {
						pair np1 = new pair(nbr, nbr + rp.psf);
						queue.addLast(np1);
					}
				}
			}

		}
		return count == 1;
	}
	public boolean istree() {
		return !iscyclic()&&isconnected();
	}
public ArrayList<ArrayList<Integer>> getcc(){
	HashMap<Integer, Boolean> visited = new HashMap<>();
	ArrayList<ArrayList<Integer>> tres=new ArrayList<>();
	LinkedList<pair> queue = new LinkedList<>();
	for (int src = 0; src < matrix[0].length; src++) {
		if (visited.containsKey(src)) {
			continue;

		}
		ArrayList<Integer> comp=new ArrayList<>();
			pair sp = new pair(src, src + "");
		queue.addLast(sp);
		while (!queue.isEmpty()) {
			pair rp = queue.removeFirst();
			if (visited.containsKey(rp.vname)) {
				continue;
			}
		
			
			visited.put(rp.vname, true);
			comp.add(rp.vname);
			System.out.println(rp.vname + "via" + rp.psf);
			for (int nbr = 1; nbr < matrix[0].length; nbr++) {
				if (matrix[rp.vname][nbr] != 0 && !visited.containsKey(nbr)) {
					pair np1 = new pair(nbr, nbr + rp.psf);
					queue.addLast(np1);
				}
			}
			tres.add(comp);
		}
		
	}
return tres;
}
public boolean isbipartite() {
	HashMap<Integer, String> visited = new HashMap<>();
	LinkedList<pair> queue = new LinkedList<>();
	for (int src = 0; src < matrix[0].length; src++) {
		if (visited.containsKey(src)) {
			continue;

		}
		pair sp = new pair(src, src + "","R");
		queue.addLast(sp);
		while (!queue.isEmpty()) {
			pair rp = queue.removeFirst();
			if (visited.containsKey(rp.vname)) {
				String oc=visited.get(rp.vname);
				String nc=rp.color;
				if(!oc.contentEquals(nc)) {
					return false;
				}
				continue;
				
			}
			visited.put(rp.vname,rp.color);
			//System.out.println(rp.vname + "via" + rp.psf);
			for (int nbr = 1; nbr < matrix[0].length; nbr++) {
				if (matrix[rp.vname][nbr] != 0 && !visited.containsKey(nbr)) {
					String nc=rp.color=="R"?"G":"R";
					pair np1 = new pair(nbr, nbr + rp.psf,nc);
					queue.addLast(np1);
				}
			}
		}
	}
return true;
}
private class primespair{
	int vname;
	int aq
}
}