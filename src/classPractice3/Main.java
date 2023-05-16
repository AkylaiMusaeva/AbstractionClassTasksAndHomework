package classPractice3;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    /**EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
     Абстракт класска School , University, College деген саб класстарды тузунуз.
     Абстракт класстын ичине void getEducationCenterInfo() void getEducationCentersYear() (окуу жай тузулгонуно канча жыл болгонун чыгарсын) деген 2 метод тузунуз.
     Student деген класс тузунуз. Полелери: name, surname, gender, LocalDate dateOfStart(студент кайсыл жылы окуп баштаганы), EducationCenter educationCenter;
     Main класста студенттердин массивин тузуп ичине 5 студент салыныз. Студенттер ар кандай окуу жайда окусун.
     Main класста 1 метод тузунуз
     1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу маалыматты жана окуганыны канча жыл болгону тууралу маалыматты чыгарып берсин.*/
    public static void main(String[] args) {
        EducationCenter school1=new School("Peaksoft","KG",LocalDate.of(2011,12,2));
        EducationCenter college1=new College("Secom","KG",LocalDate.of(2014,8,18));
        EducationCenter university1=new University("Bilimkana","Bishkek",LocalDate.of(2010,12,11));
        EducationCenter school2=new School("Sapat","Bishkek",LocalDate.of(2009,4,30));
        EducationCenter university2=new University("Ala Too","Kg",LocalDate.of(2013,9,20));
        EducationCenter[]educationCenters={school1,college1,university1,school2,university2};
        for(int i=0;i<educationCenters.length;i++){
            System.out.println(educationCenters[i].getStudentsEducationCenterInfo());
            educationCenters[i].getEducationCentersYear();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        Student student1=new Student("A","a",'F',LocalDate.of(2023,2,5),school1);
        Student student2=new Student("B","b",'M', LocalDate.of(2023,3,1),college1);
        Student student3=new Student("C","c",'F', LocalDate.of(2023,12,4),university1);
        Student student4=new Student("D","d",'M', LocalDate.of(2023,11,1),school2);
        Student student5=new Student("E","e",'F', LocalDate.of(2022,12,2),university2);
        Student[]students={student1,student2,student3,student4,student5};
        for(int i=0;i< students.length;i++){
            System.out.println(students[i].toString());
            students[i].getStudentYearOfStudying();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        }











    }


}
