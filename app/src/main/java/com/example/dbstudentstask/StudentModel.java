package com.example.dbstudentstask;

class StudentModel {
    private String name;
    private String surname;
    private String marks;
    StudentModel(String name, String surname, String marks){
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMarks() {
        return marks;
    }
}
