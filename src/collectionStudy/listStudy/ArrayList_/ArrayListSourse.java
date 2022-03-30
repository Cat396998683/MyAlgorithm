package collectionStudy.listStudy.ArrayList_;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSourse {
    public static void main(String[] args) {
        ArrayList list2 = new ArrayList();
        ArrayList list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for (int i = 11; i < 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(null);

    }
}
