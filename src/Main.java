public class Main
{
    public static void main(String[] args) {
        System.out.println("Task №1");
        int humanAge = 23;
        if (humanAge>=18){
            System.out.println("Если возраст человека равен " + humanAge+ " то он совершеннолетний");
        } else  { System.out.println("Если возраст человека равен" + humanAge+
                " то он не достиг совершеннолетия, нужно немного подождать");}

        System.out.println("Task №2");
        int temperature = 19;
        if (temperature<=5){
            System.out.println("На улице холодно, нужно надеть шапку");
        }else {
            System.out.println("Сегодня тепло, можно идти без шапки");}

        System.out.println("Task №3");
        int speed = 57;
        if (speed>60){
            System.out.println("Если скорость " +speed+ " придется заплатить штраф");}
        else {
            System.out.println("Если скорость " +speed+ " можно ездить спокойно");}

        System.out.println("Task №4");
        int ageKid = 7;
        if (ageKid>=2 && ageKid<=6){
            System.out.println("Если возраст человека равен "+ ageKid + " то ему нужно ходить в детский сад.");
        } if (ageKid>=7 && ageKid<=17){
            System.out.println("Если возраст человека равен "+ ageKid + " то ему нужно ходить в школу.");
        } if (ageKid>=18 && ageKid<=24){
            System.out.println("Если возраст человека равен "+ ageKid + " то ему нужно ходить в университет.");
        } if (ageKid>24){
            System.out.println("Если возраст человека равен "+ ageKid + " то ему пора ходить на работу.");
        }

        System.out.println("Task №5");
        ageKid = 7;
        boolean humanAdult = true;
        if (ageKid<5){
            System.out.println("Если возраст ребенка равен " +ageKid+ "о он не может кататься на аттракционе.");
        }






    }}

