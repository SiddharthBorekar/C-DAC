package p1.p2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerERestControoller {
	@Value("${trainer.name}")
	private String name;
	private String Subject;
	
	public void setName(String name) {
		this.name = name;
	}
	@Value("${trainer.subject}")
	public void setSubject (String subject) {
		this.Subject = subject;
	}
	@GetMapping("/info")
	public String info() {
		return "Name :" + name + "subject :" + Subject;
	}
}
