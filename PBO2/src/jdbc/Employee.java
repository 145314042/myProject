/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Tatik
 */
public class Employee {
    private int employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private Date hire_date;
    private String job_id;
    private float salary;
    private float commission_pct;
    private int manager_id;
    private int department_id;

    /**
     * @return the employee_id
     */
    public Employee()
    {
        
    }
    public Employee(int id,String first,String last, String email, 
        String phone, Date d,String job, float sal, float com, int man_id, int dep_id)
    {
        this.employee_id=id;
        this.first_name=first;
        this.last_name=last;
        this.email=email;
        this.phone_number=phone;
        this.hire_date=d;
        this.job_id=job;
        this.salary=sal;
        this.commission_pct=com;
        this.manager_id=man_id;
        this.department_id=dep_id;
    }
    
    public int getEmployee_id() {
        return employee_id;
    }

    /**
     * @param employee_id the employee_id to set
     */
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telephone
     */
    

    public static ArrayList searchEmployee(String keyword) throws SQLException{
        ArrayList result = null;

        DataHandler dataHandler = new DataHandler();
        dataHandler.getDBConnection();
        Connection conn = dataHandler.conn;
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = "SELECT * FROM employees e1, employees e2 " +
                "where e1.manager_id=e2.employee_id and " +
                "e2.first_name like '%"+keyword+"%'" ;

        ResultSet rset = stmt.executeQuery(query);
        result = new ArrayList();
        while (rset.next()) {
          Employee temp = new Employee(rset.getInt(1),rset.getString(2),
                  rset.getString(3),rset.getString(4),rset.getString(5),
                  rset.getDate(6),rset.getString(7),rset.getFloat(8),
                  rset.getFloat(9),rset.getInt(10),rset.getInt(11));
          result.add(temp);
        }
        conn.close();
        return result;
    }

    /**
     * @return the phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * @return the hire_date
     */
    public Date getHire_date() {
        return hire_date;
    }

    /**
     * @param hire_date the hire_date to set
     */
    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    /**
     * @return the job_id
     */
    public String getJob_id() {
        return job_id;
    }

    /**
     * @param job_id the job_id to set
     */
    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the commission_pct
     */
    public float getCommission_pct() {
        return commission_pct;
    }

    /**
     * @param commission_pct the commission_pct to set
     */
    public void setCommission_pct(float commission_pct) {
        this.commission_pct = commission_pct;
    }

    /**
     * @return the manager_id
     */
    public int getManager_id() {
        return manager_id;
    }

    /**
     * @param manager_id the manager_id to set
     */
    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    /**
     * @return the department_id
     */
    public int getDepartment_id() {
        return department_id;
    }

    /**
     * @param department_id the department_id to set
     */
    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}
