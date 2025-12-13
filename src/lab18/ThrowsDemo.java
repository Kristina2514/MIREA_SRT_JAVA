package lab18;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails" );
            }
        }
        catch (NullPointerException e) {
            System.out.println("test");
        }


    }

    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        obj.getDetails(null);
    }

}
