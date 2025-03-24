package corso.java.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import corso.java.entities.Client;

public interface ClientsRepository extends JpaRepository<Client, Integer>{

	void saveAll(List<Object> list);
}
