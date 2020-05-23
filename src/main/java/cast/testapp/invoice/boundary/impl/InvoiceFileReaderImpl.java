/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cast.testapp.invoice.boundary.impl;

import cast.testapp.invoice.boundary.InvoiceFileReader;
import java.io.File;

/**
 *
 * @author cbustamante
 */
public class InvoiceFileReaderImpl implements InvoiceFileReader {

    @Override
    public File readFile(String filePath) {
       try{
           File file = new File(filePath);
           if (!file.exists()){
               throw new IllegalArgumentException("Ruta invalidad el archivo");
           }
           return file;
       } 
       catch(Exception ex){
           System.out.println("Ocurrio un error al leer el archivo");
       }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean validateLine(String line) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
