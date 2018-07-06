public class FizzBuzzExercise {
    private int num;


    public FizzBuzzExercise(int n){
        this.num = n;
    }

    public void fizzBuzz(){
        for (int i = 1; i <= num; i++){
            String fizzbuzz = "";
            if (i%3 == 0)
                fizzbuzz = fizzbuzz + "Fizz";
            if (i%5 == 0)
                fizzbuzz = fizzbuzz + "Buzz";
            if (fizzbuzz.equals(""))
                fizzbuzz = String.valueOf(i);
            System.out.println(fizzbuzz);
        }
    }
}
