/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cast.testapp.facturacion.entity;

import cast.testapp.catastro.ent.Cliente;
import java.util.Date;
/**
 *
 * @author cbustamante
 */
public class Factura {
     public Integer idFactura;
     public Integer nroFactura;
     public  Date fechaEmision;
     public  Date fechaFacturacion;
     public  Date fechaVencimiento;
     public  String tipoFactura;
     public  Cliente cliente;

    public Factura(){
        
    }
    public Factura(Integer idFactura, Integer nroFactura, Date fechaEmision, Date fechaFacturacion, Date fechaVencimiento, String tipoFactura, Cliente cliente) {
        this.idFactura = idFactura;
        this.nroFactura = nroFactura;
        this.fechaEmision = fechaEmision;
        this.fechaFacturacion = fechaFacturacion;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoFactura = tipoFactura;
        this.cliente = cliente;
    }
     
     

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", nroFactura=" + nroFactura + ", fechaEmision=" + fechaEmision + ", fechaFacturacion=" + fechaFacturacion + ", fechaVencimiento=" + fechaVencimiento + ", tipoFactura=" + tipoFactura + ", cliente=" + cliente + '}';
    }
     
    
}
