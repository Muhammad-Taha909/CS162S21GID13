/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

/**
 *
 * @author Ushher
 */
public abstract class Person 
{

     protected String name = null;
     protected String cnic = null;
     protected String phoneNumber = null;
     protected String dateofBirth = null;
    protected String email = null;
    protected String address = null;
    protected String age = null;
    protected String password = null;

    public String getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
    

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public void setEmail(String email) {
        this.email = email;
    }
     
   
  
}
