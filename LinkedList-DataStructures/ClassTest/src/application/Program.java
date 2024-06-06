package application;

import entities.Dnode;
import entities.DoubleLinkedList;
import entities.Node;
import entities.SimpleLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {


        Node n1 = new Node("Joao");

        Node n2 = new Node("Jerry");
        Node n3 = new Node("Pedro");
        Node n4 = new Node("Paulo");
        Node n5 = new Node("Tito");

        Dnode nv1 = new Dnode("Joao", null, null);
        Dnode nv2 = new Dnode("Mikey", null, null);
        Dnode nv3 = new Dnode("Draken", null, null);
        Dnode nv4 = new Dnode("Junior", null, null);
        Dnode nv5 = new Dnode("Felipe", null, null);


        DoubleLinkedList list2 = new DoubleLinkedList();

        list2.addFirst(nv1);
        list2.addFirst(nv2);
        System.out.println(list2);

        list2.addLast(nv3);
        System.out.println(list2);

        list2.insertAfter(nv1, nv5);
        System.out.println(list2);


        ArrayList<String> lee = new ArrayList<>();
        lee.add("joao");
        System.out.println(lee.size());
        System.out.println("9999999999999999999");




        SimpleLinkedList list = new SimpleLinkedList();

        list.addFirst(n1);
        list.addFirst(n2);
        System.out.println(list.getSize());
        System.out.println(list);

        list.addLast(n3);
        System.out.println(list);
        list.insertAfter(n1, n4);
        System.out.println(list);
        System.out.println(list.getSize());
       list.removeLast();
        System.out.println(list);
        System.out.println(list.getSize());





    }
}
