/**
 * @author Christopher Pohlman - cmpolhman
 * CIS175 - Spring 2022
 * Mar 31, 2022
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class FoodItem {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private double size;
	private int quantity;

	public FoodItem(String name, double size, int quantity) {
		super();
		this.name = name;
		this.size = size;
		this.quantity = quantity;
	}
	
	
}
