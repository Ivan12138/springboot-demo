package PracticeJava;


import java.util.HashMap;
import java.util.Map;

public class Traverse {
    public static void main(String[] args) {
        int[] list = {1,2,3,4};
        forList(list);

    }

    public static void forList(int[] list){
        System.out.println("for sout /n");
        for(int i = 0;i<=4;i++){
            System.out.println(list[i]+"/t");
        }
    }
    public static void foreachList(int[] list){
        System.out.println("for each /t");
        for (int i:list) {
            System.out.println(i);
        }
    }

    Map<String,Integer> items = new HashMap<>();
    items.put("A",21);
    Map.Entry<String,Integer> entry:Map.Entry

    public Map<String, Integer> getItems() {
        return items;
    }
}
