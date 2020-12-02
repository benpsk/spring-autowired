package book.annotation;

public class Author {
	
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Author() {
		
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Author ID: " + id + ", Author Name: " + name;
	}
	

}
