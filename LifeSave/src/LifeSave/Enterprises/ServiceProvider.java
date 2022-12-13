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
public class ServiceProvider {
    
    public ServiceProvider(String name) {
        super(name, EnterpriseType.ServiceP);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
