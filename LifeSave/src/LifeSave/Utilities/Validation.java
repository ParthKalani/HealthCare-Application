/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Utilities;

import LifeSaveMain.EcoSystem;
import LifeSave.Enterprises.Enterprise;
import LifeSave.Network.Network;
import LifeSave.Organizations.HospitalOrg;
import LifeSave.Organizations.FundingsOrg;
import LifeSave.Organizations.Organization;
import LifeSave.Organizations.UserAccountsOrg;
import LifeSave.Organizations.MobilityOrg;
import LifeSave.Organizations.FreeWillOrg;
import LifeSave.UserAccounts.UserAccount;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author jkoti
 */
public class Validation {
    
    
    
public static boolean validateString(String name){
        return true;
}
    
public static int calculateAge(Date dateOfBirth){
    try{     
         Calendar dob = Calendar.getInstance();
            dob.setTime(dateOfBirth);
                Calendar today = Calendar.getInstance();
                    int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
                if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR))
                        age--;
                        return age;
       }
catch(Exception e){
    return 0;   
}
}
    
    
public static FreeWillOrg getFreeWillOrg(EcoSystem ecoSystem, UserAccount userAccount){
     
    FreeWillOrg freeWillOrg = null;
        try{
            for(Network network : ecoSystem.getNetworkList()){
                  if(network.equals(userAccount.getNetwork())){
                     for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                         if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.ServiceP)){
            
                             for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
        
                                    if(organization instanceof FreeWillOrg){
                                          freeWillOrg = (FreeWillOrg)organization; 
                                    }
                            }
                        }
                    }
                }
            }
        }
        catch(NullPointerException npe){
               npe.printStackTrace();
        return null;
        }
        return freeWillOrg;
}
    
public static FreeWillOrg getFreeWillOrgInNw(EcoSystem ecoSystem, Network nw){
        FreeWillOrg freeWillOrg = null;
        try{
            for(Network network : ecoSystem.getNetworkList()){
                if(network.equals(nw)){
                    for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.ServiceP)){
                            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                                if(organization instanceof FreeWillOrg){
                                    freeWillOrg = (FreeWillOrg)organization; 
                                    }
                            }
                        }
                    }
                }
            }
        }
        catch(NullPointerException npe){
                npe.printStackTrace();
         return null;
        }
        return freeWillOrg;
    }
    
    public static FundingsOrg getFundingsOrg(EcoSystem ecoSystem, UserAccount userAccount){
        FundingsOrg fundingOrg = null;
        
        for(Network network : ecoSystem.getNetworkList()){
            if(network.equals(userAccount.getNetwork())){
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                    if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Charity)){
                        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                            if(organization instanceof FundingsOrg){
                                fundingOrg = (FundingsOrg)organization; 
                            }
                        }
                    }
                }
            }
        }
        return fundingOrg;
    }
      
public static MobilityOrg getMobilityOrg(EcoSystem ecoSystem, UserAccount userAccount){
    MobilityOrg mobilityOrg = null;
        
    for(Network network : ecoSystem.getNetworkList()){
        if(network.equals(userAccount.getNetwork())){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.ServiceP)){
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(organization instanceof MobilityOrg){
                            mobilityOrg = (MobilityOrg)organization; 
                        }
                    }
                }
            }
        }
    }
    return mobilityOrg;
} 
       
public static HospitalOrg getHospitalOrg(EcoSystem ecoSystem, UserAccount userAccount){
    HospitalOrg hospitalOrg = null;
     
    try{
        for(Network network : ecoSystem.getNetworkList()){
            if(network.equals(userAccount.getNetwork())){
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                    if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Medical)){
                        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                             if(organization instanceof HospitalOrg){
                                hospitalOrg = (HospitalOrg)organization; 
                            }
                        }
                    }
                }
            }
        }
    }
    catch(NullPointerException npe){
        npe.printStackTrace();
        return null;
    }
    return hospitalOrg;
}   
     
public static UserAccountsOrg getUserAccountsOrg(EcoSystem ecoSystem, UserAccount userAccount){
    UserAccountsOrg userAccountsOrg = null;
        try{
            for(Network network : ecoSystem.getNetworkList()){
                if(network.equals(userAccount.getNetwork())){
                    for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.OrganSeeker)){
                            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                                 if(organization instanceof UserAccountsOrg){
                                    userAccountsOrg = (UserAccountsOrg)organization; 
                                }
                            }
                        }
                    }
                }
            }
        }
        catch(NullPointerException npe){
          npe.printStackTrace();
            return null;
        }
            return userAccountsOrg;
    }  
      
 
}
