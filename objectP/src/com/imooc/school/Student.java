package com.imooc.school;

public class Student {
    private String name;

    private Subject subject;

    public Student() {
    }

    public Student(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public Student(String name) {
        this.name = name;

    }


    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return subject
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * 设置
     *
     * @param subject
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String toString() {
        return "Student{name = " + name + ", subject = " + subject + "}";
    }


}
