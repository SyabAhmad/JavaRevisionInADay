public class BreakAndContinue {
    public static void main(String[] args){
        System.out.println("Break Statement");
        for (int i=0;i<10;i++){
            if (i == 3){
                break;
            }
            System.out.print(i);
        }
        System.out.println("\nContinue Statement");
        for (int j=0;j<10;j++){
            if (j == 6){
                continue;
            }
            System.out.print(j);
        }
    }
}
