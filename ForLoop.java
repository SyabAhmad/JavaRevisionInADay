public class ForLoop {
    public static void main(String []args){
        String pattern = "*";
        for (int i=0; i<10;i++){
            System.out.print("\n");
            for (int j=0;j<i; j++){
                System.out.print(pattern);
            }
        }

        for (int i=10; i>0;i--){
            System.out.print("\n");
            for (int j=0;j<i; j++){
                System.out.print(pattern);
            }
        }
    }
}
