public class Main
{
    public static void main(String[] args) {
        System.out.println("Task №1");
        int humanAgeAdult = 23;
        if (humanAgeAdult>=18){
            System.out.println("Если возраст человека равен "
                    +humanAgeAdult+" то, он совершеннолетний ");    }
        int humanAgeYoung= 14;
        if (humanAgeYoung<18){
            System.out.println("Если возраст человека равен "
                    + humanAgeYoung + " то, он не достиг совершеннолетия, нужно немного подождать");}

        System.out.println("Task №2");
        int weatherСonditions1 = -10;
        if(weatherСonditions1<5){
            System.out.println("На улице "+weatherСonditions1+
                    " грудусов,нужно надеть шапку ");    }
        int weatherСonditions2 = 15;
        if(weatherСonditions2>5){
            System.out.println("На улице "+weatherСonditions2+
                    " грудусов, можно идти без шапки ");    }

        System.out.println("Task №3");
        int speedOne = 99;
        if(speedOne>60){
            System.out.println("Если скорость "+speedOne+" км/ч придется заплатить штраф");    }
        int speedTwo = 56;
        if(speedTwo<60){
            System.out.println("Если скорость "+speedTwo+" км/ч можно ездить спокойно"); }


        System.out.println("Task №4");
        int humanAge1 = 4;
        if (humanAge1>2 && humanAge1<6){
            System.out.println("Если возраст человека равен "
                    + humanAge1 +" то ему нужно ходить в детский сад"); }
        int humanAge2 = 16;
        if (humanAge2>7 && humanAge2<17){
            System.out.println("Если возраст человека равен " +humanAge2+
                    " то ему нужно ходить в школу");    }
        int humanAge3 = 19;
        if (humanAge3>18&&humanAge3<=24){
            System.out.println("Если возраст человека равен " +humanAge3+
                    " то его место в университете");        }
        int humanAge4 = 25;
        if(humanAge4>24){
            System.out.println("Если возраст человека равен " +humanAge4+
                    " то ему пора ходить на работу");
        }

        System.out.println("Task №5");
        int ageKid = 13;
        if (ageKid<5){
            System.out.println("Нельзя кататься на аттракционе");    }
        else if(ageKid>5&&ageKid<14){
            System.out.println("можно кататься на аттракционе в сопровождениине взрослого");    }
        else if(ageKid>14){
            System.out.println("может кататься кататься на аттракционе без сопровождения взрослого");     }

        System.out.println("Task №6");
        int totalSeats = 102;
        int seatingSeats = 60;
        int passengers = 55;
        if (passengers<seatingSeats && passengers<totalSeats)
        { System.out.println("В вагоне есть сидячие места");}
        else if (passengers>seatingSeats && passengers<totalSeats)
        { System.out.println("В вагоне есть стоячие места");}
        else if (passengers==totalSeats){
            System.out.println("Вагон полностью забит");          }

        System.out.println("Task №7");
        int one = 33;
        int two = 480000;
        int three = 999;
        if (one>two&&one>three){
            System.out.println(one+" большее число");}
        else if (two>one&&two>three){
            System.out.println(two+" большее число");}
        else if (three>one&&three>two) {
            System.out.println(three+" большее число");}



    }
}