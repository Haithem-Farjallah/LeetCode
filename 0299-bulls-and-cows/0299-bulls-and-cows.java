class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0) + 1);
            }
        }
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s != g && map.getOrDefault(g, 0) > 0) {
                cows++;
                map.put(g, map.get(g) - 1);
            }
        }

        return bulls + "A" + cows + "B";
    }
}
