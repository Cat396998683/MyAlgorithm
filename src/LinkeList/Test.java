package LinkeList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        // add
        myLinkedList.add("a");
        // myLinkedList.add("das");
        myLinkedList.add("b");
        myLinkedList.add(null);
        myLinkedList.add("c");
       // myLinkedList.add("d");
        // myLinkedList.add(null);
        // remove
        // myLinkedList.remove(null);
        // myLinkedList.remove("das");
        // // contains
        // System.out.println(myLinkedList.contains(null));
        // System.out.println(myLinkedList.contains("b"));
        // // set
        // myLinkedList.set("c",null);
        // myLinkedList.set(null,"dass");
        // myLinkedList.add(0,"X");
        // myLinkedList.add(5,"Y");

       // System.out.println(myLinkedList.remove(0));
        //System.out.println(myLinkedList.remove(3));
        System.out.println(myLinkedList.set(2, "dasjkbdjkas"));
        System.out.println(myLinkedList.get(2));


        System.out.println();

    }
}
