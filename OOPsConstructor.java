public class OOPsConstructor {
    String userName;
    public OOPsConstructor(String y){
        //this.userName="Developer";
        this.userName=y;
    }
    public static void main(String[] args){
        OOPsConstructor constructor = new OOPsConstructor("Developer");
        System.out.println(constructor.userName);
    }
}
