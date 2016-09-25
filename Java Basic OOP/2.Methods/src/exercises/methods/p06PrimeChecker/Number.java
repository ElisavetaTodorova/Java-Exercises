package exercises.methods.p06PrimeChecker;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Number {
    private Integer number;
    private Boolean prime;

    public Number(Integer value, Boolean isPrime) {
        this.number = value;
        this.prime = isPrime;
    }
    public Number nextPrimeNumber(){
        boolean isP=true;
        Number num=null;
        for (int number = this.number+1; number < Integer.MAX_VALUE; number++) {
            for (int divider = 2; divider <Math.sqrt(number); divider++) {

                if(number%divider==0){
                    isP=false;
                }
            }
            if(isP){
                return  num=new Number(number,this.prime);
            }
            isP=true;
        }
        return num;

    }

    public Integer getValue() {
        return number;
    }

    public Boolean getPrime() {
        return prime;
    }
}
