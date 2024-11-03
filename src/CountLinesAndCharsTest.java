import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class CountLinesAndCharsTest {

    @Test
    public void getWords() {
        CountLinesAndChars countLinesAndChars = new CountLinesAndChars();
        countLinesAndChars.setText("My name is Nadia !");
        Assertions.assertEquals(5, countLinesAndChars.getWords());
       

    }

    @Test
    public void getLines(){
        CountLinesAndChars countLinesAndChars = new CountLinesAndChars();
        countLinesAndChars.setLines();
        countLinesAndChars.setLines();
        countLinesAndChars.setLines();
        Assertions.assertEquals(3,countLinesAndChars.getLines());
    }

    @Test
    public void getLongestWord() {
        CountLinesAndChars countLinesAndChars = new CountLinesAndChars();
        countLinesAndChars.setText(" My name is NadiaGarbo");
        Assertions.assertEquals("NadiaGarbo", countLinesAndChars.getLongestWord());
    }


    @Test
    public void containsStop() {
        CountLinesAndChars countLinesAndChars = new CountLinesAndChars();
        Assertions.assertTrue( countLinesAndChars.containsStop("stop"));
    }
}