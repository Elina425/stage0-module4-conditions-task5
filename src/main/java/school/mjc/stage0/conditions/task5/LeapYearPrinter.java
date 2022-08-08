package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch(year%4){
            case 0:
                System.out.println("leap");
            case 1:
                System.out.println("not leap");
        }
    }
}
