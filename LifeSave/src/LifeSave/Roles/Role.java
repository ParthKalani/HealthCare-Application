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

/**
 *
 * @author kiara
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Enlistee("Enlistee"),
        AccountManager("Account Manager"),
        OrganSeeker("Organ Seeker"),
        Driver("Driver"),
        HealthAuditor("Health Auditor"),
        LifeSaveManager("LifeSave Manager"),
        Surgeon("Surgeon"),
        Sponsor("Sponsor");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem ecoSystem);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    
    
}

