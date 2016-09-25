package exercises.methods.p03LastDigitName;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Number {

    private Integer number;

    public Number(Integer number) {
        this.number=number;
    }



    public String getLastDigitAsWord() {
        String[] digitsAsWords = {"zero", "one", "two",
                "three","four" ,"five", "six",
                "seven", "eight", "nine"};
        int lastDigit = Math.abs(this.number % 10);
        return digitsAsWords[lastDigit];
    }
}
