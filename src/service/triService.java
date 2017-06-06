package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import domaine.Transaction;

public class triService {

	Collection<Transaction> transactions = new ArrayList<Transaction>();

	public triService(List<Transaction> t) {
		transactions = t;
	}

	public List<Transaction> triQ1() {
		return transactions.stream()
				.filter(t -> t.getAnnee() == 2011)
				.sorted((t1, t2) -> Integer.compare(t1.getMontant(), t2.getMontant()))
				.collect(Collectors.toList());
	}
	
	public List<String> extractQ2() {
		return transactions.stream()
				.map(t->t.getTrader().getVille())
				.distinct()
				.collect(Collectors.toList());
	}
	
	public List<String> triQ3() {
		return transactions.stream()
				.filter(t->t.getTrader().getVille()=="Cambridge")
				.map(t->t.getTrader().getNom())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
	public List<String> triQ4() {
		return transactions.stream()
				.map(t->t.getTrader().getNom())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
	public boolean matchQ5() {
		return transactions.stream()
				.anyMatch(t->t.getTrader().getVille()=="Milan");
	}
	
	public List<Integer> extractQ6() {
		return transactions.stream()
				.filter(t->t.getTrader().getVille()=="Cambridge")
				.map(t->t.getMontant())
				.collect(Collectors.toList());
	}
	
	public Optional<Integer> maxQ7() {
		return transactions.stream()
				.map(t->t.getMontant())
				.max((t1,t2)->Integer.compare(t1, t2));
	}
	
	public Optional<Integer> minQ8() {
		return transactions.stream()
				.map(t->t.getMontant())
				.min((t1,t2)->Integer.compare(t1, t2));
	}
}
