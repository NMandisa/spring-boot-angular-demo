package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.Customer;

/**
 * @author Noxolo.Mkhungo
 */
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
