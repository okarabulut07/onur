package onur.springframework.converters;

import onur.springframework.commands.CustomerForm;
import onur.springframework.domain.Customer;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class CustomerFormToCustomer implements Converter<CustomerForm, Customer> {

    @Override
    public Customer convert(CustomerForm customerForm) {
        Customer customer = new Customer();
        if (customerForm.getId() != null  && !StringUtils.isEmpty(customerForm.getId())) {
            customer.setId(new Long(customerForm.getId()));
        }
        customer.setAdSoyad(customerForm.getAdSoyad());
        customer.setTarih(customerForm.getTarih());
        customer.setIsyeri(customerForm.getIsyeri());
        customer.setTelefon(customerForm.getTelefon());
        customer.setAdres(customerForm.getAdres());
        return customer;
    }
}
