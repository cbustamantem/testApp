package cast.testapp.invoice.entities;

import java.io.Serializable;
import java.sql.Date;

public class Invoice implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer tenantId;
	private Double discountTotal;
	private String type;
	private Double discountRate;
	private Double vatTotal;
	private String cancelledReason;
	private String currencyCode;
	private Double currencyExchange;
	private Double vatted05total;
	private String fiscalStampNumber;
	private Double balance;
	private Double exemptTotal;
	private Double vat05total;
	private Double vatted10total;
	private String currency;
	private String invoiceType;
	private Integer term;
	private Integer id;
	private String customerFiscalNumber;
	private String customerCode;
	private String invoiceNumber;
	private Double vat10total;
	private String customerAddress;
	private Double grossTotal;
	private Double netTotal;
	private String observation;
	private String customerPhone;
	private String invoiceBranch;
	private Date creationDate;
	private String customerCompanyAlias;
	private String invoicePrinter;
	private Date cancelledDate;
	private Boolean cancelled;
	private String customerName;
	private Date invoicingDate;
	private String status;

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public Double getDiscountTotal() {
		return discountTotal;
	}

	public void setDiscountTotal(Double discountTotal) {
		this.discountTotal = discountTotal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}

	public Double getVatTotal() {
		return vatTotal;
	}

	public void setVatTotal(Double vatTotal) {
		this.vatTotal = vatTotal;
	}

	public String getCancelledReason() {
		return cancelledReason;
	}

	public void setCancelledReason(String cancelledReason) {
		this.cancelledReason = cancelledReason;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Double getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(Double currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public Double getVatted05total() {
		return vatted05total;
	}

	public void setVatted05total(Double vatted05total) {
		this.vatted05total = vatted05total;
	}

	public String getFiscalStampNumber() {
		return fiscalStampNumber;
	}

	public void setFiscalStampNumber(String fiscalStampNumber) {
		this.fiscalStampNumber = fiscalStampNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getExemptTotal() {
		return exemptTotal;
	}

	public void setExemptTotal(Double exemptTotal) {
		this.exemptTotal = exemptTotal;
	}

	public Double getVat05total() {
		return vat05total;
	}

	public void setVat05total(Double vat05total) {
		this.vat05total = vat05total;
	}

	public Double getVatted10total() {
		return vatted10total;
	}

	public void setVatted10total(Double vatted10total) {
		this.vatted10total = vatted10total;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerFiscalNumber() {
		return customerFiscalNumber;
	}

	public void setCustomerFiscalNumber(String customerFiscalNumber) {
		this.customerFiscalNumber = customerFiscalNumber;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Double getVat10total() {
		return vat10total;
	}

	public void setVat10total(Double vat10total) {
		this.vat10total = vat10total;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Double getGrossTotal() {
		return grossTotal;
	}

	public void setGrossTotal(Double grossTotal) {
		this.grossTotal = grossTotal;
	}

	public Double getNetTotal() {
		return netTotal;
	}

	public void setNetTotal(Double netTotal) {
		this.netTotal = netTotal;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getInvoiceBranch() {
		return invoiceBranch;
	}

	public void setInvoiceBranch(String invoiceBranch) {
		this.invoiceBranch = invoiceBranch;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCustomerCompanyAlias() {
		return customerCompanyAlias;
	}

	public void setCustomerCompanyAlias(String customerCompanyAlias) {
		this.customerCompanyAlias = customerCompanyAlias;
	}

	public String getInvoicePrinter() {
		return invoicePrinter;
	}

	public void setInvoicePrinter(String invoicePrinter) {
		this.invoicePrinter = invoicePrinter;
	}

	public Date getCancelledDate() {
		return cancelledDate;
	}

	public void setCancelledDate(Date cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	public Boolean getCancelled() {
		return cancelled;
	}

	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getInvoicingDate() {
		return invoicingDate;
	}

	public void setInvoicingDate(Date invoicingDate) {
		this.invoicingDate = invoicingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}