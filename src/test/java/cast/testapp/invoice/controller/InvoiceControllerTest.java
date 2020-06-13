/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cast.testapp.invoice.controller;

import cast.testapp.invoice.boundary.InvoiceFileReader;
import cast.testapp.invoice.boundary.InvoiceManager;
import cast.testapp.invoice.entities.Invoice;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author cbustamante
 */
public class InvoiceControllerTest {
    InvoiceManager invoiceMgr;
    InvoiceFileReader invoiceFileRd;
    InvoiceController instance;
    
    public InvoiceControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        invoiceMgr = mock(InvoiceManager.class);
        invoiceFileRd = mock(InvoiceFileReader.class);
        instance = new InvoiceController(invoiceMgr, invoiceFileRd);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void should_invalidate_invoce(){
      boolean result= instance.invalidateInvoce(1);
      assertTrue("Should invalidate", result);
                      
    }
    @Test
    public void should_checkIfInvoiceExists_null(){
         IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    boolean result= instance.checkIfInvoiceExists(null);
                });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("Error"));
    }
    @Test
    public void should_checkIfInvoiceExists(){
        Integer id=1;
        //Factura
        Invoice invoice = new Invoice();
        invoice.setId(id);
        //Emulame que cuando busquen el id 1 retorne este objeto
        when(invoiceMgr.getById(id)).thenReturn(invoice);
        boolean result= instance.checkIfInvoiceExists(id);       
        assertTrue("Should exists the invoice",result);
    }
    @Test
    public void should_checkIfInvoiceNotExists(){
        Integer id=2;
        //Emulame que cuando busquen el id 1 retorne este objeto
        when(invoiceMgr.getById(id)).thenReturn(null);
        boolean result= instance.checkIfInvoiceExists(id);       
        assertFalse("Should exists the invoice",result);
    }
}
