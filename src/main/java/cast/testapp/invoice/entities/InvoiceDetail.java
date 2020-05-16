package cast.testapp.invoice.entities;

import java.io.Serializable;
import java.sql.Date;

public class InvoiceDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer tenantId;
	private Double exemptAmount;
	private Double quantity;
	private Double discountAmount;
	private String observation;
	private String description;
	private Double grossAmount;
	private String productCode;
	private Double unitPrice;
	private Double discountRate;
	private String productName;
	private Double productVatRate;
	private Double vatAmount;
	private Double vatted05amount;
	private Double vatted10amount;
	private Integer invoiceId;
	private Integer id;
	private Double netAmount;
	private Integer rowNumber;
	private Double vat05amount;
	private String status;
	private Double vat10amount;

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public Double getExemptAmount() {
		return exemptAmount;
	}

	public void setExemptAmount(Double exemptAmount) {
		this.exemptAmount = exemptAmount;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductVatRate() {
		return productVatRate;
	}

	public void setProductVatRate(Double productVatRate) {
		this.productVatRate = productVatRate;
	}

	public Double getVatAmount() {
		return vatAmount;
	}

	public void setVatAmount(Double vatAmount) {
		this.vatAmount = vatAmount;
	}

	public Double getVatted05amount() {
		return vatted05amount;
	}

	public void setVatted05amount(Double vatted05amount) {
		this.vatted05amount = vatted05amount;
	}

	public Double getVatted10amount() {
		return vatted10amount;
	}

	public void setVatted10amount(Double vatted10amount) {
		this.vatted10amount = vatted10amount;
	}

	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(Double netAmount) {
		this.netAmount = netAmount;
	}

	public Integer getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(Integer rowNumber) {
		this.rowNumber = rowNumber;
	}

	public Double getVat05amount() {
		return vat05amount;
	}

	public void setVat05amount(Double vat05amount) {
		this.vat05amount = vat05amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getVat10amount() {
		return vat10amount;
	}

	public void setVat10amount(Double vat10amount) {
		this.vat10amount = vat10amount;
	}
}