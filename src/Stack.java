import java.util.ArrayList;

public class Stack {

    private ArrayList<Object> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public Object peek() {
        if (!isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    public Object pop() {
        if (!isEmpty()) {
            return list.remove(0);
        }
        return null;
    }

    public Object push(Object item) {
        list.add(0, item);
        return item;
    }

    public int search(Object o) {
        int index = list.indexOf(o);
        if (index != -1) {
            return index + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(4);
        stack.push(6);
        stack.push(8);

        for (int i = 0; i < stack.list.size(); i++) {
            System.out.println(stack.list.get(i));
        }
        System.out.println("");
        System.out.println(stack.pop());
        System.out.println("");

        for (int i = 0; i < stack.list.size(); i++) {
            System.out.println(stack.list.get(i));
        }
        System.out.println("");
        System.out.println(stack.search(6));
        System.out.println(stack.search(4));

    }
}
