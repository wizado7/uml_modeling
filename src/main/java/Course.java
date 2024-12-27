public class Course {

	private String name;
	private int id;
	private float hours;

	public Course(String name, int id, float hours) {
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getHours() {
		return this.hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

}