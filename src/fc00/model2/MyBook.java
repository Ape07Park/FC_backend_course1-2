package fc00.model2;

public class MyBook {
	// 필드(프로퍼티)
	private String tilte;
	private int price;
	private String company;
	private String author;
	
	// 디폴트 생성자
	public MyBook() {}
	
	// 오버로딩
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
	
	// Object의 것을 오버라이딩함 
	@Override
	public String toString() {
		return "MyBook [tilte=" + tilte + ", price=" + price + ", company=" + company + ", author=" + author + "]";
	}
	
	
	
	
	}
	
	

