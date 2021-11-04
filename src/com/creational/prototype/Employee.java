package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> emplList;

    public Employee(){
        emplList = new ArrayList<>();
    }

    public Employee(List<String> emplList){
        this.emplList = emplList;
    }

    public void loadData(){
        //read all employees from database and put into the list
        emplList.add("Pankaj");
        emplList.add("Raj");
        emplList.add("David");
        emplList.add("Lisa");
    }

    public List<String> getEmplList(){
        return emplList;
    }

    @Override
    //deep copy is created here
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s : this.getEmplList()){
            temp.add(s);
        }
        return new Employee(temp);
    }
}
