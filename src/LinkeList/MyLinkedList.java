package LinkeList;

import java.net.HttpRetryException;

/**
 * 使用链表实现一个线性表: 首先应该是个数据容器
 *
 *
 * 实现一个集合类 : 实现一个数据容器
 * 代表数据结构: 线性表  -> 可以根据下标操作
 * 底层实现结构: 链表: 先用单链表
 *
 */
public class MyLinkedList {

    private Node  head; // 底层链表的头结点
    private int size; //  记录这个容器中存储的元素个数


    /**
     *  添加方法
     * @param str: 要添加的内容
     * @return : 添加是否成功
     */
    public boolean  add(String str){
        // 添加元素位置 默认添加到链表尾
        // 如果链表为空 ，直接 head = new Node(str,null)
        if(isEmpty()){
            head = new Node(str,null);
            // 表长加1
            size++;
            return true;
        }
        // 说明链表不空
        // travel节点遍历链表到表尾，直到travel.next = null
        Node travel = head;
        while (travel.next != null){
            travel = travel.next;
        }
        // 新节点的next 指向 表尾的next，即null
        // 表尾的next 指向 新节点
        travel.next = new Node(str,travel.next);
        size++;
        return true;
    }

    /**
     * 删除方法
     * 若存在重复元素 只删除第一个目标元素
     * @param str: 要删除的内容
     * @return : 删除是否成功
     */
    public boolean remove(String str){
        // 分情况判断
        // 链表为空 无法删除
        if(isEmpty()){
            throw new RuntimeException("LinkedList is Empty");
        }

        // 考虑str是否为Null、、

        // 链表不为空 删除位置 分为 表头 表中 表尾
        // 删除表头 直接 head = head.next; size--; 即使只有一个元素也可以，size = 0 head = null



        // 删除表中 表尾
        // 找到删除元素的前一个元素travel,travel.next.value = str;
        // travel.next = travel.next.next;
        Node travel = head;

        // travel.next.value = str;
        // str != null str.equals(travel.next.value)
        // str == null str == travel.next.value
        if(str == null){

            if(size ==1 && str == head.value){
                head = head.next;
                size--;
                return true;
            }


            while (str != travel.next.value && travel.next != null){
                travel = travel.next;
            }
            // 没有目标元素
            if(travel.next == null){
                return false;
            }
            travel.next = travel.next.next;
            size--;
            return true;
        }

        if(size ==1 && str.equals(head.value)){
            head = head.next;
            size--;
            return true;
        }

        while (!str.equals(travel.next.value) && travel.next != null){
            travel = travel.next;
        }
        // 没有目标元素
        if(travel.next == null){
            return false;
        }
        travel.next = travel.next.next;
        size--;
        return true;

    }

    /**
     * 查找有个数据在这个容器中是否存在
     * @param str : 要查找的内容
     * @return : 是否存在
     */
    public boolean contains(String str){
        // 为空查找一定失败
        if(isEmpty()){
            return false;
        }

        Node travel = head;

        // 判断str 是否为null
        if(str == null){
            // 遍历比较
            while (travel != null){
                if(travel.value == str){
                    return true;
                }
                travel = travel.next;
            }
            // 查找失败
            return false;
        }
        // 遍历比较
        while (travel != null){
            if(str.equals(travel.value)){
                return true;
            }
            travel = travel.next;
        }
        // 查找失败
        return false;
    }
    /**
     * 根据内容的修改方法
     * @param oldValue: 被修改的值
     * @param newValue : 新值
     * @return: 修改是否成功
     */
    public boolean set(String oldValue, String newValue){
        // 为空 失败
        if(isEmpty()){
            return false;
        }
        // 在查找元素的逻辑上 加一句 travel.value = new Value
        Node travel = head;

        // 判断str 是否为null
        if(oldValue == null){
            // 遍历比较
            while (travel != null){
                if(travel.value == oldValue){
                    travel.value = newValue;
                    return true;
                }
                travel = travel.next;
            }
            // 查找失败
            return false;
        }
        // 遍历比较
        while (travel != null){
            if(oldValue.equals(travel.value)){
                travel.value = newValue;
                return true;
            }
            travel = travel.next;
        }
        // 查找失败
        return false;

    }



// 作为线性表, 应该还具有根据下标的增删改查
//        list.add("zs");
//        list.remove("ls");
//        list.contains("ls");
//        list.set("zs", "ls");

    /**
     * 根据下标的添加方法
     * @param index: 要添加的下标位置
     * @param str: 要添加的内容
     * @return: 添加是否成功
     */
    public boolean add(int index, String str){
        // index的正确范围 0(表头) ~ size(表尾)
        if(index < 0 || index > size){
            // 范围越界
            throw new RuntimeException("Index越界");
        }

        // index=0 或 链表为空
        if(index==0){
            head = new Node(str,head);
            size++;
            return true;
        }
        // 链表不为空
        // 遍历找到下标为index-1个元素travel
        // travel.next = new Node(str,travel.next);
        Node travel = head;
        for (int i = 1; i < index; i++) {
            // 移动了index - 1次
            travel = travel.next;
        }
        travel.next = new Node(str,travel.next);
        size++;
        return true;
    }


    /**
     * 根据下标的删除方法
     * @param index: 要删除的下标位置
     * @return: 被删除的元素
     */
    public String remove(int index){
        // 删除范围0~size-1
        if(index < 0 || index > size -1){
            throw new RuntimeException("Index越界");
        }

        //删除节点的元素值
        String res = "";
        if(isEmpty()){
            // 为空
            throw new RuntimeException("LinkedList is Empty");
        }

        // 删除表头
        if(index == 0){
            res = head.value;
            head = head.next;
            size--;
            return res;
        }
        Node travel = head;
        // 找到删除元素的前一个元素travel(下标index -1)
        // travel.next = travel.next.next;
        int tag = 1;
        while (tag < index){
            // 移动了index-1次
            travel = travel.next;
            tag++;
        }
        res = travel.next.value;
        travel.next = travel.next.next;
        size--;
        return res;
    }

    /**
     * 根据下标的查找
     * @param index: 要查找的下标
     * @return: 该下标对应的内容
     */
    public String get(int index){
        Node travel = head;
        for (int i = 0; i < index; i++) {
            // 向后移动index步
            travel  = travel.next;
        }
        String res = travel.value;
        return res;
    }

    /**
     * 根据下标的修改方法
     * @param index: 要修改变的下标位置
     * @param newValue: 新值
     * @return: 被替换的旧值
     */
    public String set(int index, String newValue){
        Node travel = head;
        for (int i = 0; i < index; i++) {
            // 向后移动index步
            travel  = travel.next;
        }
        String res = travel.value;
        travel.value = newValue;
        return res;
    }


    // 判断这个容器是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }

    class Node{
        String value;// 值域
        Node next; // 指针域

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
