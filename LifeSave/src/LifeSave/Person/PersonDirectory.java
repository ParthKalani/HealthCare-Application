/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Person;

import java.util.ArrayList;

/**
 *
 * @author kiara
 */
public class PersonDirectory {
    
      private ArrayList<Enlistee> enlisteeList;
      private ArrayList<OrganSeeker> organSeekerLsit;
      private ArrayList<Person> personList;
    
      public PersonDirectory()
      {
            enlisteeList = new ArrayList<>();
            organSeekerLsit = new ArrayList<>();
            personList = new ArrayList<>();
      }
      
      public Enlistee addVolunteer()
    {
        Enlistee volunteer = new Enlistee();
        enlisteeList.add(volunteer);
        return volunteer;
    }
    
    public void removeVolunteer(Enlistee volunteer)
    {
      enlisteeList.remove(volunteer);
    }
    
    public OrganSeeker addCustomer()
    {
        OrganSeeker customer = new OrganSeeker();
        organSeekerLsit.add(customer);
        return customer;
    }
    
    public void removeCustomer(OrganSeeker customer)
    {
        organSeekerLsit.remove(customer);
    }
    

    public ArrayList<OrganSeeker> getOrganSeekerLsit() {
        return organSeekerLsit;
    }

    public ArrayList<Enlistee> getEnlisteeList() {
        return enlisteeList;
    }


      public Person addPerson()
    {
        Person person = new Person();
       personList.add(person);
        return person;
    }
    
    public void removePerson(Person person)
    {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

  
    

}
