
package l8;

//import l8.binarytree.Node;

public class bst {

	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;
	public bst() {
		
	}

	public bst(int[] in) {
		root = construct(in, 0, in.length - 1);
	}

	private Node construct(int[] in, int lo, int hi) {
		if (lo > hi) {
			return null;
		}
		int mid = (lo + hi) / 2;
		Node nn = new Node();
		int temp = in[mid];
		nn.data = temp;
		nn.left = construct(in, lo, mid - 1);
		nn.right = construct(in, mid + 1, hi);
		return nn;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		String str = "";
		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}

		str += "-->" + node.data + "<--";
		if (node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}
		System.out.println(str);
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}

	}

	public int size() {
		return size (root);
		
		
	}
	private int size(Node node) {
		if(node==null) {
			return 0;
		}
		int ln=size(node.left);
		int rn=size(node.right);
		
	return ln+rn+1;
	}

	public void max() {
		System.out.println(max(root));
	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		}
		return max(node.right);
	}

	public void find(int item) {
		System.out.println(find(item, root));
	}

	private boolean find(int item, Node node) {
		if (node == null) {
			return false;
		}
		if (item < node.data) {
			return find(item, node.left);
		} else if (item > node.data) {
			return find(item, node.right);
		} else {
			return true;
		}

	}

	public void ht() {
		System.out.println(ht(root));
	}

	private int ht(Node node) {

		if (node == null) {
			return -1;
		}
		int t = -1;
		if (node.left != null) {
			int lh = ht(node.left);
			if (lh > t) {
				t = lh;
			}
		}
		if (node.right != null) {
			int rh = ht(node.right);
			if (rh > t) {
				t = rh;
			}
		}
		return t + 1;
	}
	public void printinrange(int lo,int hi) {
		 printinrange(root,lo,hi);
	}
	private void printinrange(Node node,int lo,int hi) {
 if(node==null) {
	 return;
 }
		
	if(node.data>hi) {
		printinrange(node.left,lo,hi);
		
	}
		if(node.data<lo) {
	printinrange(node.right,lo,hi);
	
		}
	
		if(node.data>=lo&&node.data<=hi) {
			printinrange(node.left,lo,hi);
			System.out.println(node.data);
			printinrange(node.right,lo,hi);
	
		}
	}
	public void replacewithsumlarger() {
		int [] maxsum=new int [1];
		replacewithsumlarger(root,maxsum);
			// return maxsum[0];
	}
	private void replacewithsumlarger(Node node,int [] maxsum) {
		if(node==null) {
			return;
		}
		replacewithsumlarger(node.right,maxsum);
		int temp=node.data;
		node.data=maxsum[0];
		maxsum[0]=temp;
		replacewithsumlarger(node.left,maxsum);
	}
	public void addreturn(int item) {
		root=addreturn(root,item);
	}
	private Node addreturn(Node node,int item) {
		
		if(node==null) {
			Node nn=new Node();
			nn.data=item;
			return nn;
		}
		if(item<=node.data) {
	node.left=addreturn(node.left,item);
		}
		else {
			node.right=addreturn(node.right,item);
		}
		return node;
	}
	
	public void addreturn1(int item) {
		
		root=addreturn(root,item);
	}
	private Node addreturn1(Node node,int item) {
		
		if(node==null) {
			Node nn=new Node();
			nn.data=item;
			return nn;
		}
		if(item<=node.data) {
			if(node.left==null) {
				Node nn=new Node();
				nn.data=item;
			
			}
	node.left=addreturn(node.left,item);
		}
		else {
			node.right=addreturn(node.right,item);
		}
		return node;
	}
	public void remove(int item) {
		if(root.data==item) {
			if(root.left==null&&root.right!=null) {
				root=root.right;
			}
			else if(root.left!=null&&root.right==null) {
				root=root.left;
			}
			else {
				remove(root,null,item);
			}
		}
		remove(root,null,item);
	}
	private void remove(Node node,Node parent,int item) {
		if(node==null) {
			return;
		}
		if(item<node.data) {
			remove(node.left,node,item);
		}
		else if(item>node.data) {
			remove(node.right,node,item);
		}
		else {
			if(node.left==null&&node.right==null) {
				if(item<parent.data) {
					parent.left=null;
				}else {
					parent.right=null;
				}
			}
			else if(node.left!=null&&node.right==null) {
				if(item<parent.data) {
					parent.left=node.left;
				}
				else {
					parent.right=node.left;
				}
			}
			else if(node.left==null&&node.right!=null) {
				if(item<parent.data) {
					parent.left=node.right;
				}
				else {
					parent.right=node.right;
				}
			}
			else {
				int m=max(node.left);
				node.data=m;
				remove(node.left,node,m);
			}
		}
	}
	}




