package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipantRepository extends MongoRepository<Participant, String> {

	public List<Participant> findByFirstName(String firstName);

	public List<Participant> findByLastName(String lastName);

}
