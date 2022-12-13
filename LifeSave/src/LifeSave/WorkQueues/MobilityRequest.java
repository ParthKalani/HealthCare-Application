/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.WorkQueues;

import LifeSave.Person.Enlistee;

/**
 *
 * @author tejageetla
 */
public class MobilityRequest extends WorkRequest{
    
    private String mobRequestID;
    private static int count = 000;
    private String needMob;
    private String mobReqResult;
    
    
     public MobilityRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("TRANS");
        sb.append(count);
        mobRequestID = sb.toString();
        count++;
    }
     
    public void setNeedMob(String needMob) {
        this.needMob = needMob;
    }

    public String getNeedMob() {
        return needMob;
    }

    @Override
    public String toString() {
        Enlistee volunteer = (Enlistee)this.getSender().getPerson();
        String address = volunteer.getAdd1().concat(volunteer.getAdd2().concat(volunteer.getCity()));
        return address;
                
    }

    public String getMobReqResult() {
        return mobReqResult;
    }

    public void setMobReqResult(String mobReqResult) {
        this.mobReqResult = mobReqResult;
    }
     
     
}
