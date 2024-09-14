public class car {
    private Engine engine;
    private viechleFactory factory;

    public car(viechleFactory factory)
    {
        this.factory = factory;
    }

    public void makeCar()
    {
        this.engine = factory.createEngine();
    }

    public void driveCar()
    {
        makeCar();
        System.out.println("car is created");
    }
}
