import java.util.ArrayList;

public class Runner_exm1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        //Метод add() добавляет элементы в конец коллекции
        list1.add("Java");
        list1.add("IT");
        list1.add("CLASS");
        list1.add(null);

        //Метод add() с двумя параметрами добавляет элемент
        //в середину коллекции, при этом этом элемент в данной позиции
        //и все элементы стоящее правее смещаются на одну позицую в право
        list1.add(1, "Collection");

        System.out.println(list1);
        //Метод size() возвращает количество добавленных элементов
        //в коллекцию
        System.out.println("size:" + list1.size());


        //Получение элементов коллекции
        String value1 = list1.get(1);
        System.out.println("value1:" + value1);

        //Удаление элементов из коллекции можно выполнять по
        //интексу или по ссылке данного элемента
        String value2 = list1.remove(3);
        System.out.println("value2:" + value2);


        //Т.к. после удаления элементов из коллекции
        //внутри сохранется null, то иногда целесообразно
        //изменить capacity данной коллекции
        list1.trimToSize();

        String value = "Collection";
        //При удалении объекта по объекту, важно
        //чтобы в классе, объекты которого хранятся в коллекции,
        //были реализованы методы equals() и hashCode()
        boolean isRemove = list1.remove(value);
        System.out.println("isRemove:" + isRemove);

        System.out.println(list1);

        //Метод indexOf() возвращает индекст первого найденного
        //элемента в коллекции
        int index = list1.indexOf("IT");
        System.out.println("index:" + index);

        //Метод contains() проверяет вхождение данного элемента в коллекцию
        boolean isContains = list1.contains("Java");
    }
}
