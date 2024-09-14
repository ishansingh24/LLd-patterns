//lazy initialization
public class singlton {
    private static final singlton Instance = new singlton();

    private singlton()
    {

    }

    public static singlton getInstance()
    {
        return Instance;
    }
}
