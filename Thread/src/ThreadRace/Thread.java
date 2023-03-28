package ThreadRace;

import java.util.ArrayList;


public class Thread implements Runnable {
	
	private boolean isRun =  true;
	private volatile int number;
	private ArrayList<Integer> fourthArrayList;
	
	ArrayList<Integer> mainList = new ArrayList<>();
	ArrayList<Integer> evenList = new ArrayList<>();
	ArrayList<Integer> oddList = new ArrayList<>();
	ArrayList<Integer> firstList = new ArrayList<>();
	ArrayList<Integer> secondList = new ArrayList<>();
	ArrayList<Integer> thirdList = new ArrayList<>();
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void stop() {
		this.isRun = false;
	}
	
	
	public void addAll(ArrayList<Integer> arrayList) {
		for(int i = 1; i <= 10000; i++) {
			arrayList.add(i);
		}
	}
	
	public void addList(ArrayList<Integer> listMain, ArrayList<Integer> listFirst, ArrayList<Integer> listSecond, ArrayList<Integer> listThird, ArrayList<Integer> listFourth) {
		for(int i = 0; i < listMain.size(); i++) {
			if(i <= 2500) {
				listFirst.add(listMain.get(i));
			}
			
			else if(i > 2500 && i <= 5000) {
				listSecond.add(listMain.get(i));
			}
			
			else if(i > 5000 && i <= 7500) {
				listThird.add(listMain.get(i));
			}
			
			else {
				listFourth.add(listMain.get(i));
			}
		}
	}
	
	@Override
	public void run() {
		System.out.print(java.lang.Thread.currentThread().getName() + "\t" + this.getNumber() + " ");
		
		if(this.mainList.size() == 0) {
			addAll(this.mainList);
		}
		
		if(this.firstList.size() == 0) {
			addList(mainList, firstList, secondList, thirdList, fourthArrayList);
		}
		
		evenOrOdd();
		
		System.out.println("The Even numbers added to the list are respectively, showing: " + this.evenList);
		
		System.out.println();
		
		System.out.println("The Odd numbers added to the list are respectively, showing: " + this.oddList);


	}
	
	public synchronized void evenOrOdd() {
		
		try {
			java.lang.Thread.sleep(100);
        }
		
		catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
		
		System.out.println(java.lang.Thread.currentThread().getName());
		
		if(java.lang.Thread.currentThread().getName().equals("pool-1-thread-1")) {
			for(int i = 1; i <= this.firstList.size(); i++) {
				if(!this.evenList.contains(i) && !this.oddList.contains(i)) {
					
					if(i % 2 == 0) {
						this.evenList.add(i);
						System.out.println("An Even number has been added to the list. Even number: " + i);
						System.out.println("The Number of All Even Numbers: " + this.evenList.size());
						break;
					}
					
					else {
						this.oddList.add(i);
						System.out.println("An Odd number has been added to the list. Even number: " + i);
						System.out.println("The Number of All Odd Numbers: " + this.oddList.size());
						break;
					}
				}
			}
				
		}
		
		else if(java.lang.Thread.currentThread().getName().equals("pool-1-thread-2")) {
			for(int i = 2501; i <= this.secondList.get(this.secondList.size() - 1); i++) {
				if(!this.evenList.contains(i) && !this.oddList.contains(i)) {
					
					if(i % 2 == 0) {
						this.evenList.add(i);
						System.out.println("An Even number has been added to the list. Even number: " + i);
						System.out.println("The Number of All Even Numbers: " + this.evenList.size());
						break;
					}
					
					else {
						this.oddList.add(i);
						System.out.println("An Odd number has been added to the list. Even number: " + i);
						System.out.println("The Number of All Odd Numbers: " + this.oddList.size());
						break;
					}
				}
			}
		}
		
		
		else if(java.lang.Thread.currentThread().getName().equals("pool-1-thread-3")) {
			for(int i = 5001; i <= this.thirdList.get(this.thirdList.size() - 1); i++) {
				if(!this.evenList.contains(i) && !this.oddList.contains(i)) {
					
					if(i % 2 == 0) {
						this.evenList.add(i);
						System.out.println("An Even number has been added to the list. Even number: " + i);
						System.out.println("The Number of All Even Numbers: " + this.evenList.size());
						break;
					}
					
					else {
						this.oddList.add(i);
						System.out.println("An Odd number has been added to the list. Even number: " + i);
						System.out.println("The Number of All Odd Numbers: " + this.oddList.size());
						break;
					}
				}
			}
		}
		
		
		else if(java.lang.Thread.currentThread().getName().equals("pool-1-thread-4")) {
			for(int i = 7501; i <= this.fourthArrayList.get(this.fourthArrayList.size() - 1); i++) {
				if(!this.evenList.contains(i) && !this.oddList.contains(i)) {
					
					if(i % 2 == 0) {
						this.evenList.add(i);
						System.out.println("An Even number has been added to the list. Even number: " + i);
						System.out.println("The Number of All Even Numbers: " + this.evenList.size());
						break;
					}
					
					else {
						this.oddList.add(i);
						System.out.println("An Odd number has been added to the list. Even number: " + i);
						System.out.println("The Number of All Odd Numbers: " + this.oddList.size());
						break;
					}
				}
			}
		}


		
	}
		
		
}
	
	
	