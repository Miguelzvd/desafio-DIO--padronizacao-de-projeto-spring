package padronizacaodeprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class PadronizacaoDeProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadronizacaoDeProjetoApplication.class, args);
	}


}
