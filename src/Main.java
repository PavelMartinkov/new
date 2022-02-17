public class Main {
    public static void main(String[] args) {
        int volume = 1200; // Объем басейна
<<<<<<< Updated upstream:src/Main.java
        int fillingSpeed = 30; // Литров в минуту
        int devastationSpeed = 10; // Литров в минуту
        int startVolume = 0;
        int startVolume = 10;
        int startVolume = 0;
        int minute = 10;

=======
        int fillingSpeed = 30; // Литров в минут
int ololo;
>>>>>>> Stashed changes:SwimmingPool/src/Main.java
        while (true) {
            System.out.println(startVolume);
            startVolume = startVolume + fillingSpeed - devastationSpeed;
            for (; minute < 120; minute = minute + 5) {

                continue;
            }
            if (startVolume > volume) {
                System.out.println("Скорость наполнения бассейна: " + minute + " минут");
                break;
            }
        }
    }
}
