import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(3);
        q.add(1);
        q.add(2);
        q.add(1);
        boolean w = isPalindrome(q);
        System.out.println(w);
    }
    public static boolean isPalindrome(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int n = q.remove();
            q.add(n);
            s.push(n);
        }
        for (int i = 0; i < size; i++) {
            int n1 = q.remove();
            int n2 = s.pop();
            if (n1 != n2) {
                return false;
            }
            q.add(n1);
        }
        return true;
    }
}