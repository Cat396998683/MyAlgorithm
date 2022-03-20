package collectionStudy;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        // 未使用泛型
        List list = new ArrayList();
        // add :添加元素 add(object)
        list.add("java");
        list.add(10); // list.add(new Integer(10)) 自动装箱
        list.add(true);
        System.out.println("List = " + list);
        // remove: 删除指定元素
        // boolean remove(Object o) or Object remove(int index)
        list.remove(0);
        list.remove("java");
        System.out.println(list);
        // contains 查找元素是否存在
        System.out.println(list.contains("java"));
        // size 获取元素个数
        System.out.println(list.size());
        // isEmpty
        // clear 清空元素
        list.clear();
        // addAll 添加多个元素
        // boolean addAll(Collection c) 只要是实现了Collection接口的类的对象都可以
        ArrayList list2 = new ArrayList();
        list2.add("a");
        list2.add("b");
        list.addAll(list2);
        System.out.println("list = " + list);
        // containsAll 查找多个元素是否都存在
        System.out.println(list.containsAll(list2));
        // removeAll
        // boolean removeAll(Collection c)
        list.add("c");
        list.removeAll(list2);
        System.out.println("list = " + list);


    }
}
