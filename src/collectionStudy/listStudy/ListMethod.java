package collectionStudy.listStudy;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {

        // 使用ArrayList中的实现
        List list = new ArrayList();
        // void add(int index,Object ele)
        // 无idnex ,默认插入到末尾
        // 在index 位置插入一个元素 注意是插入，不是覆盖
        list.add("a");
        list.add("b");
        list.add(1,"d");
        System.out.println("list = " + list);
        List list2 = new ArrayList();
        list2.add("d");
        list2.add("e");
        // boolean addAll(int index,Collection eles)
        // 从Index位置将eles中所有元素插入
        list.addAll(1,list2);
        System.out.println("list = " + list);
        // Object get(int index) 获取Index位置的元素
        // int indexOf(Object obj): 返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("d"));
        // int lastIndexOf(Object obj): 返回obj在当前集合中最后出现的位置
        System.out.println(list.lastIndexOf("d"));
        // Object remove(int index): 移除指定index位置的元素，并返回此元素
        list.remove(0);
        System.out.println("list = " + list);
        // Object set(int index,Object ele): 设置指定index位置的元素为ele,相当于是替换，
        // Object get(int index)
        list.set(0,"a");
        System.out.println("list = " + list);
        // List subList(int fromIndex,int toIndex): 返回从fromIndex到toIndex位置的子集合
        // 前闭后开
        List result = list.subList(0,2);
        System.out.println("result = " + result);



    }
}
