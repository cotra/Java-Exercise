package pw.mr03.cotra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void test() {
        List<String> list = Arrays.asList("a", "b2", "c", "d23", "", "ts", "", "f15", "");

        long count = list.stream().filter(str -> str.isEmpty()).count();
        System.out.println(count);

        long count1 = list.stream().filter(str -> str.length() == 2).count();
        System.out.println(count1);

        List<String> stringList = list.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println(stringList.size());
    }
}
