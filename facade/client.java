public class client {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, projector, screen, lights);

        homeTheater.watchMovie("Inception");
        // Later
        homeTheater.endMovie();
    }
}
