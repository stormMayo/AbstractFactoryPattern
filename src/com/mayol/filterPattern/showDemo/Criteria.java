package com.mayol.filterPattern.showDemo;


import com.mayol.filterPattern.entity.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
