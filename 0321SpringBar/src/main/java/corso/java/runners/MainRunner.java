package corso.java.runners;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import corso.java.entities.Category;
import corso.java.entities.Client;
import corso.java.repositories.CategoriesRepository;
import corso.java.repositories.ClientsRepository;
import corso.java.repositories.OrdersRepository;

@Component
public class MainRunner implements CommandLineRunner {
    
	private static final Logger log = LoggerFactory.getLogger(MainRunner.class);
	@Autowired
	private OrdersRepository orders;
	@Autowired
	private CategoriesRepository categories;
	@Autowired
	private ClientsRepository clients;
	
	@Override
	public void run(String... args) throws Exception {
		var primo = Category.builder() //
				.withName("Primo") //
				.build();
		var primo_pesce = Category.builder() //
				.withName("Primo di Pesce") // 
				.withParent(primo)  //
				.build();
		var primo_terra = Category.builder()  //
				.withName("Primo di Terra")  //
				.withParent(primo)   //
				.build();
		var secondo = Category.builder()  //
				.withName("Secondo")   //
				.build();
		var secondo_pesce = Category.builder()  //
				.withName("Secondo di Pesce")   //
				.withParent(secondo) //
				.build();
		var secondo_terra = Category.builder()  //
				.withName("Secondo di Terra")   //
				.withParent(secondo) //
				.build();
		var contorno = Category.builder()  //
				.withName("Contorno")   //
				.build();
		var dolce = Category.builder()  //
				.withName("Dolce")   //
				.build();
		
		categories.save(primo);
		categories.save(primo_pesce);
		categories.save(primo_terra);
		categories.save(secondo);
		categories.save(secondo_pesce);
		categories.save(secondo_terra);
		categories.save(contorno);
		categories.save(dolce);
		
		clients.saveAll(List.of(
		Client.builder().withName("Giuseppe").withSurname("Perniola").withEmail("giuseppeperniola@tiscali.it"),
		Client.builder().withName("Carlo").withSurname("Perniola").withEmail("carloperniola@tiscali.it"),
		Client.builder().withName("Aurora").withSurname("Perniola").withEmail("auroraperniola@live.it"),	
		Client.builder().withName("Samuele").withSurname("Perniola").withEmail("samueleperniola@live.it"),
		Client.builder().withName("Giuseppe").withSurname("Di Leo").withEmail("giuseppedileo@tiscali.it"),
		Client.builder().withName("Giuseppe").withSurname("Paduraru").withEmail("giuseppepaduraru@tiscali.it").build()));
	}
}