public class HashMap21 {

    // Leetcode : 288 "Unique word abbrivation (premium) problem on leetcode , solved using hashset and hashmap concept "

    private Map<String, Set<String>> map;

    public HashMap21(String[] dictonary) {
        map = new HashMap<>();

        for (String word : dictonary) {
            String abbr = getabbr(word);
            map.putIfAbsent(abbr, new HashSet<>());
            map.get(abbr).add(word);
        }
    }

    private String getabbr(String word) {
        int n = word.length();

        if (n <= 2) {
            return word;
        }
        return "" + word.charAt(0) + (n - 2) + word.charAt(n - 1);
    }

    public boolean isUnique(String word) {
        String abbr = getabbr(word);

        if (!map.containsKey(abbr)) {
            return true;
        }

        Set<Integer> set = map.get(abbr);

        return set.size() == 1 && set.contains(word);

    }
}
