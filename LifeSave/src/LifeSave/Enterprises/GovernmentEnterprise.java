/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Enterprises;
import LifeSave.Roles.Role;
import java.util.ArrayList;


/**
 *
 * @author parthkalani
 */
public class GovernmentEnterprise {
     public GovernmentEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Government);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
