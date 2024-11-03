/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuraedu.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS
 */
public class NewClass {
    
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<String>();
        
          try {
            String path = "C:\\Users\\ASUS\\Desktop\\Jasper\\MyReports\\Invoice.jrxml";
            JasperReport compileReport = JasperCompileManager.compileReport(path);
 
            JREmptyDataSource dataSource = new JREmptyDataSource();
            JasperPrint fillReport = JasperFillManager.fillReport(compileReport, null, dataSource);
            JasperViewer.viewReport(fillReport);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
