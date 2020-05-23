package cast.testapp.invoice.boundary.impl;

import cast.testapp.invoice.boundary.InvoiceManager;
import cast.testapp.invoice.entities.Invoice;
import util.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvoiceManagerImpl implements InvoiceManager {

    private static final long serialVersionUID = 1L;

    public List<Invoice> getInvoice() {
        List<Invoice> listInvoice = new ArrayList();
        try (PreparedStatement s1 = ConnectionManager.getConnection()
                .prepareStatement(getStatement())) {
            s1.setMaxRows(100);
            try (ResultSet rs = s1.executeQuery()) {
                while (rs.next()) {
                    listInvoice.add(getFromRsInvoice(rs));
                }
            }
            return listInvoice;
        } catch (Exception ex) {
            ex.printStackTrace();
            return Collections.EMPTY_LIST;
        }
    }

    public String getStatement() {
        String statement = "SELECT id, balance, cancelled, cancelled_date, cancelled_reason, creation_date, currency, currency_code, currency_exchange, customer_address, customer_code, customer_company_alias, customer_fiscal_number, customer_name, customer_phone, discount_rate, discount_total, exempt_total, fiscal_stamp_number, gross_total, invoice_branch, invoice_number, invoice_printer, invoice_type, invoicing_date, net_total, observation, status, tenant_id, term, type, vat05total, vat10total, vat_total, vatted05total, vatted10total FROM invoice";
        return statement;
    }

    public Invoice getFromRsInvoice(ResultSet rs) {
        try {
            Invoice data = new Invoice();
            data.setId(rs.getInt(1));
            data.setBalance(rs.getDouble(2));
            data.setCancelled(rs.getBoolean(3));
            data.setCancelledDate(rs.getDate(4));
            data.setCancelledReason(rs.getString(5));
            data.setCreationDate(rs.getDate(6));
            data.setCurrency(rs.getString(7));
            data.setCurrencyCode(rs.getString(8));
            data.setCurrencyExchange(rs.getDouble(9));
            data.setCustomerAddress(rs.getString(10));
            data.setCustomerCode(rs.getString(11));
            data.setCustomerCompanyAlias(rs.getString(12));
            data.setCustomerFiscalNumber(rs.getString(13));
            data.setCustomerName(rs.getString(14));
            data.setCustomerPhone(rs.getString(15));
            data.setDiscountRate(rs.getDouble(16));
            data.setDiscountTotal(rs.getDouble(17));
            data.setExemptTotal(rs.getDouble(18));
            data.setFiscalStampNumber(rs.getString(19));
            data.setGrossTotal(rs.getDouble(20));
            data.setInvoiceBranch(rs.getString(21));
            data.setInvoiceNumber(rs.getString(22));
            data.setInvoicePrinter(rs.getString(23));
            data.setInvoiceType(rs.getString(24));
            data.setInvoicingDate(rs.getDate(25));
            data.setNetTotal(rs.getDouble(26));
            data.setObservation(rs.getString(27));
            data.setStatus(rs.getString(28));
            data.setTenantId(rs.getInt(29));
            data.setTerm(rs.getInt(30));
            data.setType(rs.getString(31));
            data.setVat05total(rs.getDouble(32));
            data.setVat10total(rs.getDouble(33));
            data.setVatTotal(rs.getDouble(34));
            data.setVatted05total(rs.getDouble(35));
            data.setVatted10total(rs.getDouble(36));
            return data;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Boolean add(Invoice entity) {
        String statement = "INSERT INTO invoice (id, balance, cancelled, cancelled_date, cancelled_reason, creation_date, currency, currency_code, currency_exchange, customer_address, customer_code, customer_company_alias, customer_fiscal_number, customer_name, customer_phone, discount_rate, discount_total, exempt_total, fiscal_stamp_number, gross_total, invoice_branch, invoice_number, invoice_printer, invoice_type, invoicing_date, net_total, observation, status, tenant_id, term, type, vat05total, vat10total, vat_total, vatted05total, vatted10total ) VALUES ( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement s1 = ConnectionManager.getConnection()
                .prepareStatement(statement)) {
            s1.setInt(1, entity.getId());
            s1.setDouble(2, entity.getBalance());
            s1.setBoolean(3, entity.getCancelled());
            s1.setDate(4, entity.getCancelledDate());
            s1.setString(5, entity.getCancelledReason());
            s1.setDate(6, entity.getCreationDate());
            s1.setString(7, entity.getCurrency());
            s1.setString(8, entity.getCurrencyCode());
            s1.setDouble(9, entity.getCurrencyExchange());
            s1.setString(10, entity.getCustomerAddress());
            s1.setString(11, entity.getCustomerCode());
            s1.setString(12, entity.getCustomerCompanyAlias());
            s1.setString(13, entity.getCustomerFiscalNumber());
            s1.setString(14, entity.getCustomerName());
            s1.setString(15, entity.getCustomerPhone());
            s1.setDouble(16, entity.getDiscountRate());
            s1.setDouble(17, entity.getDiscountTotal());
            s1.setDouble(18, entity.getExemptTotal());
            s1.setString(19, entity.getFiscalStampNumber());
            s1.setDouble(20, entity.getGrossTotal());
            s1.setString(21, entity.getInvoiceBranch());
            s1.setString(22, entity.getInvoiceNumber());
            s1.setString(23, entity.getInvoicePrinter());
            s1.setString(24, entity.getInvoiceType());
            s1.setDate(25, entity.getInvoicingDate());
            s1.setDouble(26, entity.getNetTotal());
            s1.setString(27, entity.getObservation());
            s1.setString(28, entity.getStatus());
            s1.setInt(29, entity.getTenantId());
            s1.setInt(30, entity.getTerm());
            s1.setString(31, entity.getType());
            s1.setDouble(32, entity.getVat05total());
            s1.setDouble(33, entity.getVat10total());
            s1.setDouble(34, entity.getVatTotal());
            s1.setDouble(35, entity.getVatted05total());
            s1.setDouble(36, entity.getVatted10total());
            Integer rs = s1.executeUpdate();
            if (rs > 0) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return false;
    }

    @Override
    public Invoice update(Invoice entity) {
        return null;
    }

    @Override
    public Boolean delete(Integer key) {
        return null;
    }

    @Override
    public Invoice getById(Integer key) {
        return null;
    }

    @Override
    public List<Invoice> getAll() {
        return null;
    }

    @Override
    public List<Invoice> getAll(int limit, int offset) {
        return null;
    }

    public static void main(String[] args) {
        List<Invoice> listInvoice = new InvoiceManagerImpl().getInvoice();
        listInvoice.forEach(i -> System.out.println("d: " + i.toString()));
    }

}
