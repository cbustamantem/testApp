/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import py.com.consultores.javag.jdbc.ClassGenerator;


/**
 *
 * @author cbustamante
 */
public class Generate {
    public static void main(String[] args) {
        String sql="SELECT id, balance, cancelled, cancelled_date, cancelled_reason, creation_date, currency, currency_code, currency_exchange, customer_address, customer_code, customer_company_alias, customer_fiscal_number, customer_name, customer_phone, discount_rate, discount_total, exempt_total, fiscal_stamp_number, gross_total, invoice_branch, invoice_number, invoice_printer, invoice_type, invoicing_date, net_total, observation, status, tenant_id, term, type, vat05total, vat10total, vat_total, vatted05total, vatted10total FROM invoice";
        ClassGenerator generator = new ClassGenerator();
        generator.generate(sql, "cast.testapp.invoice", "Invoice");
    }
}
