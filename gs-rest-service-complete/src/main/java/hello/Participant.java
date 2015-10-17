package hello;

import org.springframework.data.annotation.Id;

public class Participant {

	@Id
	private String id;
	private String firstName;
	private String lastName;

	public Participant(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Participants [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]\n";
	}

}
