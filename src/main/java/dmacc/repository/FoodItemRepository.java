/**
 * @author Christopher Pohlman - cmpolhman
 * CIS175 - Spring 2022
 * Mar 31, 2022
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.FoodItem;

/**
 * 
 */
@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {

}
