/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cast.testapp.invoice.controller;

import cast.testapp.catastro.clientes.Cliente;
import cast.testapp.invoice.boundary.InvoiceFileReader;
import cast.testapp.invoice.boundary.impl.InvoiceFileReaderImpl;
import cast.testapp.invoice.boundary.InvoiceManager;
import cast.testapp.invoice.boundary.impl.InvoiceManagerImpl;
import cast.testapp.invoice.entities.Invoice;
import cast.testapp.invoice.entities.InvoiceDetail;

import javax.management.RuntimeErrorException;
import java.io.File;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cbustamante
 */
public class InvoiceController {

    InvoiceManager invoiceMgr;
    InvoiceFileReader fileReader;

    /*
    BR1	Emitir Facturas
    BR1-1	Utilizar un numero de factura unico
    BR1-2	La facturacion de productos debe cotejar la disponibilidad de stock
    BR1-3	La facturación a credito no debe superar el limite de credito vigente del cliente
    BR2	Listar facturas por cliente, contado y credito
    BR3	Anular Facturas
    BR4	Listar facturas anuladas
    BR5 Importar Facturas desde CSV
     */
    public InvoiceController() {
        invoiceMgr = new InvoiceManagerImpl();
        fileReader = new InvoiceFileReaderImpl();
    }

    public InvoiceController(InvoiceManager invoiceMgr, InvoiceFileReader fileReader) {
        this.invoiceMgr = invoiceMgr;
        this.fileReader = fileReader;
    }

    public List<Invoice> listPendingInvoicesByClient(Long idCliente, Date date){
        //BR1	Listar Facturas Pendientes por cliente, fecha de vencimiento
        return Collections.EMPTY_LIST;
    }
    public Boolean invalidateInvoce(Integer invoiceId){
        
        //Verificar que exista la factura
        checkIfInvoiceExists(invoiceId);
        //cambiar de estado de la factura
        
        //notificar al contador
        
        //pagar tu impuesto
        
        return true;
    }
    protected  Boolean checkIfInvoiceExists(Integer invoiceId){
        if (invoiceId == null){
            throw new IllegalArgumentException("Error invoiceId cannot be null");
        }
        if (invoiceId < 0){
            throw new IllegalArgumentException("Error invoiceId cannot be negative");
        }
        Invoice invoice = invoiceMgr.getById(invoiceId);
        if (invoice != null)
            return true;
        else
            return false;
    }   

    public Boolean importarFacturasCsv(String filePath) {
        try {
            // Leer el archivo
            File csvFile = fileReader.readFile(filePath);
            //Ciclo por linea
            //Validar linea
            //Validar encabezado
            //Validar detalle
            //Insert bulk factura

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public Invoice createInvoice(String customerCode, List<InvoiceDetail> invoiceDetailsList){
        Invoice invoice = null;
        //Obtener los datos de timbrado y numeración
        //Calcular ivas
        invoice = new Invoice();
        loadDummyInvoice(invoice);
        invoice.setCustomerCode(customerCode);
        if( invoiceMgr.create(invoice) == null){
            throw new IllegalStateException("NO pudo insertar");
        }
        return invoice;
    }

    public boolean anularFactura(Invoice invoice) {
        if (existeInvoice(invoice)) {
            invoice.setCancelled(true);
            Invoice invoiceUpdated = invoiceMgr.update(invoice);
        }
        return false;
    }

    private boolean existeInvoice(Invoice invoice) {
        if (invoice.getInvoiceNumber().equals("1")) {
            return true;
        } else {
            throw new IllegalArgumentException("ERROR: No se encontro factura a anular");
        }
    }

    public List<Invoice> getAllInvoices(){
        return invoiceMgr.getAll();
    }

    private void loadDummyInvoice(Invoice entity){

        java.sql.Date defaultDate = new java.sql.Date(System.currentTimeMillis());

//        entity.setId(1);
        entity.setBalance(0.0);
        entity.setCancelled(false);
        entity.setCancelledDate(defaultDate);
        entity.setCancelledReason("");
        entity.setCreationDate(defaultDate);
        entity.setCurrency("");
        entity.setCurrencyCode("");
        entity.setCurrencyExchange(0.0);
        entity.setCustomerAddress("");
        entity.setCustomerCode("");
        entity.setCustomerCompanyAlias("");
        entity.setCustomerFiscalNumber("");
        entity.setCustomerName("");
        entity.setCustomerPhone("");
        entity.setDiscountRate(0.0);
        entity.setDiscountTotal(0.0);
        entity.setExemptTotal(0.0);
        entity.setFiscalStampNumber("");
        entity.setGrossTotal(0.0);
        entity.setInvoiceBranch("");
        entity.setInvoiceNumber("");
        entity.setInvoicePrinter("");
        entity.setInvoiceType("");
        entity.setInvoicingDate(defaultDate);
        entity.setNetTotal(0.0);
        entity.setObservation("");
        entity.setStatus("");
        entity.setTenantId(0);
        entity.setTerm(0);
        entity.setType("");
        entity.setVat05total(0.0);
        entity.setVat10total(0.0);
        entity.setVatTotal(0.0);
        entity.setVatted05total(0.0);
        entity.setVatted10total(0.0);
    }

}
