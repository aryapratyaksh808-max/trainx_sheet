class Solution {

    public boolean checkPermutation(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        boolean[] visited = new boolean[b.length];

        for (int i = 0; i < a.length; i++) {

            boolean found = false;

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j] && !visited[j]) {
                    visited[j] = true;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}
public class EqualArray {
    public static void main(String[] args) {
        int[] a ={3, 2, 1};
        int[] b = {1, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.checkPermutation(a, b));
    }
}
