/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PersonDAO {
    List<Person> listPersons = new ArrayList<>();
    
    public int addPerson(Person person){
        listPersons.add(person);
        return 1;
    }
    
    public List<Person> getAllPerson(){
        return listPersons;
}
}
