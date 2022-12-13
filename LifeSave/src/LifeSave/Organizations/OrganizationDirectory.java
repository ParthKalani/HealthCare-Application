/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Organizations;

import LifeSave.Organizations.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author parthkalani
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
      organizationList = new ArrayList<>();
    }
    
    public Organization addOrganization(Type type)
    {
       Organization organization = null;
        if (type.getValue().equals(Type.Enlistee.getValue())){
            organization = new FreeWillOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.OrganSeeker.getValue())){
            organization = new OrganSeekerOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AccountManager.getValue())){
            organization = new UserAccountsOrg();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Sponsor.getValue())){
            organization = new FundingsOrg();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Mobility.getValue())){
            organization = new MobilityOrg();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.HealthAuditor.getValue())){
            organization = new HealthCouncilCommittee();
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Type.Surgeon.getValue())){
            organization = new HospitalOrg();
            organizationList.add(organization);
        }
        return organization;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public void deleteOrganization(Organization organization)
    {
      organizationList.remove(organization);
    }
    
}
