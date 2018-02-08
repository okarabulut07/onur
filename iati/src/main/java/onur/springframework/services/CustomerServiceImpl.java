package onur.springframework.services;

import onur.springframework.commands.CustomerForm;
import onur.springframework.converters.CustomerFormToCustomer;
import onur.springframework.domain.Customer;
import onur.springframework.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private CustomerFormToCustomer customerFormToCustomer;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerFormToCustomer customerFormToCustomer) {
        this.customerRepository = customerRepository;
        this.customerFormToCustomer = customerFormToCustomer;
    }


    @Override
    public List<Customer> listAll() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add); //fun with Java 8
        return customers;
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer saveOrUpdate(Customer customer) {
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);

    }

    @Override
    public Customer saveOrUpdateCustomerForm(CustomerForm customerForm) {
        Customer savedCustomer = saveOrUpdate(customerFormToCustomer.convert(customerForm));

        System.out.println("Saved Customer Id: " + savedCustomer.getId());
        return savedCustomer;
    }
}
