package classPractice3;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private String surname;
    private char gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student(String name, String surname, char gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }
    public void getStudentYearOfStudying(){
        Period diff=Period.between(getDateOfStart(),LocalDate.now());
        System.out.println(diff.getYears()+" years,"+diff.getMonths()+" months,"+diff.getDays()+" days.");
    }

    @Override
    public String toString() {
        return "name= " + name +','+
                "surname= " + surname +','+
                "gender=" + gender +','+
                "studying education center is " + educationCenter.getName() +','+
                "dateOfStart=" + dateOfStart +',';

    }
}
