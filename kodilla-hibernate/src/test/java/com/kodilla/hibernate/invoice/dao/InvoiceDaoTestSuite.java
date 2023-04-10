package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("IN/123");

        Product shoes = new Product("Shoes");
        Product bike = new Product("Bike");
        Product blouse = new Product("Blouse");

        Item item1 = new Item(shoes, new BigDecimal(49), 5, new BigDecimal(245));
        Item item2 = new Item(bike, new BigDecimal(499), 2, new BigDecimal(998));
        Item item3 = new Item(blouse, new BigDecimal(99), 1, new BigDecimal(99));

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        List<Item> invoiceItems = new ArrayList<>();
        invoiceItems.add(item1);
        invoiceItems.add(item2);
        invoiceItems.add(item3);
        invoice.setItems(invoiceItems);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Optional<Invoice> readInvoice = invoiceDao.findById(invoiceId);
        assertTrue(readInvoice.isPresent());

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
