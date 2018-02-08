package onur.springframework.services;

import onur.springframework.commands.CustomerForm;
import onur.springframework.domain.Customer;

import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
public interface CustomerService {

    List<Customer> listAll();

    Customer getById(Long id);

    Customer saveOrUpdate(Customer customer);

    void delete(Long id);

	Customer saveOrUpdateCustomerForm(CustomerForm customerForm);
}
