package classPractice3;

import java.time.LocalDate;
import java.time.Period;

public class University extends EducationCenter{
    public University(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    public University() {
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
