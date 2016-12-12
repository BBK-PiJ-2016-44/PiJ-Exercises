// TreeNode class 
public class IntegerTreeNode { 
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	
	// Constructor for IntegerTreeNode
	public IntegerTreeNode(int newNumber){ 
		value = newNumber;
	}
	
	// Add a number to the tree 
	public void add(int newNumber) { 
	
		if (newNumber > this.value) { 
			if (right == null) { 
				right = new IntegerTreeNode(newNumber);
			} else { 
				right.add(newNumber);
			}
		} else { 
			if (left == null) { 
				left = new IntegerTreeNode(newNumber);
			} else { 
				left.add(newNumber);
			}	
		}
	}
	
	
	public boolean contains(int n) { 
		if (n == this.value) { 
			return true;
		} else if (n > this.value) { 
			if(right == null){
				return false;
			} else { 
				return right.contains(n);
			}
		} else { 
			if (left == null) { 
				return false;
			} else { 
				return left.contains(n);
			}	
		}
	}
	
	// Keep moving right until largest is reached, return this number
	public int getMax(){ 
		if (this.right != null){ 
			return this.right.getMax();
		} else { 
			return this.value;
		}
	}
	
	// Keep moving left until smallest is reached, return this number
	public int getMin(){ 
		if (this.left != null){ 
			return this.left.getMin();
		} else { 
			return this.value;
		}
	}
	
	public String toString() { 
		String str = "";
		str = str + "[" + Integer.toString(this.value) + " ";
		
		if (this.left != null){
			str = str + "L" + this.left.toString();
		} else { 
			str = str + "L[]";
		}
		
		if (this.right != null){
			str = str + "R" + this.right.toString();
		} else { 
			str = str + "R[]";
		}
		str = str + "]";
		return str;
	}
	
	public String simpleToString() { 
		String str = "";
		str = str + "[" + Integer.toString(this.value) + "";
		
		if (this.left != null){
			str = str + this.left.simpleToString();
		}
		
		if (this.right != null){
			str = str + this.right.simpleToString();
		}
		str = str + "]";
		return str;
	}
	
	// Depth method
	public int depth() { 
		int result = 0;
		int ldeep = 0;
		int rdeep = 0;
		
		if (left != null){ 
			ldeep = 1 + left.depth();
		}
		if (right != null){ 
			rdeep = 1 + right.depth();
		}
		
		if (ldeep >= rdeep){ 
			return ldeep;
		} else { 
			return rdeep;
		}
	
	
	}
}



















