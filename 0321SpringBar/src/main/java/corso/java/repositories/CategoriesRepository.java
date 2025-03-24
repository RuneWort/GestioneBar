package corso.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import corso.java.entities.Category;

public interface CategoriesRepository extends JpaRepository<Category, Integer>{

}
