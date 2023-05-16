package classPractice3;

import java.time.LocalDate;
import java.time.Period;

public class School extends EducationCenter{
    public School(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    public School() {

    }

    @Override
    public void getStudentsEducationCenterInfo() {
        String string = toString();
        System.out.println(string);
    }

    @Override
    public void getEducationCentersYear() {
        Period dif=Period.between(getFoundationYear(),LocalDate.now());
        System.out.println(dif.getYears()+" years,"+ dif.getMonths()+" months,"+ dif.getDays()+" days");





    }
}
