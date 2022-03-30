package collectionStudy.listStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    public static void main(String[] args) {

        // List 接口的实现子类 Vector LinkedList ArrayList
        List list = new ArrayList();
        // list = new Vector();
        // list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //遍历
        // 1.迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }

        // 2.增强for
        for (Object obj: list) {
            System.out.println(obj);
        }

        // 3.传统for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
