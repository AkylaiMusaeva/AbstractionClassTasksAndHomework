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
    public String getStudentsEducationCenterInfo() {
        return super.toString();
    }
    @Override
    public void getEducationCentersYear() {
        Period dif=Period.between(getFoundationYear(),LocalDate.now());
        System.out.println(getName()+" бул окуу жай тузулгонуно "+dif.getYears()+" years,"+ dif.getMonths()+" months,"+ dif.getDays()+" days");



    }



}
