package corso.java.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor

@Entity
@DiscriminatorValue("1")
public class Drink extends Product {
	@Column(length = 60, nullable = false)
    private String name;
	@Column(nullable = false)
	private Double price;
	public Drink(Integer id, String name, String name2, Double price) {
		super(id, name);
		name = name2;
		this.price = price;
	}

}