public class Main {
    public static void main(String[] args) {
        System.out.println("Task №1");
        int humanAge = 23;
        if (humanAge >= 18) {
            System.out.println("Если возраст человека равен " + humanAge + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен" + humanAge +
                    " то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Task №2");
        int temperature = 19;
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println("Task №3");
        int speed = 57;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        System.out.println("Task №4");
        int ageKid = 7;
        if (ageKid >= 2 && ageKid <= 6) {
            System.out.println("Если возраст человека равен " + ageKid + " то ему нужно ходить в детский сад.");
        }
        if (ageKid >= 7 && ageKid <= 17) {
            System.out.println("Если возраст человека равен " + ageKid + " то ему нужно ходить в школу.");
        }
        if (ageKid >= 18 && ageKid <= 24) {
            System.out.println("Если возраст человека равен " + ageKid + " то ему нужно ходить в университет.");
        }
        if (ageKid > 24) {
            System.out.println("Если возраст человека равен " + ageKid + " то ему пора ходить на работу.");
        }

        System.out.println("Task №5");
        ageKid = 7;
        boolean humanAdult = true;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + "о он не может кататься на аттракционе.");
        }
        if (ageKid > 5 && ageKid < 14 && !humanAdult) {
            System.out.println("Если возраст ребенка равен " + ageKid + " если взрослого нет, то кататься нельзя.");
        }
        if (ageKid > 5 && ageKid < 14 && humanAdult) {
            System.out.println("Если возраст ребенка равен " + ageKid +
                    " то он может кататься только в сопровождении взрослого");
        }
        if (ageKid > 14) {
            System.out.println("Если возраст ребенка равен " + ageKid +
                    " то он может кататься без сопровождении взрослого");
        }


        System.out.println("Task №6");
        int totalСapacity = 102;
        int seatsCapasity = 60;
        int passengers = 102;

        if (passengers < totalСapacity) {
            System.out.println("В вагоне есть места");
        }
        if (passengers > seatsCapasity && passengers < totalСapacity) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (passengers < seatsCapasity)
            System.out.println("В вагоне есть сидячие места");
        if (passengers >= totalСapacity) {
            System.out.println("Вагон полностью забит");
        }

            System.out.println("Task №7");
            int one = 8;
            int two = 65;
            int three = 15;
            if (one > two && one > three) {
                System.out.println(one + " большее число");
            }
            if (two > one && two > three) {
                System.out.println(two + " большее число");
            }
            if (three > one && three > two)
                System.out.println(three + " большее число");
        }
    }





