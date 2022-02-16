public class Main {
    public static void main(String[] args) {
        int volume = 1200; // Объем басейна
        int fillingSpeed = 30; // Литров в минуту
        int devastationSpeed = 10; // Литров в минуту
<<<<<<< HEAD
        int startVolume = 0;
=======
        int startVolume = 10;
        int minute = 10;
>>>>>>> 1de8b079c4538dfa8670a495b79476dae5ca5e43

        while (true) {
            System.out.println(startVolume);
            startVolume = startVolume + fillingSpeed - devastationSpeed;
            for (; minute < 60; minute = minute + 5) {
                continue;
            }
            if (startVolume > volume) {
                System.out.println("Скорость наполнения бассейна: " + minute + " минут");
                break;
            }
        }
    }
}
