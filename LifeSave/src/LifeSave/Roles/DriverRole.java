/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Roles;

import LifeSaveMain.EcoSystem;
import LifeSave.Enterprises.Enterprise;
import LifeSave.Organizations.Organization;
import LifeSave.UserAccounts.UserAccount;
import javax.swing.JPanel;
import UI.Mobility.DriverWorkAreaJPanel;

/**
 *
 * @author kiara
 */
public class DriverRole extends Role{
    
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DriverWorkAreaJPanel(userProcessContainer, account, organization, enterprise.getOrganizationDirectory());
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    
}
