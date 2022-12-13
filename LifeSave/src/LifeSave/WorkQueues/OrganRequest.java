/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.WorkQueues;

import LifeSave.Utilities.NeedHelp;

/**
 *
 * @author kiara
 */
public class OrganRequest extends WorkRequest {
 
    
    private String requestId;
    private static int count = 000;
    private String comments;
    private NeedHelp needOrgan;
    private String requestResult;
   

    public OrganRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("OREQ");
        sb.append(count);
        requestId = sb.toString();
        count++;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setNeedOrgan(NeedHelp needOrgan) {
        this.needOrgan = needOrgan;
    }

    public NeedHelp getNeedOrgan() {
        return needOrgan;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public String getRequestResult() {
        return requestResult;
    }


    
    @Override
    public String toString() {
        return getNeedOrgan().getHelp();
    }
    
    
    
    
}
