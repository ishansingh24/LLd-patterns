public class ScorpioN extends scorpio{
    
    @Override
    public void makeScorpio()
    {
        System.out.println("ScorpioN is created");
        this.engine = new ScorpioNEngine();
        this.bodyShell =  new scorpioNBodyShell();
    }

    @Override
    public void driveCar()
    {
        makeScorpio();
        System.out.println("ScorpioN is running");
    }
}
