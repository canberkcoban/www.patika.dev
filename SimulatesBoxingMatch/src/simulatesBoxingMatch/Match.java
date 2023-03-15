package simulatesBoxingMatch;

public class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
		
		if(isFirstHit()) {
			this.f1 = f1;
			this.f2 = f2;
		}
		else {
			this.f1 = f2;
			this.f2 = f1;
		}
		
	}
	
	public void run() {
		if(checkWeight()) {
			while(this.f1.health > 0 && this.f2.health > 0) {
				System.out.println("=========== Next Round! ===========");
				this.f2.health = this.f1.hit(f2);
				if(isWin()) {
					break;
				}
				this.f1.health = this.f2.hit(f1);
				if(isWin()) {
					break;
				}
				System.out.println("The remaining of " + this.f1.name + " health is: " + this.f2.health);
				System.out.println("The remaining of " + this.f2.name + " health is: " + this.f1.health);
			}
			System.out.println("The fighters' weights are compatible with each other! ");
		}
		
		else {
			System.out.println("The fighters' weights are not compatible with each other! ");
		}
	}
	
	public boolean checkWeight() {
		return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
	}
	
	public boolean isWin() {
		if(this.f1.health == 0) {
			System.out.println(f2.name + " is won!");
			return true;
		}
		
		if (this.f2.health == 0) {
			System.out.println(f1.name + " is won!");
			return true;
		}
		
		return false;
	}
	
	public boolean isFirstHit() {
		double randomNumber = Math.random() * 100;
		return randomNumber <= 50;
		
	}

}
