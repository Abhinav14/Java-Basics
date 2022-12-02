import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class TestSingleTonClassAgain {

    public static void main(String[] args) {
        SingleTonClassAgain obj1 = SingleTonClassAgain.getInstance();
        SingleTonClassAgain obj2 = SingleTonClassAgain.getInstance();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }

}
