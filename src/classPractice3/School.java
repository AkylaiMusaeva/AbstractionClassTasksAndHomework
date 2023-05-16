package classPractice3;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;

public class School extends EducationCenter{
    public School(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    public School() {

    }


    @Override
    public String getStudentsEducationCenterInfo() {
        return toString();
    }
    @Override
    public void getEducationCentersYear() {
        Period dif=Period.between(getFoundationYear(),LocalDate.now());
        System.out.println(getName()+" бул окуу жай тузулгонуно "+dif.getYears()+" years,"+ dif.getMonths()+" months,"+ dif.getDays()+" days");




    }
}
