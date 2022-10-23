interface humanrobot{
    public void humanName();
    public void humanage();
}
class data implements humanrobot{
    @Override
    public void humanName() {
        System.out.println("Name: Developer");
    }

    @Override
    public void humanage() {
        System.out.println("Age: 21");
    }
}
public class OOPsInterface {
    public static void main(String [] args) {
        data info = new data();
        info.humanName();
        info.humanage();

    }
}
