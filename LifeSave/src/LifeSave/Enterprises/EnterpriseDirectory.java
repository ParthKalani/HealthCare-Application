/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Enterprises;
import java.util.ArrayList;

/**
 *
 * @author parthkalani
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList<Enterprise>();
    }
    
    
    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type)
    {
      Enterprise enterprise = null;

      if(type ==Enterprise.EnterpriseType.OrganSeeker){
       enterprise = new OrganSeekerEnterprise(name);
       enterpriseList.add(enterprise);     
      }
      else if (type == Enterprise.EnterpriseType.Government){
            enterprise = new GovernmentEnterprise(name);
            enterpriseList.add(enterprise);
        }
       else if (type == Enterprise.EnterpriseType.Charity){
            enterprise = new CharitableTrust(name);
            enterpriseList.add(enterprise);
        }
        else  if(type ==Enterprise.EnterpriseType.ServiceP){
         enterprise = new ServiceProvider(name);
         enterpriseList.add(enterprise);     
        }
      else  if(type ==Enterprise.EnterpriseType.Medical){
         enterprise = new MedicalEnterprise(name);
         enterpriseList.add(enterprise);
        }

      return enterprise;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public void deleteEnterprise(Enterprise enterprise)
    {
        enterpriseList.remove(enterprise);
    }
    
}
