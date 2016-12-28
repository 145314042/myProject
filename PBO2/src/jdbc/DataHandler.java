/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *
 * @author Lycorice
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

public class DataHandler {

    // string ‘localhost’ anda ganti dengan IP server yang digunakan
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
    String userid = "data2";
    String password = "data2";

    Connection conn;
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;

    public DataHandler() {
    }

    public void getDBConnection() {
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
            System.out.println("Koneksi berhasil");
        } catch (SQLException ex) {
            System.out.println("Masih belum konek");
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Tidak bisa tutup koneksi");
        }
    }
//employee_id, last_name, email, hire_date, job_id, salary, department_id, manager_id

    public ResultSet getAllEmployees() throws SQLException {
        getDBConnection();
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        query = "SELECT e.employee_id,e.last_name,e.email, e.hire_date,"
                + "j.job_title, e.salary, d.department_name, e2.last_name"
                + " FROM employees e, employees e2, jobs j, departments d "
                + "where e.job_id=j.job_id and e.department_id=d.department_id"
                + " and e2.employee_id=e.manager_id ORDER BY employee_id";
        System.out.println("\nExecuting query: " + query);
        rset = stmt.executeQuery(query);
        return rset;
    }

    public static void main(String[] args) {
        DataHandler dh = new DataHandler();
        dh.getDBConnection();
    }
}
