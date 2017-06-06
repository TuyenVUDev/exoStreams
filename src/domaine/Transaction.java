package domaine;

public class Transaction {
	private Trader trader;
	private int annee;
	private int montant;
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", annee=" + annee + ", montant=" + montant + "]";
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public Transaction(Trader trader, int annee, int montant) {
		super();
		this.trader = trader;
		this.annee = annee;
		this.montant = montant;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
}
