package com.server.Models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document (collection = "Users")
public class Users implements Serializable {


    private static final long serialVersionUID = 1L;
    private String id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String Address;
    private String PhoneNumber;
    private String Role;

    /** @return String return the id */
    public String getId() { return id; }

    /** @param id the id to set */
    public void setId(String id) { this.id = id; }

    /** @return String return the FirstName */
    public String getFirstName() { return FirstName; }

    /** @param FirstName the FirstName to set */
    public void setFirstName(String FirstName) { this.FirstName = FirstName; }

    /** @return String return the LastName */
    public String getLastName() { return LastName; }

    /** @param LastName the LastName to set */
    public void setLastName(String LastName) { this.LastName = LastName; }

    /** @return String return the Email */
    public String getEmail() {return Email; }

    /** @param Email the Email to set */
    public void setEmail(String Email) { this.Email = Email; }

    /** @return String return the password */
    public String getPassword() { return Password; }

    /** @param password the password to set */
    public void setPassword(String password) { this.Password = password; }

    /** @return String return the Address */
    public String getAddress() { return Address; }

    /** @param Address the Address to set */
    public void setAddress(String Address) { this.Address = Address; }

    /** @return String return the PhoneNumber */
    public String getPhoneNumber() { return PhoneNumber; }

    /** @param PhoneNumber the PhoneNumber to set */
    public void setPhoneNumber(String PhoneNumber) { this.PhoneNumber = PhoneNumber; }

    /** @return String return the role */
    public String getRole() { return Role; }

    /** @param role the role to set */
    public void setRole(String role) { this.Role = role; }

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", Email='" + Email + '\'' +
                ", password='" + Password + '\'' +
                ", role=" + Role +
                '}';
    }

}