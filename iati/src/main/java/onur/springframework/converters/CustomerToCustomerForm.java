package onur.springframework.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import onur.springframework.commands.CustomerForm;
import onur.springframework.domain.Customer;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class CustomerToCustomerForm implements Converter<Customer, CustomerForm> {
    @Override
    public CustomerForm convert(Customer customer) {
        CustomerForm customerForm = new CustomerForm();
        customerForm.setId(customer.getId());
        customerForm.setAdSoyad(customer.getAdSoyad());
        customerForm.setTarih(customer.getTarih());
        customerForm.setIsyeri(customer.getIsyeri());
        customerForm.setTelefon(customer.getTelefon());
        customerForm.setAdres(customer.getAdres());
        return customerForm;
    }
}
