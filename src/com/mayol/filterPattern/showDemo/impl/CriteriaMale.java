package com.mayol.filterPattern.showDemo.impl;

import com.mayol.filterPattern.entity.Person;
import com.mayol.filterPattern.showDemo.Criteria;

import java.util.ArrayList;
import java.util.List;


public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        persons.stream().forEach(person -> {
            if("MALE".equalsIgnoreCase(person.getGender())){
                malePersons.add(person);
            }
        });
        return malePersons;
    }
}
