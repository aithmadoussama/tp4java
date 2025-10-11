package exercice3;

public class Categorie {

	private int compt = 0 ;
	private int id;
	private String libelle;
	private String code;

	public Categorie(String libelle, String code) {
		this.id = ++compt;
		this.code = code;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", libelle=" + libelle + ", code=" + code + "]";
	}
	
	
}
