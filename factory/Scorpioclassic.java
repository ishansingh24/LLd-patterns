public class Scorpioclassic extends scorpio{
    
    @Override

    public void makeScorpio()
    {
        System.out.println("ScorpioClassic is created");
        this.engine = new ScorpioClassicEngine();
        this.bodyShell = new scorpioClassicBodyShell();
    }

    @Override
    public void driveCar()
    {
        makeScorpio();
        System.out.println("Scorpioclassic is running");
    }
}
