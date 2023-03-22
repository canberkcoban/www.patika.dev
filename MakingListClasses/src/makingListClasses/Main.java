package makingListClasses;

public class Main {

	public static void main(String[] args) {
		MyList<Integer> list = new MyList(); 
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		
		System.out.println("The Number of element in the list: " + list.getSize());
		
		System.out.println("The Capacitiy of the list: " + list.getCapacity());
		
		list.add(70);
		list.add(60);
		
		System.out.println("The Number of element in the list: " + list.getSize());
		
		System.out.println("The Capacitiy of the list: " + list.getCapacity());
		
		list.add(90);
		list.add(50);
		list.add(110);
		list.add(75);
		
		System.out.println("The Number of element in the list: " + list.getSize());
		
		System.out.println("The Capacitiy of the list: " + list.getCapacity());
		
		System.out.println("Checking whether the list is Full or Empty: " + (list.isEmpty() ? "Empty" : "Full"));
		
		System.out.println("The Index: " + list.indexOf(10));
		
		System.out.println("The Index: " + list.indexOf(55));
		
		System.out.println("The Index: " + list.LastIndexOf(50));
		
		Object[] array = list.toArray();
		System.out.println("The first element of the NameofArray: " + array[0]);
		System.out.println("The second element of the NameofArray: " + array[1]);
		System.out.println("The third element of the NameofArray: " + array[2]);
		System.out.println("The fourth element of the NameofArray: " + array[3]);
		System.out.println("The fifth element of the NameofArray: " + array[4]);
		System.out.println("The sixth element of the NameofArray: " + array[5]);
		System.out.println("The seventh element of the NameofArray: " + array[6]);
		System.out.println("The eighth element of the NameofArray: " + array[7]);
		System.out.println("The nineth element of the NameofArray: " + array[8]);
		System.out.println("The tenth element of the NameofArray: " + array[9]);
		
		MyList<Integer> subOfList = list.sublist(0, 5);
		System.out.println("The new sub of list: " + subOfList.toString());
		//System.out.println("The new sub of list: " + subOfList.toArray());
		
		System.out.println("Is the number 55 on the list or not ? " + list.contains(55));
		System.out.println("Is the number 90 on the list or not ? " + list.contains(90));
		
		list.clear();
		System.out.println("The final version of the list: " + list.toString());
		
		
		
		
		

	}

}
