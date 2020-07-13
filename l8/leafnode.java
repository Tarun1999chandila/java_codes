package l8;


	public class leafnode {

		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {

			leafnode m = new leafnode();
			GenericTree gt = m.new GenericTree();
			System.out.println(gt.countLeafNodes());
		}

		private class GenericTree {
			private class Node {
				int data;
				ArrayList<Node> children = new ArrayList<>();
			}

			private Node root;

			public GenericTree() {
				this.root = this.takeInput(scn, null, -1);
			}

			private Node takeInput(Scanner scn, Node parent, int i) {

				int childData = scn.nextInt();

				int numGC = scn.nextInt();

				Node child = new Node();
				child.data = childData;

				for (int j = 0; j < numGC; j++) {
					Node gc = this.takeInput(scn, child, j);
					child.children.add(gc);
				}

				return child;
			}

			public int countLeafNodes() {
				return this.countLeafNodes(this.root);
			}

			private int countLeafNodes(Node node) {
	int count=1;
	int th = -1;
			for (Node child : node.children) {
				int nh = countLeafNodes(child);
				if (nh > th) {
					th = nh;
				return th+1;
					
		}
			

				}
					if(th+1==0){
		         count++;
	        	}
			
				return count;
				
			}
		

	}
	}


}
