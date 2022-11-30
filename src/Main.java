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

        var hours = 640;
        var employeesHours = 8;
        var employees = hours / employeesHours;
        System.out.println("Всего работников в компании " + employees + " человек");

        employees += 94;
        hours = employees * employeesHours;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + hours
                + " часов работы может быть поделено между сотрудниками");



    }
}