package makingListClasses;

import java.util.ArrayList;

public class MyList<T> {
	public int size = 0;
	public int capacity;
	
	T[] mylist;
	T[] mylistTemp;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@SuppressWarnings("unchecked")
	public MyList() {
		setCapacity(10);
		this.mylist = (T[]) new Object[getCapacity()];
	}

	@SuppressWarnings("unchecked")
	public MyList(int capacity) {
		setCapacity(capacity);
		this.mylist = (T[]) new Object[getCapacity()];
	}

	@SuppressWarnings("unchecked")
	public void add(T data) {
		if (this.size < this.capacity - 1) {
			mylist[size] = data;
			setSize(getSize() + 1);
		} 
		else 
		{
			mylistTemp = (T[]) new Object[this.capacity];
			setCapacity(getCapacity() * 2);

			int index = 0;
			for (T value: mylist) {

				mylistTemp[index] = value;
				index++;
			}
			
			index = 0;
			this.mylist = (T[]) new Object[getCapacity()];
			for (T value: mylistTemp) {
				mylist[index] = value;
				index++;

			}
			mylist[size] = data;
			setSize(getSize() + 1);
		}

	}

	public T get(int index) {
		if (index <= getSize()) {
			return mylist[index];
		}

		return null;
	}

	public void remove(int index) {
		int i;
		if (index <= getSize()) {
			for (i = index + 1; i < mylist.length; i++) {
				mylist[i - 1] = mylist[i];
			}

		} 
		setSize(getSize() - 1);

	}

	public void set(int index, T data) {
		if (index <= getSize()) {
			mylist[index] = data;
		}

	}

	public String toString() {
		ArrayList<T> sublist = new ArrayList<>();
		for (T data : mylist) {
			if (data != null) {
				sublist.add(data);
			}
		}

		return sublist.toString();
	}

	public int indexOf(T data) {
		int index = 0;
		for (T indexOf : mylist) {
			if (indexOf == data) {
				return index;
			} 
			else
			{
				index++;
			}
		}
		return -1;
	}

	public int LastIndexOf(T data) {
		for (int i = mylist.length - 1; i >= 0; i--) {
			if (mylist[i] == data) {
				System.out.println("The last index of element: " + mylist[i]);
				return i;
			}
		}
		return -1;

	}

	public boolean isEmpty() {
		for (int i = 0; i < mylist.length; i++) {
			if (mylist[i] != null) {
				System.out.println(mylist[i] + " is Empty!");
				return false;
			}
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public T[] toArray() {
		T[] arrays = (T[]) new Object[getSize()];
		for (int i = 0; i < getSize(); i++) {
			arrays[i] = mylist[i];
		}
		return arrays;
	}

	public void clear() {
		for (int i = 0; i < mylist.length; i++) {
			mylist[i] = null;
		}
	}

	public MyList<T> sublist(int start, int finish) {
		MyList<T> arrayList = new MyList<>();
		for (int i = start; i < finish + 1; i++) {
			arrayList.add(mylist[i]);
			System.out.println("A new element has been added: " + arrayList);
		}
		return arrayList;	
	}

	public boolean contains(T data) {
		for (T search : mylist) {
			if (search == data) {
				System.out.println("The " + data + " element is found!");
				return true;		
			}
		}
		System.out.println("The " + data + " element is not found!\nPlease enter the correct numbers!");
		return false;
	}

}
