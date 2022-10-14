import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTests{

    @Test
    public void mergeTest(){
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list1.add("brownies");
        list1.add("cakes");
        list1.add("cookies");
        list2.add("broccoli");
        list2.add("carrots");
        list2.add("spinach");
        List<String> list3 = ListExamples.merge(list1, list2);
        String[] expected = {"broccoli", "brownies","cakes","carrots","cookies","spinach"};
        assertArrayEquals(expected, list3.toArray());
    }

    @Test
    public void filterTest(){
        PluralChecker pc = new PluralChecker();
        List<String> starter = new ArrayList<String>();
        starter.add("brownies");
        starter.add("cookie");
        starter.add("cakes");
        starter.add("chocolates");
        starter.add("pie");
        List<String> ender = ListExamples.filter(starter,pc);
        String[] expected = {"brownies", "cakes", "chocolates"};
        assertArrayEquals(expected, ender.toArray());
    }
}