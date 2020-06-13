package cast.testapp.invoice.controller;

import cast.testapp.catastro.entities.Cliente;
import cast.testapp.invoice.boundary.InvoiceFileReader;
import cast.testapp.invoice.boundary.InvoiceManager;
import cast.testapp.invoice.entities.Invoice;
import org.junit.*;

import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;


public class InvoiceControllerTest {

    InvoiceManager invoiceManagerMock;
    InvoiceFileReader invoiceFileReaderMock;
    InvoiceController instance;

    @Before
    public void setUp() {
        invoiceManagerMock =  mock(InvoiceManager.class);
        invoiceFileReaderMock = mock(InvoiceFileReader.class);
        instance = new InvoiceController(invoiceManagerMock,invoiceFileReaderMock);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void createInvoice() {
        Invoice invoice = new Invoice();
        invoice.setCustomerCode("25");
        when(invoiceManagerMock.create(invoice)).thenReturn(1);
        Cliente customer = new Cliente();
        customer.numeroDoc ="25";
        instance.createInvoice(customer, Collections.emptyList());
    }

    @Test
    public void createInvoiceFailed() {

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

    @Test
    public void anularFacturaOk() {
        Invoice invoice = new Invoice();
        invoice.setInvoiceNumber("1");
        when(instance.anularFactura(invoice)).thenReturn(true);
    }

    @Test
    public void anularFacturaError() {
        Invoice invoice = new Invoice();
        invoice.setInvoiceNumber("2");
        IllegalArgumentException exception = assertThrows( IllegalArgumentException.class, () -> {
            instance.anularFactura(invoice);
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("ERROR: No se encontro factura a anular"));
    }
}