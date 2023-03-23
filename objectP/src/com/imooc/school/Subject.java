package com.imooc.school;

public class Subject {
    private String name;

    private Student[] students;

    private int studentNum;

    public Subject() {
    }

    public Subject(String name, Student[] students, int studentNum) {
        this.name = name;
        this.students = students;
        this.studentNum = studentNum;
    }

    public Subject(String name) {
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
     * @return students
     */
    public Student[] getStudents() {
        if (this.students == null) {
            this.students = new Student[200];
        }
        return students;
    }

    /**
     * 设置
     *
     * @param students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * 获取
     *
     * @return studentNum
     */
    public int getStudentNum() {
        return studentNum;
    }

    /**
     * 设置
     *
     * @param studentNum
     */
    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String toString() {
        return "Subject{name = " + name + ", students = " + students + ", studentNum = " + studentNum + "}";
    }

    public void addStudent(Student student) {
        for (int i = 0; i < this.getStudents().length - 1; i++) {
            if (this.getStudents()[i] == null) {
                student.setSubject(this);
                this.getStudents()[i] = student;
                this.setStudentNum(this.getStudentNum() + 1);
                break;
            }
        }
    }
}
