package Quation3;

public class Author {
	
	private String Name;
	private int writetime;   // in months
	private String Gender;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String name, int writetime, String gender) {
		super();
		Name = name;
		this.writetime = writetime;
		Gender = gender;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getWritetime() {
		return writetime;
	}

	public void setWritetime(int writetime) {
		this.writetime = writetime;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "Author [Name=" + Name + ", writetime=" + writetime + ", Gender=" + Gender + "]";
	}
	
	
}
