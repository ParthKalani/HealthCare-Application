/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSaveMain;


import LifeSave.Utilities.NeedHelp;
import LifeSave.Enterprises.Enterprise;
import LifeSave.Network.Network;
import LifeSave.Organizations.Organization;
import LifeSave.Person.Person;
import LifeSave.Roles.AdminRole;
import LifeSave.Roles.SurgeonRole;
import LifeSave.Roles.SponsorRole;
import LifeSave.Roles.DriverRole;
import LifeSave.Roles.LifeSaveManager;
import LifeSave.Roles.HealthAuditor;
import LifeSave.Roles.AccountManager;
import LifeSave.Roles.SystemAdminRole;
import LifeSave.UserAccounts.UserAccount;

import LifeSave.Enterprises.Enterprise;
import LifeSave.Network.Network;
import LifeSave.Organizations.Organization;
import LifeSave.UserAccounts.UserAccount;


/**
 *
 * @author parthkalani
 */
public class ConfigureASystem {
    
    
    public static EcoSystem configure()
    {
        EcoSystem system = EcoSystem.getInstance();
        Person person = system.getPersonDirectory().addPerson();
        person.setfName("Sys");
        person.setlName("Admin");
        person.setName();
        
        UserAccount ua = system.getUserAccountDirectory().addUserAccount("system", "system1@", person, new SystemAdminRole());
        ua.setEnabled(true);
        
       
        
        Network network = system.addNetwork();
      
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");
    // ServiceP    
        Enterprise enterprise = network.getEnterpriseDirectory().addEnterprise("Boston Services", Enterprise.EnterpriseType.ServiceP);
        person = enterprise.getPersonDirectory().addPerson();
        person.setlName("Boston Services Admin");
        person.setName();
        UserAccount account = enterprise.getUserAccountDirectory().addUserAccount("BSA", "BSA1@", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Enlistee);
        Organization organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Mobility);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setfName("Driver");
        person.setlName("Mobility");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("driver", "driver1@", person, new DriverRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
      // Life Save
         enterprise = network.getEnterpriseDirectory().addEnterprise("Boston LifeSave", Enterprise.EnterpriseType.OrganSeeker);
         person = enterprise.getPersonDirectory().addPerson();
        person.setlName("Boston LifeSave Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("BLS", "BLS1@", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.OrganSeeker);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.AccountManager);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setfName("Account Manager");
        person.setlName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("BAM", "BAM1@", person, new AccountManager());
        account.setNetwork(network);
        account.setEnabled(true);
        
        //Manager
        
        person = organization.getPersonDirectory().addPerson();    
          
        person.setfName("Manager");
        person.setlName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("BMAN", "BMAN1@", person, new LifeSaveManager());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
        // Charity
        enterprise = network.getEnterpriseDirectory().addEnterprise("Charity", Enterprise.EnterpriseType.Charity);
        person = enterprise.getPersonDirectory().addPerson();
        person.setlName("Charity Admin");
        person.setName();
        account = enterprise.getUserAccountDirectory().addUserAccount("char", "char1@", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Sponsor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setfName("Sponsor");
        person.setlName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("SPON", "SPON1@", person, new SponsorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
        // Medical
        enterprise = network.getEnterpriseDirectory().addEnterprise("Medical", Enterprise.EnterpriseType.Medical);
        person = enterprise.getPersonDirectory().addPerson();
        person.setlName("Medical Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("medical", "medical", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Surgeon);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setfName("Surgeon");
        person.setlName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("SURG", "SURG1@", person, new SurgeonRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        // Government
         enterprise = network.getEnterpriseDirectory().addEnterprise("Government", Enterprise.EnterpriseType.Government);
         person = enterprise.getPersonDirectory().addPerson();
        person.setlName("Govt Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("GOVT", "GOV1@", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.HealthAuditor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setfName("HealthAuditor");
        person.setlName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("HAUD", "HAUD1@", person, new HealthAuditor());
        account.setNetwork(network);
        account.setEnabled(true);
      
    return system;
    }
    
  
  
}
