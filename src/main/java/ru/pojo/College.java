package ru.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setGroup(10);
        student.setCreated(new Date());
        System.out.println(student.getName() + " группа " + student.getGroup() + " поступил " + student.getCreated());
    }
}
