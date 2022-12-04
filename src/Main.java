public class Main {
    public static void main(String[] args) {

        var boxMen1= 78.2;
        var boxMen2= 82.7;

        var diffWeight1=boxMen2-boxMen1;
        System.out.println("Разница в весе, способ №1 " +diffWeight1+" кг");
        var diffWeight2=boxMen2 % boxMen1;
        System.out.println("Разница в весе, способ №2 " +diffWeight2+" кг");


    }
}