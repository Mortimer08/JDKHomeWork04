package org.example;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    List<Emplyee> stuff;

    public Directory() {
        stuff = new ArrayList<>();
    }

    public void addEmployee(Emplyee emplyee) {

        stuff.add(emplyee);
    }

    public List<Emplyee> findByExperience(Integer experience) {
        List<Emplyee> result = new ArrayList<>();
        for (Emplyee employee : stuff) {
            if (employee.getExperience().equals(experience)) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<String> findByName(String name) {
        List<String> result = new ArrayList<>();
        for (Emplyee employee : stuff) {
            if (employee.getName().equals(name)) {
                result.add(employee.getPhone());
            }
        }
        return result;
    }

    public Emplyee findByNumber(Integer number) {
        Emplyee result;
        for (Emplyee employee : stuff) {
            if (employee.getNumber().equals(number)) {
                return employee;
            }
        }
        return null;
    }

}
