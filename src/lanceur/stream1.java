package lanceur;

import java.util.Arrays;
import java.util.List;

import domaine.Trader;
import domaine.Transaction;
import service.triService;

public class stream1 {

	public static void main(String[] args) {

		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), 
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), 
				new Transaction(mario, 2012, 700), 
				new Transaction(alan, 2012, 950));
		
		triService t = new triService(transactions);
		System.out.println("Q1 : " +t.triQ1());
		System.out.println("Q2 : " +t.extractQ2());
		System.out.println("Q3 : " +t.triQ3());
		System.out.println("Q4 : " +t.triQ4());
		System.out.println("Q5 : " +t.matchQ5());
		System.out.println("Q6 : " +t.extractQ6());
		System.out.println("Q7 : " +t.maxQ7());
		System.out.println("Q8 : " +t.minQ8());
		
	}

}
