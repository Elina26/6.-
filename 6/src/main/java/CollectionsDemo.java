//import java.lang.reflect.Array;

import java.util.*;
//import java.util.Set;

public class CollectionsDemo {

    /*1. Вход: список строк и символ. Выход: количество строк входного списка, у которых первый
символ совпадает с заданным.*/
    public int firstSymbol(List<String> arrayList, char c) {
        int res = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).charAt(0) == c) {
                res++;
            }
        }
        return res;
    }


    /*3. Вход: список объектов типа Human и еще один объект типа Human. Выход — копия
входного списка, не содержащая выделенного человека. При изменении элементов
входного списка элементы выходного изменяться не должны.*/
    public List<Human> copy(List<Human> arrayList, Human human) {
        ArrayList<Human> arrayListRes = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).equals(human)) {
                arrayListRes.add(new Human(arrayList.get(i)));
            }
        }
        return arrayListRes;
    }


    /*4. Вход: список множеств целых чисел и еще одно множество. Выход: список всех множеств
входного списка, которые не пересекаются с заданным множеством.*/
    public List<Set<Integer>> intersections(List<Set<Integer>> setsOfIntegers, Set<Integer> set) {
        ArrayList<Set<Integer>> arrayListRes = new ArrayList<>();
        Set<Integer> intersection;

        for (int i = 0; i < setsOfIntegers.size(); i++) {  //цикл по множествам в списке
                                                           //System.out.println("i = "+i);
            intersection = new HashSet<>(setsOfIntegers.get(i));
            intersection.retainAll(set);
                                                           //System.out.println("intersection = "+intersection);
            if (intersection.size()==0) {
                                                           //System.out.println("setsOfIntegers.get["+i+"] = "+setsOfIntegers.get(i));
                                                           //System.out.println("intersection = "+intersection+"\n");
                arrayListRes.add(setsOfIntegers.get(i));
            }
        }
        return arrayListRes;
    }


    /*7. Имеется набор людей, каждому человеку задан уникальный целочисленный
идентификатор. Напишите метод, который получает на вход отображение (Map)
целочисленных идентификаторов в объекты типа Human и множество целых чисел.
Результат — множество людей, идентификаторы которых содержатся во входном
множестве.*/
    public List<Human> method_7(Map<Integer, Human> map, Set<Integer> arr) {
        List<Human> arrayList = new ArrayList<>();

        for (int keys : map.keySet()) {
                if (arr.contains(keys)) {
                    arrayList.add(map.get(keys));
                }
        }
        return arrayList;
    }


    /*8. Для отображения из задачи 7 постройте список идентификаторов людей, чей возраст не
менее 18 лет. */
    public List<Integer> method_8(Map<Integer, Human> map) {
        List<Integer> arrayList = new ArrayList<>();

        for (int keys : map.keySet()) {
            if (map.get(keys).getAge() >= 18) { //если Integer ключ объекта >= 18
                arrayList.add(keys);
            }
        }

        return arrayList;
    }


    /*9. Для отображения из задачи 7 постройте новое отображение, которое идентификатору
сопоставляет возраст человека.*/
    public Map<Integer, Integer> method_9(Map<Integer, Human> map) {
        Map<Integer, Integer> res = new HashMap<>();

        for (Map.Entry<Integer, Human> keys : map.entrySet()) {
            res.put(keys.getKey(), keys.getValue().getAge());
        }

        return res;
    }


    /*10. По множеству объектов типа Human постройте отображение, которое целому числу
(возраст человека) сопоставляет список всех людей данного возраста из входного
множества.*/
    public Map<Integer, List<Human>> method_10(List<Human> humans) {
        Map<Integer, List<Human>> res = new HashMap<>();

        for (Human human : humans) {

            if (!res.containsKey(human.getAge())) {
                res.put(human.getAge(), new ArrayList<>());
            }

            res.get(human.getAge()).add(human);
        }

        return res;
    }
}
