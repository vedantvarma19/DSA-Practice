import java.util.*;

class HashMap16 {
    public List<List<String>> groupStrings(String[] strings) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strings) {
            
            // Agar string length 1 hai
            if (str.length() == 1) {
                map.putIfAbsent("single", new ArrayList<>());
                map.get("single").add(str);
                continue;
            }
            
            StringBuilder key = new StringBuilder();
            
            for (int i = 1; i < str.length(); i++) {
                int diff = (str.charAt(i) - str.charAt(i - 1) + 26) % 26;
                key.append(diff).append(",");
            }
            
            String finalKey = key.toString();
            
            map.putIfAbsent(finalKey, new ArrayList<>());
            map.get(finalKey).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}