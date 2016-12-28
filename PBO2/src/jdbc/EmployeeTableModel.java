/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tatik
 */

package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tatik
 */
public class EmployeeTableModel extends AbstractTableModel {
//employee_id, last_name, email, hire_date, job_id, salary, department_id, manager_id
    String columNames[] = {"Id", "First Name","Last Name","Email", "Phone Number","Hire Date",
            "Job Id","Salary","Commission","Department Id","Manager Id"};
    ArrayList data;

    public EmployeeTableModel(String keyword) throws SQLException {
        Employee r=new Employee();
        data = r.searchEmployee(keyword);
    }

    public int getRowCount() {
        return data.size();
    }

    public int getColumnCount() {
        return columNames.length;
    }

    @Override
    public String getColumnName(int col) {
        return columNames[col];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee temp = (Employee) data.get(rowIndex);
        switch (columnIndex) {
                case 0 : return temp.getEmployee_id();
                case 1 : return temp.getFirst_name();
                case 2 : return temp.getLast_name();
                case 3 : return temp.getEmail();
                case 4 : return temp.getPhone_number();
                case 5 : return temp.getHire_date();
                case 6 : return temp.getJob_id();
                case 7 : return temp.getSalary();
                case 8 : return temp.getCommission_pct();
                case 9 : return temp.getDepartment_id();
                case 10 : return temp.getManager_id();
        }
        return null;
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public static void main(String[] args) throws SQLException {
        EmployeeTableModel test = new EmployeeTableModel("");
        for (int i=0;i<test.getRowCount();i++)
            System.out.println("nama :" + test.getValueAt(i, 10));
    }
}

