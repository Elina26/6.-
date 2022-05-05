import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    /*2. Напишите метода класса ListDemo, который получает на вход список объектов типа Human
и еще один объект типа Human. Результат — список однофамильцев заданного человека
среди людей из входного списка.*/
    public ArrayList namesakes(ArrayList<Human> humans, Human human) {
        ArrayList res = new ArrayList();

        for (int i=0; i<humans.size(); i++) {
            if (humans.get(i).getSurname().equals(human.getSurname())) {
                res.add(humans.get(i));
            }
        }
        return res;
    }


    /*5. Напишите метод класса ListDemo, который получает на вход список, состоящий из
объектов типа Human и его производных классов. Результат — множество людей из
входного списка с максимальным возрастом.*/
    public List<Human> maxAge(List<Human> humans) {
        int max=0;
        ArrayList<Human> maxAgeHumans = new ArrayList<>();

        for (int i=0; i< humans.size(); i++) {
            if (humans.get(i).getAge()>max) {
                maxAgeHumans.clear();
                max=humans.get(i).getAge();
                maxAgeHumans.add(humans.get(i));
            } else if (humans.get(i).getAge()==max) {
                maxAgeHumans.add(humans.get(i));
            }
        }
        return maxAgeHumans;
    }
}
