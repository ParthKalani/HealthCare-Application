/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Person;

import LifeSave.Utilities.Charity;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kiara
 */
public class Person {
    
    private String fName;
    private String name;
    private String lName;
    private Date dob;
    private String add1;
    private String phoneNumber;
    private String personId;
    private boolean Enlistee;
    private boolean OrganSeeker;
    private String emailId;
    private String add2;
    private String city;
    private String zipCode;
    private String gender;
    private static int count = 00001;
    private String country;
    private String state;
    private int age;
    private ArrayList<Charity> charityList;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Person()
    {
     StringBuffer sb = new StringBuffer();
        sb.append("PER");
        sb.append(count);
        personId = sb.toString();
        count++;   
        charityList = new ArrayList<>();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = this.fName+ " "+this.lName;
    }

    public String getPersonId() {
        return personId;
    }

   
    public boolean isEnlistee() {
        return Enlistee;
    }

    public void setEnlistee(boolean Enlistee) {
        this.Enlistee = Enlistee;
    }

    public boolean isOrganSeeker() {
        return OrganSeeker;
    }

    public void setOrganSeeker(boolean OrganSeeker) {
        this.OrganSeeker = OrganSeeker;
    }

   
    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

   
    
    @Override
    public String toString() {
        return this.name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

       public Charity addCharity()
    {
        Charity donation = new Charity();
        charityList.add(donation);
        return donation;
    }
            
}
