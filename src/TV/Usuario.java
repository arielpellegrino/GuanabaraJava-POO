package JavaDeveloperDio.src.TV;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("Canal atual: " + smartTV.canal);
        smartTV.mudarCanal(13);
        System.out.println("Canal atual: " + smartTV.canal);

        System.out.println("Volume Atual - " + smartTV.volume);

        System.out.println("Tv LIGADA? - " + smartTV.ligada);
        System.out.println("Canal atual? - " + smartTV.canal);
        System.out.println("Volume Atual - " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status - TV ligada ? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status - TV ligada ? " + smartTV.ligada);
    }
}