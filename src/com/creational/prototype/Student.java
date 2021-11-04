package com.creational.prototype;

public class Student implements Cloneable {

    int rollNo;

    String name;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(101, "Vishal");
        Student s2 = (Student) s1.clone();

        System.out.println(s2.toString());
        s1.setRollNo(111);

        System.out.println(s2.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
//        Student student = (Student) super.clone();
//        student.setRollNo(rollNo);
//        student.setName(name);
//        return student;
    }
}
