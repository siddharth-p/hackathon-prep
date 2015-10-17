package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ParticipantRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		repository.deleteAll();

		repository.save(new Participant("Abhishek", "Ranjan"));
		repository.save(new Participant("Amanpreet", "Singh"));
		repository.save(new Participant("Gurunath", "Pai"));
		repository.save(new Participant("Siddharth", "Pandey"));
		
	}

}
