import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 10, 20, 90, 3, 7, 8, 15, 17, 30, 40, 21));
        ArrayList<Integer> even = arrayList.stream().filter(i -> i % 2 == 0).sorted().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(even);

        ArrayList<Integer> odd = arrayList.stream().filter(i -> i % 2 == 1).sorted().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(odd);

        ArrayList<Integer> thrice = arrayList.stream().map(n -> n * 3).sorted().filter(i -> i > 100).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(thrice);

        arrayList.stream().map(n -> n * 2).sorted().filter(i -> i > 10).forEach(num -> System.out.print(num + ","));

    }
}
