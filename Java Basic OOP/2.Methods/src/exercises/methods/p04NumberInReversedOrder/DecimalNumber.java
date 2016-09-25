package exercises.methods.p04NumberInReversedOrder;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class DecimalNumber {
    private String number;

    public DecimalNumber(String number) {
        this.number = number;
    }
    public void printDigitsInReversedOrder(){
        StringBuilder result=new StringBuilder();
        for (int i = this.number.length()-1; i >=0 ; i--) {
            result.append(this.number.charAt(i));
        }
        System.out.println(result.toString());
    }
}
