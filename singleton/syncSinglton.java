public class syncSinglton {
    private static syncSinglton instance;

    private syncSinglton(){}

    //synchronized public static syncSinglton getInstance()
    synchronized public static syncSinglton getInstance()
    {
        if(instance == null)
        {
            synchronized (syncSinglton.class) {
                if (instance == null) {
                    instance = new syncSinglton();
                }
            }
        }

        return instance;
    }
}
