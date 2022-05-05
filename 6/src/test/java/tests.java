import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class tests {

    @Test
    public void firstSymbolTest() {
        CollectionsDemo collectionsDemo = new CollectionsDemo();
        String str1 = "02345";
        String str2 = "123";
        String str3 = "523";
        String str4 = "1223";
        ArrayList<String> arrayList = new ArrayList<String>(2);
        arrayList.add(str1);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add(str4);
        assertEquals(collectionsDemo.firstSymbol(arrayList, '1'), 2);
    }

    @Test
    public void ListDemoTest() {
        ListDemo listDemo = new ListDemo();
        Human human1 = new Human("Бобров", "Клим", "Федосеевич", 49);
        Human human2 = new Human("Данилов", "Модест", "Константинович", 31);
        Human human3 = new Human("Михайлов", "Герасим", "Григорьевич", 24);
        Human human4 = new Human("Бобров", "Игорь", "Данилович", 60);

        Human human = new Human("Бобров", "Василий", "Степанович", 45);

        ArrayList arrayList = new ArrayList();
        arrayList.add(human1);
        arrayList.add(human2);
        arrayList.add(human3);
        arrayList.add(human4);

        ArrayList arrayListExpected1 = new ArrayList();
        arrayListExpected1.add(human1);
        arrayListExpected1.add(human4);

        ArrayList arrayListExpected2 = new ArrayList();
        arrayListExpected2.add(human1);
        arrayListExpected2.add(human2);

        ArrayList arrayListRes = listDemo.namesakes(arrayList, human);

        assertEquals(arrayListRes, arrayListExpected1);
        assertNotEquals(arrayListRes, arrayListExpected2);
    }

    @Test //проверяем, что копия списка не содержит выбранного человека
    public void copyTest1() {
        CollectionsDemo collectionsDemo = new CollectionsDemo();
        Human human1 = new Human("Бобров", "Клим", "Федосеевич", 49);
        Human human2 = new Human("Данилов", "Модест", "Константинович", 31);
        Human human3 = new Human("Михайлов", "Герасим", "Григорьевич", 24);
        Human human4 = new Human("Бобров", "Игорь", "Данилович", 60);

        List<Human> arrayList = new ArrayList<>();
        arrayList.add(human1);
        arrayList.add(human2);
        arrayList.add(human3);
        arrayList.add(human4);

        List<Human> arrayList1 = collectionsDemo.copy(arrayList, human4);
        assertEquals(arrayList1.indexOf(human4), -1);
    }

    @Test //проверяем, что при изменении изначального списка копия не поменялась
    public void copyTest2() {
        CollectionsDemo collectionsDemo = new CollectionsDemo();
        Human human1 = new Human("Бобров", "Клим", "Федосеевич", 49);
        Human human2 = new Human("Данилов", "Модест", "Константинович", 31);
        Human human3 = new Human("Михайлов", "Герасим", "Григорьевич", 24);
        Human human4 = new Human("Бобров", "Игорь", "Данилович", 60);

        List<Human> arrayList = new ArrayList<>();
        arrayList.add(human1);
        arrayList.add(human2);
        arrayList.add(human3);
        arrayList.add(human4);

        //создали копию без human4
        List<Human> arrayList1 = collectionsDemo.copy(arrayList, human4);
        //удалили из оригинала human1
        arrayList.remove(human1);

        //в копии все еще должен быть human1 на месте [0]
        assertEquals(arrayList.indexOf(human1),-1);
        assertEquals(arrayList1.indexOf(human1),0);
    }

    @Test
    public void intersectionsTest1() {
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
        assertEquals(res.indexOf(arr1), 0);
        assertEquals(res.indexOf(arr2), 1);
        assertEquals(res.indexOf(arr3), -1);
    }

    @Test
    public void intersectionsTest2() {
        CollectionsDemo collectionsDemo = new CollectionsDemo();
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
        assertEquals(res.indexOf(arr1), 0);
        assertEquals(res.indexOf(arr2), 1);
        assertEquals(res.indexOf(arr3), -1);
    }

    @Test
    public void maxAgeTest() {
        List<Human> arrayList = new ArrayList<>();
        Human human1 = new Human("Бобров", "Клим", "Федосеевич", 60);
        Human human2 = new Human("Данилов", "Модест", "Константинович", 31);
        Student human3 = new Student("Михайлов", "Герасим", "Григорьевич",
                24, "Матфак");
        Human human4 = new Human("Бобров", "Игорь", "Данилович", 60);

        arrayList.add(human1);
        arrayList.add(human2);
        arrayList.add(human3);
        arrayList.add(human4);

        ListDemo listDemo = new ListDemo();
        assertEquals(listDemo.maxAge(arrayList).indexOf(human1),0);
        assertEquals(listDemo.maxAge(arrayList).indexOf(human2),-1);
        assertEquals(listDemo.maxAge(arrayList).indexOf(human3),-1);
        assertEquals(listDemo.maxAge(arrayList).indexOf(human4),1);
    }

    @Test
    public void method_7Test() {
        CollectionsDemo collectionsDemo = new CollectionsDemo();
        Map<Integer, Human> map = new HashMap<>();

        Human human1 = new Human("Бобров", "Клим", "Федосеевич", 49);
        Human human2 = new Human("Данилов", "Модест", "Константинович", 31);
        Human human3 = new Human("Михайлов", "Герасим", "Григорьевич", 24);
        Human human4 = new Human("Бобров", "Игорь", "Данилович", 60);

        map.put(1,human1);
        map.put(2,human2);
        map.put(3,human3);
        map.put(4,human4);

        Set<Integer> arr = new HashSet<>();
        arr.add(1);
        arr.add(3);

        collectionsDemo.method_7(map, arr);

        assertEquals(collectionsDemo.method_7(map, arr).indexOf(human1), 0);
        assertEquals(collectionsDemo.method_7(map, arr).indexOf(human2), -1);
        assertEquals(collectionsDemo.method_7(map, arr).indexOf(human3), 1);
        assertEquals(collectionsDemo.method_7(map, arr).indexOf(human4), -1);
    }

    @Test
    public void method_8Test() {
        CollectionsDemo collectionsDemo = new CollectionsDemo();
        Map<Integer, Human> map = new HashMap<>();

        Human human1 = new Human("Бобров", "Клим", "Федосеевич", 13);
        Human human2 = new Human("Данилов", "Модест", "Константинович", 31);
        Human human3 = new Human("Михайлов", "Герасим", "Григорьевич", 18);
        Human human4 = new Human("Бобров", "Игорь", "Данилович", 15);

        map.put(1,human1);
        map.put(2,human2);
        map.put(3,human3);
        map.put(4,human4);

        Integer i = 2;
        assertEquals(collectionsDemo.method_8(map).get(0), i);
        i = 3;
        assertEquals(collectionsDemo.method_8(map).get(1), i);
    }

    @Test
    public void method_9Test() {
        CollectionsDemo collectionsDemo = new CollectionsDemo();
        Map<Integer, Human> map = new HashMap<>();

        Human human1 = new Human("Бобров", "Клим", "Федосеевич", 13);
        Human human2 = new Human("Данилов", "Модест", "Константинович", 31);
        Human human3 = new Human("Михайлов", "Герасим", "Григорьевич", 30);
        Human human4 = new Human("Бобров", "Игорь", "Данилович", 15);

        map.put(1,human1);
        map.put(2,human2);
        map.put(3,human3);
        map.put(4,human4);

        Map<Integer, Integer> res = collectionsDemo.method_9(map);

        int expected = res.get(1);
        assertEquals(expected, 13);
        expected = res.get(2);
        assertEquals(expected, 31);
        expected = res.get(3);
        assertEquals(expected, 30);
        expected = res.get(4);
        assertEquals(expected, 15);
    }
    @Test
    public void method_10Test() {
        CollectionsDemo collectionsDemo = new CollectionsDemo();

        Human human1 = new Human("Первый", "Клим", "Федосеевич", 30);
        Human human2 = new Human("Второй", "Модест", "Константинович", 21);
        Human human3 = new Human("Третий", "Герасим", "Григорьевич", 30);
        Human human4 = new Human("Четвертый", "Игорь", "Данилович", 20);

        ArrayList<Human> arrayList = new ArrayList<>();
        arrayList.add(human1);
        arrayList.add(human2);
        arrayList.add(human3);
        arrayList.add(human4);

        Map<Integer, List<Human>> map = collectionsDemo.method_10(arrayList);

        /* map[0] = <20, {human4}>
        * map[1] = <21, {human2}>
        * map[2] = <30, {human1, human3}>
        */

        assertEquals(human4, map.get(20).get(0));
        assertEquals(human2, map.get(21).get(0));
        assertEquals(human1, map.get(30).get(0));
        assertEquals(human3, map.get(30).get(1));
    }
}
