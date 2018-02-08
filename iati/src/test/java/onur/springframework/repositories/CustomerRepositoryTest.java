package onur.springframework.repositories;

import onur.springframework.domain.Customer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import onur.springframework.repositories.CustomerRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerRepositoryTest {

   
    private static final String AD_SOYAD = "İsim Soyisim";
    private static final String TARIH = "Tarih";
    private static final String ISYERI = "İşyeri";
    private static final String TELEFON = "Telefon";
    private static final String ADRES = "adres";
    @Autowired
    private CustomerRepository customerRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPersistence() {
        //given
        Customer customer = new Customer();
        customer.setAdSoyad(AD_SOYAD);
        customer.setTarih(TARIH);
        customer.setIsyeri(ISYERI);
        customer.setTelefon(TELEFON);
        customer.setAdres(ADRES);

        //when
        customerRepository.save(customer);

        //then
        Assert.assertNotNull(customer.getId());
        Customer newCustomer = customerRepository.findById(customer.getId()).orElse(null);
        Assert.assertEquals((Long) 1L, newCustomer.getId());
        Assert.assertEquals(AD_SOYAD, newCustomer.getAdSoyad());
        Assert.assertEquals(TARIH, newCustomer.getTarih());
        Assert.assertEquals(ISYERI, newCustomer.getIsyeri());
        Assert.assertEquals(TELEFON, newCustomer.getTelefon());
        Assert.assertEquals(ADRES, newCustomer.getAdres());
    }
}