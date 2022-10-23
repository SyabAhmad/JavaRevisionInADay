class car{
    String carName = "volvo";
    public void carHonk(){
        System.out.println("peeeeeeeeeeeeeeeeeeeeeeeeeeeep");
    }
}
public class OOPsInheritance extends  car{
    public static void main(String []args){
        OOPsInheritance Inheritance = new OOPsInheritance();
        Inheritance.carHonk();
        //// if int type (method)
        //System.out.println(Inheritance.carHonk());
    }
}
