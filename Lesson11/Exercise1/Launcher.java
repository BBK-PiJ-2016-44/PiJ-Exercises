// Exercise 1

public class Launcher { 
	
	public static void main(String[] args) { 
		Launcher e = new Launcher();
		e.launch();		
	}
	
	public void launch() { 
		IntegerTreeNode itn = new IntegerTreeNode(6);
		itn.add(9);
		itn.add(5);
		itn.add(3);
		itn.add(11);
		itn.add(8);	
		itn.add(12);
		itn.add(13);
		itn.add(14);
		itn.add(15);
		itn.add(16);
		
		
		System.out.println("Max: " + itn.getMax());
		System.out.println("Min: " + itn.getMin());
		System.out.println("Tree has 10: " + itn.contains(9));
		System.out.println("Tree has 0: " + itn.contains(0));
		
		System.out.println(itn.toString());
		System.out.println(itn.simpleToString());
		
		System.out.println("Depth: " + itn.depth());
	}
}