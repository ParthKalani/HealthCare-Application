/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Utilities;

/**
 *
 * @author jkoti
 */
public class Charity {
  
    
    private String amount;
    private String donationDate;
    private String accntNumber;
    private String accntName;
    public static String toAccountNumber = "8093782194";
    
    private static int count = 0;
    private int donationId;
    
    public Charity()
    {
     count++;
     donationId = count;
    }
    

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    @Override
    public String toString() {
        return String.valueOf(donationId);
    }

    public String getAccntNumber() {
        return accntNumber;
    }

    public void setAccntNumber(String accntNumber) {
        this.accntNumber = accntNumber;
    }

    public String getAccntName() {
        return accntName;
    }

    public void setAccntName(String accntName) {
        this.accntName = accntName;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }
 
}

