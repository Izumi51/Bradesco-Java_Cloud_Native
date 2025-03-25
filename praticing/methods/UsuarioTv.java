public class UsuarioTv {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        System.out.println("Ligada? " + tv.state);
        System.out.println("Volume: " + tv.volume);
        System.out.println("Canal: " + tv.channel);

        tv.changeState();
        System.out.println("Ligada? " + tv.state);

        tv.changeState();
        System.out.println("Ligada? " + tv.state);


        tv.riseVolume();
        System.out.println("Volume: " + tv.volume);

        tv.downVolume();
        System.out.println("Volume: " + tv.volume);

    }
}