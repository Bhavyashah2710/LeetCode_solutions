class Solution {
    public int maxOperations(int[] b, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int v = 0;
        for (int n : b) {
            int d = k - n;
            if (m.getOrDefault(d, 0) > 0) {
                v++;
                m.put(d, m.get(d) - 1);
            } else {
                m.put(n, m.getOrDefault(n, 0) + 1);
            }
        }
        return v;
    }
}