package fc00.model2;

public class MyBook {
	private String tilte;
	private int price;
	private String company;
	private String author;
	
	public MyBook() {}
	
	public MyBook(String tilte, int price, String company, String author) {
		super();
		this.tilte = tilte;
		this.price = price;
		this.company = company;
		this.author = author;
	}

	public String getTilte() {
		return tilte;
	}

	public void setTilte(String tilte) {
		this.tilte = tilte;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "MyBook [tilte=" + tilte + ", price=" + price + ", company=" + company + ", author=" + author + "]";
	}
	
	
	
	
	}
	
	

