package exercice3;

public class Article {

	private int compt = 0;
	private int id;
	private int code;
	private String designation;
	Categorie categorie;

	public Article(int code, String designation, Categorie categorie) {
		this.id = ++compt;
		this.code = code;
		this.designation = designation;
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", code=" + code + ", designation=" + designation + "]";
	}

}
