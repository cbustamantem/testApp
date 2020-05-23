package cast.testapp.invoice.boundary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import util.ConnectionManager;
import java.sql.SQLException;
import cast.testapp.invoice.entities.Invoice;
import util.GenericDao;

public interface InvoiceManager extends GenericDao<Invoice, Integer> {


	public List<Invoice> getInvoice();

	public String getStatement();

	public Invoice getFromRsInvoice(ResultSet rs);

//	public static void main(String[] args) {
//		List<Invoice> listInvoice = new InvoiceManager().getInvoice();
//		listInvoice.forEach(i -> System.out.println("d: " + i.toString()));
//	}
}