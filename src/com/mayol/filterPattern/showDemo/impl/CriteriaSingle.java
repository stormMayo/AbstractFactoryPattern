package com.mayol.filterPattern.showDemo.impl;

import com.mayol.filterPattern.entity.Person;
import com.mayol.filterPattern.showDemo.Criteria;

import java.util.ArrayList;
import java.util.List;


public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        persons.stream().forEach(person -> {
            if("SINGLE".equalsIgnoreCase(person.getGender())){
                singlePersons.add(person);
            }
        });
        return singlePersons;
    }
}
