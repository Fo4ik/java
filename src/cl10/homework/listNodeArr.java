package cl10.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ListNodeArr {

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(3);

        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(2);


        System.out.println(listToString(list));
        System.out.println("=====================");
        list = deleteDoublicates(list);

        System.out.println(listToString(list));


    }

    private static ListNode deleteDoublicates(ListNode list) {
        Deque<ListNode> listNodeDeque = new ArrayDeque<>();
        if (list == null) {
            return null;
        } else {
            listNodeDeque.add(list);
        }
        while (list != null) {
            if (listNodeDeque.getLast().val != list.val) {
                listNodeDeque.getLast().next = list;
                listNodeDeque.add(list);
            }
            list = list.next;
        }
        listNodeDeque.getLast().next = null;

        return listNodeDeque.getFirst();
    }


    private static String listToString(ListNode list) {
        StringBuilder sb = new StringBuilder();

        while (list != null) {
            sb.append(list.val);
            sb.append("->");
            list = list.next;
        }

        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.toString();
    }


}