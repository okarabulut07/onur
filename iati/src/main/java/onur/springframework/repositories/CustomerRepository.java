package onur.springframework.repositories;

import onur.springframework.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 1/10/17.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
