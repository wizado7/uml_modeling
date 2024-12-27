public class AdministrativeEmployee extends Employee {

	private String nameJob;

	public AdministrativeEmployee(int ssNo, String name, String email, String nameJob) {
		this.ssNo = ssNo;
		this.name = name;
		this.email = email;
		this.nameJob = nameJob;
	}

	public String getNameJob() {
		return this.nameJob;
	}

	public void setNameJob(String nameJob) {
		this.nameJob = nameJob;
	}


}