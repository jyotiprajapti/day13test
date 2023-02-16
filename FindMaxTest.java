import org.example.FindMax;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FindMaxTest {
    FindMax obj = new FindMax();
    @Test
    public void findMaxTest1(){

     int expected=   obj.findMax(40,30,20);
     assertEquals(expected,40);

    }
    @Test
    public void findMaxTest2(){

        int expected=   obj.findMax(30,40,20);
        assertEquals(expected,40);

    }
    @Test
    public void findMaxTest3(){

        int expected=   obj.findMax(20,30,40);
        assertEquals(expected,40);

    }

    @Test
    public void findMaxFloatTest1(){

        float expected=   obj.findMaxFloat(40.0f,30.0f,20.0f);
        assertEquals(expected,40.0f);

    }
    @Test
    public void findMaxFloatTest2(){

        float expected=   obj.findMaxFloat(30.0f,40.0f,20.0f);
        assertEquals(expected,40.0f);

    }
    @Test
    public void findMaxFloatTest3(){

        float expected=   obj.findMaxFloat(20.0f,40.0f,30.0f);
        assertEquals(expected,40.0f);

    }
    @Test
    public void findlongestStringTest1(){

        String expected=   obj.findLongestString("abcd","ab","abc");
        assertEquals(expected,"abcd");

    }
    @Test
    public void findlongestStringTest2(){

        String expected=   obj.findLongestString("abc","abcd","ab");
        assertEquals(expected,"abcd");

    }
    @Test
    public void findlongestStringTest3(){

        String expected=   obj.findLongestString("ab","abc","abcd");
        assertEquals(expected,"abcd");

    }
}
