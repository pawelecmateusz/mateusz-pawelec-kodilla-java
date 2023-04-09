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
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("IN/123");

        Product shoes = new Product("Shoes");
        Product bike = new Product("Bike");

        Item item1 = new Item(shoes, new BigDecimal(49), 5, new BigDecimal(245));
        Item item2 = new Item(bike, new BigDecimal(499), 2, new BigDecimal(998));
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);

        //Then
        int invoiceId = invoice.getId();
        int shoesId = shoes.getId();
        int itemId = item1.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(invoiceId);
        Optional<Product> readProduct = productDao.findById(shoesId);
        Optional<Item> readItem = itemDao.findById(itemId);
        assertTrue(readInvoice.isPresent());
        assertTrue(readProduct.isPresent());
        assertTrue(readItem.isPresent());

        //CleanUp
        itemDao.deleteAll();
        productDao.deleteAll();
        invoiceDao.deleteAll();
    }
}
