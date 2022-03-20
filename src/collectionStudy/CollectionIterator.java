package collectionStudy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("A","a",10));
        col.add(new Book("B","b",20));
        col.add(new Book("C","c",30));
        col.add(10);

        // System.out.println("col = " + col);
        // 现在遍历col集合
        // 1.先得到col对应的迭代器
        Iterator iterator = col.iterator();
        // 2.使用while循环遍历
        while (iterator.hasNext()){
            // 判断是否还有数据

            // 返回下一个元素，类型是object
            // 编译类型object,实际类型取决于Collection中的实际元素类型
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
        // while迭代器快捷键 itit
        // ctrl + j 显示所有生成代码快捷键
        // 3.当退出while循环时，这是iterator迭代器指向了最后的元素
        // iterator.next();//NoSuchElementException
        // 4.如果希望再次遍历，需要重置我们的迭代器
         iterator = col.iterator();
        System.out.println("======第二次遍历====");
        while (iterator.hasNext()){
            // 判断是否还有数据

            // 返回下一个元素，类型是object
            // 编译类型object,实际类型取决于Collection中的实际元素类型
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}