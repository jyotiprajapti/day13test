import org.example.FindMax;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FindMaxTest<T extends Comparable> {
    FindMax obj = new FindMax();
//    @Test
//    public void findMaxTest1(){
//
//     int expected=   obj.findMax(40,30,20);
//     assertEquals(expected,40);
//
//    }
//    @Test
//    public void findMaxTest2(){
//
//        int expected=   obj.findMax(30,40,20);
//        assertEquals(expected,40);
//
//    }
//    @Test
//    public void findMaxTest3(){
//
//        int expected=   obj.findMax(20,30,40);
//        assertEquals(expected,40);
//
//    }
//
//    @Test
//    public void findMaxFloatTest1(){
//
//        float expected=   obj.findMaxFloat(40.0f,30.0f,20.0f);
//        assertEquals(expected,40.0f);
//
//    }
//    @Test
//    public void findMaxFloatTest2(){
//
//        float expected=   obj.findMaxFloat(30.0f,40.0f,20.0f);
//        assertEquals(expected,40.0f);
//
//    }
//    @Test
//    public void findMaxFloatTest3(){
//
//        float expected=   obj.findMaxFloat(20.0f,40.0f,30.0f);
//        assertEquals(expected,40.0f);
//
//    }
//    @Test
//    public void findlongestStringTest1(){
//
//        String expected=   obj.findLongestString("abcd","ab","abc");
//        assertEquals(expected,"abcd");
//
//    }
//    @Test
//    public void findlongestStringTest2(){
//
//        String expected=   obj.findLongestString("abc","abcd","ab");
//        assertEquals(expected,"abcd");
//
//    }
//    @Test
//    public void findlongestStringTest3(){
//
//        String expected=   obj.findLongestString("ab","abc","abcd");
//        assertEquals(expected,"abcd");
//
//    }


    @Test
    public <T extends Comparable> void findMaxTestFloat(){
     ArrayList<Integer> list=   new ArrayList<>();
     list.add(20);
     list.add(40);
     list.add(25);
        Comparable expected=   obj.findMax(list);
     assertEquals(expected,40);
    }
    @Test
    public <T extends Comparable> void findMaxTest2(){
        ArrayList<Float> list=   new ArrayList<>();
        list.add(20.0f);
        list.add(40.0f);
        list.add(25.0f);
        Comparable expected=   obj.findMax(list);
        assertEquals(expected,40.0f);
    }
    @Test
    public <T extends Comparable> void findMaxTestString(){
        ArrayList<String> list=   new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("abcd");
        Comparable expected=   obj.findMax(list);
        assertEquals(expected,"abcd");
    }
}
