/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.WorkQueues;

import LifeSave.Utilities.Charity;



/**
 *
 * @author kiara
 */
public class CharityRequest extends WorkRequest{
    
    private String fundedBy;
    private String requestId;
    private static int count = 000;
    private Charity charity;
   
    public CharityRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("CHARITY");
        sb.append(count);
        requestId = sb.toString();
        count++;
    }

    public String getFundedBy() {
        return fundedBy;
    }

    public void setFundedBy(String fundedBy) {
        this.fundedBy = fundedBy;
    }
