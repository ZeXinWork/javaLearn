package com.imooc.test;

import com.imooc.school.Student;
import com.imooc.school.Subject;

public class SubjectTest {
    public static void main(String[] args) {
        Subject subject = new Subject("计算机");
        Student student = new Student("张三");
        subject.addStudent(student);
        System.out.println(subject.getStudentNum());
    }
}
