package om.projectmannage.ProjetMannage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetMannageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetMannageApplication.class, args);
	}

	public enum Projectstatus{
		Peding,
		 InProgress,
		 Completed,
	}
}
