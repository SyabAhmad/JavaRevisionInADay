public class OOPsEncapsulation {
    private String userName;

    public String getUserName(){
        return userName;
    }
    public void setUserName(String newName){
        this.userName= newName;
    }
    public static void main(String[]args){
        OOPsEncapsulation encapsulation = new OOPsEncapsulation();
        encapsulation.setUserName("Developer");
        encapsulation.getUserName();
        System.out.println(encapsulation.getUserName());
    }
}
