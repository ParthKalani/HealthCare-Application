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
    

      private ArrayList<Person> personList;
    
      public PersonDirectory()
      {
            personList = new ArrayList<>();
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
