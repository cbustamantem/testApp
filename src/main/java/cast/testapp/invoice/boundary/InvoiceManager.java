/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cast.testapp.invoice.boundary;

import cast.testapp.invoice.entities.Invoice;
import cast.testapp.utils.GenericDao;
import java.util.List;

/**
 *
 * @author cbustamante
 */
public interface InvoiceManager extends GenericDao<Invoice,Integer> {
    public Boolean addBulk(List<Invoice> list);
}
