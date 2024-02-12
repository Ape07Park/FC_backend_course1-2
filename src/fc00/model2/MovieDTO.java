package fc00.model2;

public class MovieDTO {
	private String title;
	private String director;
	private int year;
	private String country;
	
	public MovieDTO() {}
	
	public MovieDTO(String title, String director, int year, String country) {
		super();
		this.title = title;
		this.director = director;
		this.year = year;
		this.country = country;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "MovieDTO [title=" + title + ", director=" + director + ", year=" + year + ", country=" + country + "]";
	}
	
	
}
