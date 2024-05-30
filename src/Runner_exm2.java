import java.util.Vector;

public class Runner_exm2 {
    public static void main(String[] args) {
        Vector<String> vector1 = new Vector<>();

        //Добавление элементов в коллекцию
        vector1.add("Java");
        vector1.add("IT");
        vector1.add("CLASS");
        //Метод addElement() аналогичен по своей реализации
        //методу add() с той лишь разничей, что
        //addElement объявлен как void
        vector1.addElement("Course");

        System.out.println(vector1);

        //Получение элементов коллекции
        String value = vector1.get(1);
        System.out.println("value:" + value);

        //Удаление элементов коллекции по индексу
        value = vector1.remove(0);
        System.out.println("value:" + value);

        //Удалание по объекту
        value = "Course";
        boolean isRemove = vector1.remove(value);
        System.out.println("isRemove:" + isRemove);

    }
}
