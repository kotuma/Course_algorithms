package Lesson3;

public class Programm {
    public static void main(String[] args) {
        MyArrayStack<Character> stack = new MyArrayStack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peak());
        System.out.println(stack.pop());
        System.out.println(stack.peak());
        System.out.println(stack.toString());
    }
}
