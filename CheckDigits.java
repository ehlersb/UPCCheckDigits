/**
 * Created by Benjamin Ehlers on 12/18/2018.
 */
public class CheckDigits {

    boolean valid;
    String code;

    public CheckDigits(String code) {
        this.code = code;
        evaluateValidity(code);
    }

    private void evaluateValidity(String code) {
        int sumOne = 0;
        for(int i = 0; i < 11; i+=2) {
            char currentChar = code.charAt(i);
            sumOne+=Character.getNumericValue(currentChar);
        }
        int stepTwo = sumOne * 3;
        int sumTwo = 0;
        for(int j = 1; j < 11; j+=2) {
            char currentChar = code.charAt(j);
            sumTwo+=Character.getNumericValue(currentChar);
        }
        int stepFour = sumTwo % 10;
        int checkDigit = 0;
        if(stepFour != 0) {
            checkDigit = 10 - stepFour;
        }
        if(checkDigit == Character.getNumericValue(code.charAt(11))) {
            valid = true;
        }
    }

    public String validCode() {
        int sumOne = 0;
        for(int i = 0; i < 11; i+=2) {
            char currentChar = this.code.charAt(i);
            sumOne+=Character.getNumericValue(currentChar);
        }
        int stepTwo = sumOne * 3;
        int sumTwo = 0;
        for(int j = 1; j < 11; j+=2) {
            char currentChar = this.code.charAt(j);
            sumTwo+=Character.getNumericValue(currentChar);
        }
        int stepFour = sumTwo % 10;
        int checkDigit = 0;
        if(stepFour != 0) {
            checkDigit = 10 - stepFour;
        }
        if(checkDigit == Character.getNumericValue(this.code.charAt(11))) {
            return "This UPC code is already valid. The check digit is " + this.code.charAt(11);
        } else {
            return "A valid check digit for this code is " + checkDigit;
        }

    }

}
