import java.util.Stack;

public class Runner_exm3 {
    public static void main(String[] args) {
        //Коллекция Stack работает согласно алгоритму LIFO
        //LIFO - last in first out
        Stack<String> stack1 = new Stack<>();

        //Добавление элементов в коллекцию
        stack1.push("Java");
        stack1.push("IT");
        stack1.push("CLASS");

        System.out.println(stack1);

        //Получение элементов коллекции
        //Метод pop() возвращает последний элемент коллекции
        //и удалет его из этой коллекции
        String value = stack1.pop();
        System.out.println("value:" + value);
        System.out.println(stack1);

        //Метод peek() возвращает последний элемент коллекции
        //и НЕ удалет его из этой коллекции
        value = stack1.peek();
        System.out.println("value:" + value);
        System.out.println(stack1);

        value = stack1.peek();
        System.out.println("value:" + value);
        System.out.println(stack1);

        value = stack1.peek();
        System.out.println("value:" + value);
        System.out.println(stack1);
    }
}
