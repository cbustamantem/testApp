package cast.testapp.invoice.boundary.impl;

import cast.testapp.invoice.boundary.InvoiceDetailManager;
import cast.testapp.invoice.entities.InvoiceDetail;
import util.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvoiceDetailManagerImpl implements InvoiceDetailManager {

    private static final long serialVersionUID = 1L;

    public List<InvoiceDetail> getInvoiceDetail() {
        List<InvoiceDetail> listInvoiceDetail = new ArrayList();
        try (PreparedStatement s1 = ConnectionManager.getConnection()
                .prepareStatement(getStatement())) {
            s1.setMaxRows(100);
            try (ResultSet rs = s1.executeQuery()) {
                while (rs.next()) {
                    listInvoiceDetail.add(getFromRsInvoiceDetail(rs));
                }
            }
            return listInvoiceDetail;
        } catch (Exception ex) {
            ex.printStackTrace();
            return Collections.EMPTY_LIST;
        }
    }

    public String getStatement() {
        String statement = "SELECT id, invoice_id, description, discount_amount, discount_rate, exempt_amount, gross_amount, net_amount, observation, product_code, product_name, product_vat_rate, quantity, row_number, status, tenant_id, unit_price, vat05amount, vat10amount, vat_amount, vatted05amount, vatted10amount  FROM invoice_detail";
        return statement;
    }

    public InvoiceDetail getFromRsInvoiceDetail(ResultSet rs) {
        try {
            InvoiceDetail data = new InvoiceDetail();
            data.setId(rs.getInt(1));
            data.setInvoiceId(rs.getInt(2));
            data.setDescription(rs.getString(3));
            data.setDiscountAmount(rs.getDouble(4));
            data.setDiscountRate(rs.getDouble(5));
            data.setExemptAmount(rs.getDouble(6));
            data.setGrossAmount(rs.getDouble(7));
            data.setNetAmount(rs.getDouble(8));
            data.setObservation(rs.getString(9));
            data.setProductCode(rs.getString(10));
            data.setProductName(rs.getString(11));
            data.setProductVatRate(rs.getDouble(12));
            data.setQuantity(rs.getDouble(13));
            data.setRowNumber(rs.getInt(14));
            data.setStatus(rs.getString(15));
            data.setTenantId(rs.getInt(16));
            data.setUnitPrice(rs.getDouble(17));
            data.setVat05amount(rs.getDouble(18));
            data.setVat10amount(rs.getDouble(19));
            data.setVatAmount(rs.getDouble(20));
            data.setVatted05amount(rs.getDouble(21));
            data.setVatted10amount(rs.getDouble(22));
            return data;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Boolean add(InvoiceDetail entity) {
        String statement = "INSERT INTO invoice_detail (id, invoice_id, description, discount_amount, discount_rate, exempt_amount, gross_amount, net_amount, observation, product_code, product_name, product_vat_rate, quantity, row_number, status, tenant_id, unit_price, vat05amount, vat10amount, vat_amount, vatted05amount, vatted10amount ) VALUES ( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement s1 = ConnectionManager.getConnection()
                .prepareStatement(statement)) {
            s1.setInt(1, entity.getId());
            s1.setInt(2, entity.getInvoiceId());
            s1.setString(3, entity.getDescription());
            s1.setDouble(4, entity.getDiscountAmount());
            s1.setDouble(5, entity.getDiscountRate());
            s1.setDouble(6, entity.getExemptAmount());
            s1.setDouble(7, entity.getGrossAmount());
            s1.setDouble(8, entity.getNetAmount());
            s1.setString(9, entity.getObservation());
            s1.setString(10, entity.getProductCode());
            s1.setString(11, entity.getProductName());
            s1.setDouble(12, entity.getProductVatRate());
            s1.setDouble(13, entity.getQuantity());
            s1.setInt(14, entity.getRowNumber());
            s1.setString(15, entity.getStatus());
            s1.setInt(16, entity.getTenantId());
            s1.setDouble(17, entity.getUnitPrice());
            s1.setDouble(18, entity.getVat05amount());
            s1.setDouble(19, entity.getVat10amount());
            s1.setDouble(20, entity.getVatAmount());
            s1.setDouble(21, entity.getVatted05amount());
            s1.setDouble(22, entity.getVatted10amount());
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
    public InvoiceDetail update(InvoiceDetail entity) {
        return null;
    }

    @Override
    public Boolean delete(Integer key) {
        return null;
    }

    @Override
    public InvoiceDetail getById(Integer key) {
        return null;
    }

    @Override
    public List<InvoiceDetail> getAll() {
        return null;
    }

    @Override
    public List<InvoiceDetail> getAll(int limit, int offset) {
        return null;
    }

    public static void main(String[] args) {
        List<InvoiceDetail> listInvoiceDetail = new InvoiceDetailManagerImpl()
                .getInvoiceDetail();
        listInvoiceDetail
                .forEach(i -> System.out.println("d: " + i.toString()));
    }
}
