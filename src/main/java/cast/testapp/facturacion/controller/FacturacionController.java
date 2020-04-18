/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cast.testapp.facturacion.controller;

import java.util.List;
import cast.testapp.catastro.ent.Cliente;
import cast.testapp.facturacion.entity.Factura;
import java.util.Collections;
/**
 *
 * @author cbustamante
 */
public class FacturacionController {
    //BR2
    public Boolean emitirFactura(Factura factura){
        validarDatosParaFacturacion(factura);
        obtenerNroFacturaAGenerar();
        validarLimiteDeCreditosClientes(factura.cliente);
        
        return true;
    }
        
    public List<Object> listarFacturas(Cliente cliente){
        return Collections.EMPTY_LIST;
    }
    
    private Boolean validarDatosParaFacturacion(Factura factura){
        //Validar datos de facturacion
        return true;
    }
    private Integer obtenerNroFacturaAGenerar(){
        return 0;
    }
    /***
     * Metodo para validar que los limites del cliente no superen  a lo facturado
     * @param cliente
     * @return 
     */
    private Boolean validarLimiteDeCreditosClientes(Cliente cliente){
        //Validar datos de facturacion
        
        //Validar Informconf
            
        //ValidarFamilia
        return true;
    }

    
}
