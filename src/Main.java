public class Main {
    public static void main(String[] args) {
        var totalHours= 640;
        var dayHours= 8;
        var employees=totalHours/dayHours;


        System.out.println("Всего работников в компании – " +employees+" человек");
        employees=employees+94;
        dayHours=totalHours/employees;
        System.out.println("Если в компании работает " +employees+" человек, то всего "+dayHours+" часов работы может быть поделено между сотрудниками");

    }
}