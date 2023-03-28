package ThreadRace;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		Thread threadPool = new Thread();
		ExecutorService poolService = Executors.newFixedThreadPool(4);
		
		for(int i = 0; i < 10000; i++) {
			poolService.execute(threadPool);
		}

	}

}
