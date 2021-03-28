package com.pouyaheydari.training.sematec.java.lib;

public class Student {
    String name;
    String family;
    String nCode;
    int age;
    int grade;

    public Student(String name, String family, String nCode, int age, int grade) {
        this.name = name;
        this.family = family;
        this.nCode = nCode;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getnCode() {
        return nCode;
    }

    public void setnCode(String nCode) {
        this.nCode = nCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 99 && age > 0)
            this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
