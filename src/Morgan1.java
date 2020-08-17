import java.util.*;

/*
 * Complete the 'segment' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER x
 *

 */
public class Morgan1 {
    public static void main(String[] args) {
        System.out.println(segment(1, Arrays.asList(1, 2, 3, 1, 2)));
        System.out.println(segment(2, Arrays.asList(1, 1, 1)));
        System.out.println(segment(3, Arrays.asList(2, 5, 4, 6, 8)));
    }

    public static int segment(int x, List<Integer> space) {
        int end = space.size();
        int start = 0;
        List<List<Integer>> subList = new ArrayList<>();
        if (x == 1) {
            return space.get(end / 2);
        }
        subList = formSubList(space, x, start, end, subList, x);
        Set<Integer> tempList = new HashSet<>();
        for (List<Integer> list : subList) {
            int val = list.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);
            tempList.add(val);
        }
        return tempList.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
    }

    private static List<List<Integer>> formSubList(List<Integer> space, int x, int start, int end, List<List<Integer>> subList, int tempSegSize) {
        while (x != 0) {
            List temList = new ArrayList();
            for (int i = start; i < end; i++) {
                if (temList.size() < tempSegSize) {
                    temList.add(space.get(i));
                }
            }
            subList.add(temList);
            x--;
            return formSubList(space, x, start + 1, space.size(), subList, tempSegSize);
        }
        return subList;

    }
}
