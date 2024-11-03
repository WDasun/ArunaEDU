/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuraedu.common;

import com.anuraedu.db.DB;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class SQ {
//    public static void main(String[] args) {
//        SAVE(a, "'"+b+"','"+c+"','"+d+"'");
//    }

    private static ResultSet result;

    public static void SAVE(String tableName, String values) throws Exception {
        try {
            DB.push("insert into " + tableName + " values(" + values + ")");
        } catch (Exception e) {
            throw e;
        }
    }
    public static boolean STATUSSEARCH(String tableName,String coloumnName, String searchValue) throws Exception{
        
        try {
            ResultSet rs1 = DB.search("select status from "+tableName+" where "+coloumnName+" = '"+searchValue+"'");
            rs1.next();
            return rs1.getBoolean("status");
            
            
        } catch (Exception e) {
            throw e;
        }
        
    }

    public static void SEARCH(String tableName, String columnName, String searchValue) throws Exception {
        try {
            result = DB.search("select * from " + tableName + " where " + columnName + "='" + searchValue + "'");
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static void PVTSEARCH() throws Exception {
        try {
            
            result = DB.search("SELECT id_student,concat(fname,' ',lname) as cname FROM student");
            
        } catch (Exception e) {
            throw e;
        }
    }
    
     public static void PVTSEARCH2() throws Exception {
        try {
            
            result = DB.search("SELECT id_lecturer,concat(fname,' ',lname) as cname FROM lecturer");
            
        } catch (Exception e) {
            throw e;
        }
    }
     
     public static void PVTSEARCH5() throws Exception {
        try {
            
            result = DB.search("SELECT id_employee,concat(fname,' ',lname) as cname FROM employee");
            
        } catch (Exception e) {
            throw e;
        }
    }
     
     public static void PVTSEARCH3(String column1,String column2,String column3,String tableName,String concatColumnName) throws Exception {
        try {
            
            result = DB.search("SELECT "+column1+",concat("+column2+",' ',"+column3+") as "+concatColumnName+" FROM "+tableName+"");
            
        } catch (Exception e) {
            throw e;
        }
    }
     
     public static void PVTSEARCH4(String columnName1,String columnName2,String tableName,String columnName3,String searchValue) throws Exception {
        try {
            
            result = DB.search("SELECT "+columnName1+","+columnName2+" FROM "+tableName+" where "+columnName3+" like '"+searchValue+"'");
            
        } catch (Exception e) {
            throw e;
        }
    }
     
     
    
    public static void LIKESEARCH(String tableName, String columnName, String searchValue) throws Exception{
        try {
            result = DB.search("SELECT *FROM "+tableName+" where "+columnName+" like '"+searchValue+"%'");
        } catch (Exception e) {
            throw e;
        }
    }

    public static void SEARCH(String tableName) throws Exception {
        try {
            result = DB.search("select * from " + tableName);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void UPDATE(String tableName, String values, String columnName, String searchValue) throws Exception {
        try {
            DB.push("update " + tableName + " set " + values + " where " + columnName + "='" + searchValue + "'");
        } catch (Exception e) {
            throw e;
        }
    }

    public static ResultSet getResult() {
        return result;
    }

}
