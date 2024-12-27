public class Faculty {

	private String name;
	private Institute[] institutes;

	public Faculty(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Institute[] getInstitutes() {
		return this.institutes;
	}

	public void setInstitutes(Institute[] institutes) {
		this.institutes = institutes;
	}

	public void addInstitute(Institute institute) {
		// TODO - implement Faculty.addInstitute
		throw new UnsupportedOperationException();
	}

	public void removeInstitute(Institute institute) {
		// TODO - implement Faculty.removeInstitute
		throw new UnsupportedOperationException();
	}

}