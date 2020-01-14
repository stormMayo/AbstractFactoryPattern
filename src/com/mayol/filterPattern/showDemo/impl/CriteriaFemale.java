package com.mayol.filterPattern.showDemo.impl;

import com.mayol.filterPattern.entity.Person;
import com.mayol.filterPattern.showDemo.Criteria;

import java.util.ArrayList;
import java.util.List;


public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        persons.stream().forEach(person -> {
            if("FEMALE".equalsIgnoreCase(person.getGender())){
                femalePersons.add(person);
            }
        });
        return femalePersons;
    }
}
