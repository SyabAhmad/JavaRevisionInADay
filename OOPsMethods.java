public class OOPsMethods {
    public void display(){
        System.out.println("using public specifier which needs object");
    }
    static void display1(){
        System.out.println("using static specifier no need of objects");
    }
    public static void main(String []args){
        OOPsMethods object=new OOPsMethods();
        object.display();

        display1();
    }
}
