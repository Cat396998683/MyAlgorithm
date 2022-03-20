package collectionStudy;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("A","a",10));
        col.add(new Book("B","b",20));
        col.add(new Book("C","c",30));
        col.add(10);

        // 1.使用增强for，在Collection集合
        // 2.增强for,底层仍然是迭代器
        // 3.增强for可以理解为简化版本的 迭代器遍历
        for (Object o: col) { // force step into 跳入Iterator中
            System.out.println("object = " + o);
        }
        // 增强for,也可以直接在数组使用 略


    }
}
