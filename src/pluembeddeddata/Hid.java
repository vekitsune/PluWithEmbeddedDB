/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pluembeddeddata;

import java.sql.Statement;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Verosffy
 */
public class Hid {

    final String JDBC_DRIVER = "org.apache.derby.jdbc.EbeddedDriver";
    final String URL = "jdbc:derby:pluDB; create=true";

    final String PASSWORD = "nincsraszukseg";
    final String USERNAME = "nincsrászukseg";

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    DatabaseMetaData meta = null;

    public Hid() {
        try {
            con = DriverManager.getConnection(URL);
        } catch (SQLException ex) {
            System.out.println("Az adatbázishoz kapcsolodas nem jott létre");
            System.out.println(ex);
        }
        if (con != null) {
            try {
                st = con.createStatement();
            } catch (SQLException ex) {
                System.out.println("Nem sikerult utasitast irni");
                System.out.println(ex);
            }
            try {
                meta = con.getMetaData();
                rs = meta.getTables(null, "APP", "pluLista", null);
            } catch (SQLException ex) {
                System.out.println("Nincs még tábla, nincs metaadat");
                System.out.println(ex);
                String sql = "create table pluLista(termeknev varchar(20), plukod varchar(20), kategoria varchar(20)"
                        + ", kepek blob)";
                try {
                    st.execute(sql);
                } catch (SQLException ex1) {
                    System.out.println("Nem tudom mért, de nem sikerült létrehozni a táblát");
                    System.out.println(ex);
                }
            }
        }

    }
  

}
