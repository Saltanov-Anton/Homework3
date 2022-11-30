public class Main {

    public static void main(String[] args) {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weightBoxers = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров = " + weightBoxers + "кг");

        var difference = Math.abs(firstBoxer - secondBoxer);
        System.out.println("Разница в весе " + difference + "кг");

        var difference2 = secondBoxer % firstBoxer;
        System.out.println("Разница в весе " + difference2 + "кг");


    }
}