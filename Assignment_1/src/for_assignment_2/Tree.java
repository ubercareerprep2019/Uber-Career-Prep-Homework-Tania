package for_assignment_2;

public class Tree {
	  public TreeNode root;

	  public Tree(TreeNode root) {
	    this.root = root;
	  }//root
	  
	  public void printInOrder(TreeNode root) {
		  if(root != null) {
		  	printInOrder(root.left);
		  	System.out.println(root.data);
		  	printInOrder(root.right);
		  }//if
	  }//printValue
	  
	  public TreeNode insert(int nodeData, TreeNode root) {
		  TreeNode nodeToInsert = new TreeNode(nodeData, null, null);
		  if(root == null) {
			 root = nodeToInsert;
			 return root;
		  }//if
		  if(nodeData > root.data) {
			  if(root.right == null) {
			  root.right = nodeToInsert;
			  }
		  }//if
		  if(nodeData< root.data) {
			  if(root.left == null) {
			  root.left = nodeToInsert;
			  }
		  }
		  return root;
	  }//insert
	  
	  public boolean find(int numberToFind, TreeNode root) {
		  if(root == null) {
			  return false;
		  }//if
		  if(numberToFind > root.data) {
			  root = root.right;
		  } else if (numberToFind < root.data) {
			  root = root.left;
		  } else {
			  return true;
		  }
		  return false;
	  }//find

	public static void main(String[] args) {
		 TreeNode leftChild = new TreeNode(6, null, null);
		 TreeNode rightChild = new TreeNode(3, null, null);
		 TreeNode left = new TreeNode(7, null, null);
		 TreeNode right = new TreeNode(17, leftChild, rightChild);
		 TreeNode root = new TreeNode(1, left, right);
		 Tree tree = new Tree(root);
		 
		 System.out.println("The InOrder Traversal is the following: ");
		 tree.printInOrder(root);
	 }//main Method
	 
	public static class TreeNode {
		 public int data;
		 public TreeNode left;
		 public TreeNode right;

		 public TreeNode(int data, TreeNode left, TreeNode right) {
		    this.data = data;
		    this.left = left;
		    this.right = right;
		 }// Tree Node
	}//Inner Tree Node Class
	
}//Tree class
