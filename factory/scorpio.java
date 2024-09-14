public class scorpio {
    public Engine engine;
    public bodyShell bodyShell;

    public void makeScorpio()
    {
        System.out.println("Scorpio is created");
        this.engine = new ScorpioEngine();
        this.bodyShell = new scorpioBodyShell();
    }

    public void driveCar()
    {
        makeScorpio();
        System.out.println("Scorpio is running");
    }
}
