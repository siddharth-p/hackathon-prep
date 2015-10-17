package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/participants")
public class ParticipantController {

	@Autowired
	private ParticipantRepository repository;

	@RequestMapping(method = RequestMethod.GET, params = { "firstName" })
	public String findParticipantByFirstName(@RequestParam(value = "firstName") String firstName) {
		return repository.findByFirstName(firstName).toString();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String findParticipants() {
		return repository.findAll().toString();
	}

}
