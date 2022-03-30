package collectionStudy.listStudy;

import java.util.ArrayList;
import java.util.List;

public class List_basic {
    public static void main(String[] args) {
        // 1. List集合类中元素有序(添加顺序与取出顺序一致)。且可以重复。
        List list = new ArrayList();
        list.add("Jack");
        list.add("Tom");
        list.add("a");
        list.add("a");
        System.out.println("list = " + list);
        // 2. List 集合中的每个元素都有其对应的顺序索引，即支持索引
        // 索引都是从0开始的


    }
}
