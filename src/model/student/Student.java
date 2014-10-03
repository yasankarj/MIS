/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.student;

/**
 *
 * @author Mampitiya
 */
public class Student {

    private String studentID;
    private String first_name;
    private String last_name;
    private String address;
    private int telephone;
    private String guardian_name;
    private int guardian_number;
    private boolean gender;

    public Student(String studentID, String first_name, String last_name, String address, int telephone, String guardian_name, int guardian_number, boolean gender) {
        this.studentID = studentID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.telephone = telephone;
        this.guardian_name = guardian_name;
        this.guardian_number = guardian_number;
        this.gender = gender;
    }

    /**
     * Get the value of gender
     *
     * @return the value of gender
     */
    public int getGender() {
        if(gender)
            return 1;
        return 0;
    }

    /**
     * Set the value of gender
     *
     * @param gender new value of gender
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * Get the value of guardian_number
     *
     * @return the value of guardian_number
     */
    public int getGuardian_number() {
        return guardian_number;
    }

    /**
     * Set the value of guardian_number
     *
     * @param guardian_number new value of guardian_number
     */
    public void setGuardian_number(int guardian_number) {
        this.guardian_number = guardian_number;
    }

    /**
     * Get the value of guardian_name
     *
     * @return the value of guardian_name
     */
    public String getGuardian_name() {
        return guardian_name;
    }

    /**
     * Set the value of guardian_name
     *
     * @param guardian_name new value of guardian_name
     */
    public void setGuardian_name(String guardian_name) {
        this.guardian_name = guardian_name;
    }

    /**
     * Get the value of telephone
     *
     * @return the value of telephone
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * Set the value of telephone
     *
     * @param telephone new value of telephone
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the value of last_name
     *
     * @return the value of last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * Set the value of last_name
     *
     * @param last_name new value of last_name
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * Get the value of first_name
     *
     * @return the value of first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * Set the value of first_name
     *
     * @param first_name new value of first_name
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * Get the value of studentID
     *
     * @return the value of studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * Set the value of studentID
     *
     * @param studentID new value of studentID
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

}
