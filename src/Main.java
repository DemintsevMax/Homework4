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
            System.out.println("Если скорость " +speed+ " можно ездить спокойно");
        }



    }}

