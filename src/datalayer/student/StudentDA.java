/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datalayer.student;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.student.Student;
import utilities.DBConnection;
import utilities.DBHandle;

/**
 *
 * @author Mampitiya
 */
public class StudentDA {
    public static int addStudent(Student student) throws SQLException, ClassNotFoundException{
        String sql = "Insert INTO student(studentID, first_name,last_name,address,telephone,guardian_name, guardian_number, gender) VALUES ('" + student.getStudentID() + "','" + student.getFirst_name() + "','" + student.getLast_name() + "','" + student.getAddress() + "','" + student.getTelephone() + "','" + student.getGuardian_name() + "','" + student.getGuardian_number() + "','" + student.getGender() + "')";
        int res = DBHandle.setData(DBConnection.getConnection(), sql);
        return res;
    }
    
    public static Student searchStudent(String studetnID) throws SQLException, ClassNotFoundException {
        String sql = "Select * From student Where studentID='" + studetnID + "'";
        ResultSet rst = DBHandle.getData(DBConnection.getConnection(), sql);
        if (rst.next()) {
            String first_name = rst.getString("first_name");
            String last_name = rst.getString("last_name");
            String address = rst.getString("address");
            int telephone = rst.getInt("telephone");
            String guardian_name = rst.getString("guardian_name");
            int guardian_number = rst.getInt("guardian_number");
            int bit = rst.getInt("gender");
            boolean gender = false;
            if(bit == 1)
                gender = true;
            
            Student student = new Student(studetnID, first_name, last_name, address, telephone, guardian_name, guardian_number, gender);
            return student;
        } else {
            return null;
        }
    }
    public static int deleteStudent(String studentID) throws SQLException, ClassNotFoundException {
        String sql = "Delete From student Where studentID='" + studentID + "'";
        int rst = DBHandle.setData(DBConnection.getConnection(), sql);
        return rst;
    }
    
    public static int updateStudent(Student student) throws SQLException, ClassNotFoundException {
        String sql = "Update student set first_name='" + student.getFirst_name() + "', last_name='" + student.getLast_name() + "',address='" + student.getAddress() + "',telephone='" + student.getTelephone() + "',guardian_name='" + student.getGuardian_name() + "', guardian_number='" + student.getGuardian_number() + "',gender='" + student.getGender() + "' Where studentID='" + student.getStudentID() + "'";
        int rst = DBHandle.setData(DBConnection.getConnection(), sql);
        return rst;
    }
}
