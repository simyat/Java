package JavaBasic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_18 {
    public static void main(String[] args) {
        String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "Z", "D" };
        HashMap map = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                int value = (int) map.get(data[i]);
                map.put(data[i], value + 1); // 기존에 있는 키는 기존 값에 1을 더해서 저장
            } else {
                map.put(data[i], 1);
            }
        }
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = (int) entry.getValue(); // value 가져오기
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }

    }// main

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];
        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        }
        return new String(bar);
    }
}
