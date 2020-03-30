import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TextAnalyzerTest {
    @Test
    public void getWordsTest(){
        TextAnalyzer textAnalyzer = new TextAnalyzer("test test test hi Hi");
        ArrayList<String> actual = textAnalyzer.getWords();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("test");
        expected.add("test");
        expected.add("test");
        expected.add("hi");
        expected.add("hi");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMostFrequentWordTest(){
        TextAnalyzer textAnalyzer = new TextAnalyzer("test test test hi Hi");
        String actual = textAnalyzer.getMostFrequentWord();
        String expected = "test";
        Assert.assertEquals(expected, actual);
    }

}
