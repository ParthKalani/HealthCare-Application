/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LifeSave.Enterprises;

import LifeSave.Enterprises.Enterprise.EnterpriseType;
import LifeSave.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author parthkalani
 */
public class CharitableTrust extends Enterprise{

    
     public CharitableTrust(String name) {
        super(name, EnterpriseType.Charity);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
