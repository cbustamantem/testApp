package cast.testapp.invoice.boundary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import util.ConnectionManager;
import java.sql.SQLException;
import cast.testapp.invoice.entities.InvoiceDetail;
import util.GenericDao;

public interface InvoiceDetailManager extends GenericDao<InvoiceDetail,Integer> {

	public List<InvoiceDetail> getInvoiceDetail() ;

	public String getStatement();

	public InvoiceDetail getFromRsInvoiceDetail(ResultSet rs);

	public Boolean add(InvoiceDetail entity);

//	public static void main(String[] args) {
//		List<InvoiceDetail> listInvoiceDetail = new InvoiceDetailManager()
//				.getInvoiceDetail();
//		listInvoiceDetail
//				.forEach(i -> System.out.println("d: " + i.toString()));
//	}
}