import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) ;
        {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        int otherAge = 17;
        if (otherAge < 18) ;
        {
            System.out.println("Если возраст человека равен " + otherAge + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        int weather = 3;
        if (weather > 5) ;
        {
            System.out.println("На улице " + weather + " градуса, нужно надеть шапку.");
        }
        int temperature = 8;
        if (temperature > 5) ;
        {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        int speed = 58;
        if (speed < 60) ;
        {
            System.out.println("Если скорость " + speed + " километров в час, то можно ездить спокойно.");
        }
        int highSpeed = 65;
        if (highSpeed > 60) ;
        {
            System.out.println("Если скорость " + highSpeed + " километров в час, то придется заплатить штраф.");
        }
        int kidAge = 4;
        if (kidAge > 2 || kidAge < 6) ;
        {
            System.out.println("Если возраст человека " + kidAge + " года, то ему нужно ходить в детский сад.");
        }
        int teenAge = 12;
        if (teenAge > 7 || teenAge < 17) ;
        {
            System.out.println("Если возраст человека " + teenAge + " лет, то ему нужно ходить в школу.");
        }
        int youngAge = 21;
        if (youngAge >= 18 || youngAge <= 24) ;
        {
            System.out.println("Если возраст человека " + youngAge + " год, то его место в университете.");
        }
        int adultAge = 30;
        if (adultAge > 24) ;
        {
            System.out.println("Если возраст человека " + adultAge + " лет, то ему нужно ходить на работу.");
        }
        int littleBabyAge = 3;
        if (littleBabyAge < 5) ;
        {
            System.out.println("Если возраст ребенка равен " + littleBabyAge + " годам, то ему нельзя кататься на аттракционе.");
        }
        int middleBabyAge = 12;
        if (middleBabyAge > 5 || middleBabyAge < 12) ;
        {
            System.out.println("Если возраст ребенка равен " + middleBabyAge + " годам, то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        int kidTennAge = 15;
        if (kidTennAge > 14) ;
        {
            System.out.println("Если возраст ребенка равен " + kidTennAge + " годам, то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        int carriagePlaces = 56;
        if (carriagePlaces < 60) {
            System.out.println("В вагоне еще остались сидячие и стоячие места");
        } else {
            System.out.println("В вагоне остались только стоячие места");
        }
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two > three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}




