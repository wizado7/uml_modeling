import java.util.Date;

public class Project {

	private String name;
	private Date start;
	private Date end;
	private Participation participation;

	public Project(String name, Date start, Date end, Participation participation) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.participation = participation;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return this.start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Participation getParticipation() {
		return participation;
	}

	public void setParticipation(Participation participation) {
		this.participation = participation;
	}

}