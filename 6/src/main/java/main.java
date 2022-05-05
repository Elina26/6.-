import java.util.*;
import java.util.concurrent.Callable;

public class main {
    public static void main(String[] args) {
        /*Set<Integer> Set1 = new HashSet<>();
        Set1.add(2);
        Set1.add(7);
        Set1.add(1);
        System.out.println("Set1: " + Set1);
        List list = Arrays.asList(1, 7, 6, 8);
        Set<Integer> Set2 = new HashSet<>(list);
        System.out.println("Set2: " + Set2);
        Set<Integer> intersection = new HashSet<>(Set1);
        intersection.retainAll(Set2);
        System.out.println("Intersection: " + intersection);
        System.out.println("Intersection's size: " + intersection.size());
        System.out.println("Set1: " + Set1);
        System.out.println("Set2: " + Set2);*/


        CollectionsDemo collectionsDemo = new CollectionsDemo();
        List<Set<Integer>> arrayList = new ArrayList<>();

        Set<Integer> arr1 = new HashSet<>();
        arr1.add(1);

        Set<Integer> arr2 = new HashSet<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);

        Set<Integer> arr3 = new HashSet<>();
        arr3.add(3);
        arr3.add(4);
        arr3.add(5);
        arr3.add(6);
        arr3.add(7);

        arrayList.add(arr1);
        arrayList.add(arr2);
        arrayList.add(arr3);


        Set<Integer> arr = new HashSet<>();
        arr.add(6);
        arr.add(7);

        List<Set<Integer>> res = collectionsDemo.intersections(arrayList, arr);

        //Set<Integer> intersection = new HashSet<>(arr3);
        //intersection.retainAll(arr);
        //System.out.println("Intersection: " + intersection);

        //System.out.println(res.get(0).toString());

        /*CollectionsDemo collectionsDemo = new CollectionsDemo();
        List<Set<Integer>> arrayList = new ArrayList<>();

        Set<Integer> arr1 = new HashSet<>();
        arr1.add(1);

        Set<Integer> arr2 = new HashSet<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);

        Set<Integer> arr3 = new HashSet<>();
        arr3.add(3);
        arr3.add(4);
        arr3.add(5);

        arrayList.add(arr1);
        arrayList.add(arr2);
        arrayList.add(arr3);

        Set<Integer> arr = new HashSet<>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        List<Set<Integer>> res = collectionsDemo.intersections(arrayList, arr);
        //System.out.println(arrayList.get(1).toString());
        System.out.println(res.get(2).toString());*/
    }
}
