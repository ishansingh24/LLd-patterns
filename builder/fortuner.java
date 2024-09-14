public class fortuner implements Icar {

   public Ac             WithAc;
   public Gare           WithGare;
   public Tyre           withTyre;
   public BodyShell      withBodyShell;
   public engine         withEngine;
   public AirSusupension withAirSusupension;

   public fortuner(fortunerBuilder sc)
   {
       this.WithAc             = sc.WithAc;
       this.WithGare           = sc.WithGare;
       this.withTyre           = sc.withTyre;
       this.withBodyShell      = sc.withBodyShell;
       this.withEngine         = sc.withEngine;
       this.withAirSusupension = sc.withAirSusupension;
       System.out.println("All parts assembled");
   }
   
   @Override
   public void driveCar()
   {
        System.out.println("fortuner is ready to drive");
   } 
}
