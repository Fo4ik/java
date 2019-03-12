package cl9.homework;

public class Main {

    public static void main(String[] args) {

        System.out.println("TreeMap");
        System.out.println("=======================================");
        System.out.println();

        MyTreeMap<Integer, String> myTree = new MyTreeMap<>();

        myTree.put(5, "Alex");
        myTree.put(8, "Ben");
        myTree.put(2, "Carl");
        myTree.put(12, "Nancy");
        myTree.put(1, "Kate");
        myTree.put(14, "Mike");

        System.out.println("Size: " + myTree.size());
        System.out.println();
        System.out.println(myTree);
        System.out.println();

        System.out.println("Get value by key 12: " + myTree.get(12));
        System.out.println();

        System.out.println("Contains key 14? " + myTree.containsKey(14));
        System.out.println("Contains key 144? " + myTree.containsKey(144));
        System.out.println();

        System.out.println("Contains value Ben? " + myTree.containsValue("Ben"));
        System.out.println("Contains value Jul? " + myTree.containsValue("Jul"));
        System.out.println();

        System.out.println("Remove key 8!");
        myTree.remove(8);
        System.out.println(myTree);
        System.out.println();

        System.out.println("Clear!");
        myTree.clear();
        System.out.println("Size: " + myTree.size());
        System.out.println();


        // TreeSet
        System.out.println();
        System.out.println("TreeSet");
        System.out.println("=======================================");
        System.out.println();

        MyTreeSet<Integer> myTreeSet = new MyTreeSet<>();

        myTreeSet.add(10);
        myTreeSet.add(20);
        myTreeSet.add(30);
        myTreeSet.add(40);
        myTreeSet.add(50);
        myTreeSet.add(60);

        System.out.println("Size: " + myTreeSet.size());
        System.out.println(myTreeSet);
        System.out.println();

        System.out.println("Contains 20? " + myTreeSet.contains(20));
        System.out.println("Contains 70? " + myTreeSet.contains(70));
        System.out.println();

        System.out.println("Remove 30");
        myTreeSet.remove(30);
        System.out.println(myTreeSet);
        System.out.println();

        System.out.println("Is empty? " + myTreeSet.isEmpty());
        System.out.println("Clear!");
        myTreeSet.clear();
        System.out.println("Is empty? " + myTreeSet.isEmpty());
        System.out.println("Size: " + myTreeSet.size());
    }
}
