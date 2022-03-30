package LinkeList;

import javax.swing.text.StyledEditorKit;

public class MyDoubleLinkedList {
    private DoubleNode head; // 底层链表的头结点
    private int size; //  记录这个容器中存储的元素个数

    public boolean add(String str){
        return true;
    }
    public boolean remove(String str){
        return true;
    }
    public boolean contains(String str){
        return true;
    }
    public boolean set(String oldValue,String newValue){
        return true;
    }
    public boolean add(int index,String str){
        return true;
    }
    public String remove(int index){
        return "";
    }
    public String get(int index){
        return "";
    }
    public String set(int index,String newValue){
        return "";
    }

    // 判断这个容器是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }


}

class DoubleNode{
    String value;
    DoubleNode pre;
    Double next;
}