/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cast.testapp.invoice.boundary;

import java.io.File;

/**
 *
 * @author cbustamante
 */
public interface InvoiceFileReader {
    public File readFile(String filePath);
    public Boolean validateLine(String line);
}
