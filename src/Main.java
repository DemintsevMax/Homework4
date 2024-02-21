public class Main {
    public static void main(String[] args) {
        System.out.println("Task №1");
        int ageAdultHuman = 23;
        if(ageAdultHuman>=18){
            System.out.println("Если возраст человека равен "
            +ageAdultHuman+ " то он совершеннолетний ");
        }
        int ageYoungHuman = 14;
        if (ageYoungHuman<18) {
            System.out.println("Если возраст человека равен "
            +ageYoungHuman+" то он не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }
    }

}