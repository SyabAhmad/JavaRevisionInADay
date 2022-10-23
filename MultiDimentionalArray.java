public class MultiDimentionalArray {
    public static void main(String[] args){
        String[][] fruitsAnd = {{"Apple", "Banana", "Grapes"},{"Crops", "Maize", "Rice"}};
        System.out.println(fruitsAnd[0][1]);
        for(int i=0;i< fruitsAnd.length;i++){
            for (int j=0;j<fruitsAnd[i].length; j++){
                System.out.println(fruitsAnd[i][j]);
            }
        }
    }
}
