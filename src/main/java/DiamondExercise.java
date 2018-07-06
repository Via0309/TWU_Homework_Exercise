public class DiamondExercise {

    public void printIsocelesTriangle(int n){
        int max = 2 * n - 1;
        for(int i = 0; i < n; i++){
            System.out.println(createAsterisk(i, max));
        }
    }

    public void printDiamond(int n){
        int max = 2 * n -1;
        for(int i = 0; i < n; i++){
            System.out.println(createAsterisk(i, max));
        }
        for(int i = n-2; i >= 0; i--){
            System.out.println(createAsterisk(i, max));
        }
    }

    public void printDiamondWithName(int n){
        int max = 2 * n -1;
        for(int i = 0; i < n-1; i++){
            System.out.println(createAsterisk(i, max));
        }
        System.out.println("Via");
        for(int i = n-2; i >= 0; i--){
            System.out.println(createAsterisk(i, max));
        }
    }

    private String createAsterisk(int n, int max) {
        String result = "";
        int num = 2 * n + 1;
        for (int i = 0; i < num; i++)
            result = result + "*";
        int spaceNum = (max - num)/2;
        for (int i = 0; i < spaceNum; i++)
            result = " " + result + " ";
        return result;
    }
}
