public class lazySinglton {

    private lazySinglton(){}

    private static class singlton{
        private static final lazySinglton instance = new lazySinglton();
    }

    public  static lazySinglton getInstance()
    {
        return singlton.instance;
    }

}
