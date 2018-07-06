public class TriangleExercise {
    public void printOneAsterisk(){
        System.out.println("*");
    }

    public void printHorizontalLine(int n){
        String string = "";
        for (int i = 0; i < n; i++)
            string = string + "*";
        System.out.println(string);
    }

    public void printVerticalLine(int n){
        for (int i = 0; i < n; i++)
            System.out.println("*");
    }
}
