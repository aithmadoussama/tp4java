package exercice3;

public class TestApp {

	public static void main(String[] args) {

		Categorie c1 = new Categorie("Ordinateur Portable", "O PR");
		Categorie c2 = new Categorie("Ordinateur Poste", "O PO");
		Categorie[] categories = new Categorie[2];

		categories[0] = c1;
		categories[1] = c2;

		Article article1 = new Article(14, "dell", c1);
		Article article2 = new Article(4, "hp", c1);
		Article article3 = new Article(74, "mac", c2);
		Article article4 = new Article(785, "lenovo", c2);
		Article[] articles = new Article[4];

		articles[0] = article1;
		articles[1] = article2;
		articles[2] = article3;
		articles[3] = article4;

		afficher(articles);

	}

	public static void afficher(Article[] articles) {
		System.out.println("Ordinateures portables : ");
		for (Article article : articles) {
			if (article.getCategorie().getCode().equals("O PR")) {
				System.out.println(article.toString());

			}
		}

		System.out.println("Ordinateures postes : ");
		for (Article article : articles) {
			if (article.getCategorie().getCode().equals("O PO")) {
				System.out.println(article.toString());
			}
		}

	}
}
