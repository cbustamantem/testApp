/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testapp;

import py.com.consultores.javagenerators.ClassGenerator;
import py.com.consultores.javagenerators.ConnectionManager;

/**
 *
 * @author cbustamante
 */
public class Utils {
    public static void main(String[] args) {
        System.out.println("Generate classes");
        ConnectionManager connMgr = new ConnectionManager();
        connMgr.getConnection();
        ClassGenerator generator = new ClassGenerator();
        String query="SELECT id_cliente, nombre, apellido, nro_documento FROM public.cliente";
        generator.generate(query, "com.testapp.facturacion", "Cliente");
    }
}
