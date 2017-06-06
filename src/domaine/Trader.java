package domaine;

public class Trader {
	private String nom;
	private String ville;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Trader [nom=" + nom + ", ville=" + ville + "]";
	}

	public Trader(String nom, String ville) {
		super();
		this.nom = nom;
		this.ville = ville;
	}
	
	
}
