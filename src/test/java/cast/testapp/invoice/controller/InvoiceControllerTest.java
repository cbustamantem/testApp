package cast.testapp.invoice.controller;

import cast.testapp.catastro.entities.Cliente;
import cast.testapp.invoice.boundary.InvoiceFileReader;
import cast.testapp.invoice.boundary.InvoiceManager;
import cast.testapp.invoice.entities.Invoice;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceControllerTest {

    InvoiceManager invoiceManagerMock;
    InvoiceFileReader invoiceFileReaderMock;
    InvoiceController instance;

    @Before
    void setUp() {
        invoiceManagerMock =  mock(InvoiceManager.class);
        invoiceFileReaderMock = mock(InvoiceFileReader.class);
        instance = new InvoiceController(invoiceManagerMock,invoiceFileReaderMock);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void listPendingInvoicesByClient() {
    }

    @Test
    void importarFacturasCsv() {
    }

    @Test
    void createInvoice() {

    Invoice invoice = new Invoice();
    invoice.setCustomerCode("25");
    when(invoiceManagerMock.create(invoice)).thenReturn(1);
    Cliente customer = new Cliente();
    customer.numeroDoc ="25";
    instance.createInvoice(customer, Collections.emptyList());

    }

    @Test
    void createInvoiceFailed() {

        Invoice invoice = new Invoice();
        invoice.setCustomerCode("50");
        when(invoiceManagerMock.create(invoice)).thenReturn(0);
        Cliente customer = new Cliente();
        customer.numeroDoc ="50";
        IllegalArgumentException exception = assertThrows( IllegalArgumentException.class, () -> {
                    instance.createInvoice(customer, Collections.emptyList());
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("NO pudo insertar"));


    }
}