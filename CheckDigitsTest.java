/**
 * Created by Benjamin Ehlers on 12/18/2018.
 */
public class CheckDigitsTest {

    public static void main(String[] args) {
        CheckDigits validCode = new CheckDigits("036000291454");
        System.out.println(validCode.validCode());

        CheckDigits invalidCode = new CheckDigits("042100005264");
        System.out.println(invalidCode.validCode());
    }
}
