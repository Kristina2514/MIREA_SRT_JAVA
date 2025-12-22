package lab28;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    private Map<String, String> map = new HashMap<>();

    public Map<String, String> createMap() {
        map.put("Петров", "Иван");
        map.put("Сидоров", "Алексей");
        map.put("Иванова", "Мария");
        map.put("Смирнова", "Екатерина");
        map.put("Кузнецов", "Алексей");
        map.put("Васильев", "Дмитрий");
        map.put("Соколова", "Ольга");
        map.put("Попова", "Мария");
        map.put("Лебедев", "Сергей");
        map.put("Новикова", "Анна");
        return map;
    }

    public int getSameFirstNameCount() {
        Map<String, Integer> nameCount = new HashMap<>();

        for (String name : map.values()) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        int count = 0;
        for (int frequency : nameCount.values()) {
            if (frequency > 1) {
                count += frequency;
            }
        }
        return count;
    }

    public int getSameLastNameCount() {
        Map<String, Integer> lastNameCount = new HashMap<>();

        for (String lastName : map.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }

        int count = 0;
        for (int frequency : lastNameCount.values()) {
            if (frequency > 1) {
                count += frequency;
            }
        }
        return count;
    }
}
