/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cast.testapp.invoice.controller;

import cast.testapp.catastro.entities.Cliente;
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

    public Invoice createInvoice(Cliente customer, List<InvoiceDetail> invoiceDetailsList){
        Invoice invoice = null;
        //Obtener los datos de timbrado y numeración
        //Calcular ivas
        invoice = new Invoice();
        invoice.setCustomerCode(customer.numeroDoc);
        int result = invoiceMgr.create(invoice);
        if(result == 0){
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

}
