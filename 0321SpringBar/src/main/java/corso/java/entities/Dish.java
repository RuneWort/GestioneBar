package corso.java.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@DiscriminatorValue("2")
public class Dish extends Product {
	@Column(length = 50, nullable = false)
	private String name;
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_dishes_categories"))
	private Category category;
}