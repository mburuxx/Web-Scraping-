import java.util.*;

public class SockPairing {    public static void main(String[] args) {
    int n = 4;
    int T = 1;
    int[] c = {2, 4, 6, 8};
    System.out.println(maxPairs(n, T, c));
}

public static int maxPairs(int n, int T, int[] c) {
    Arrays.sort(c);
    int i = 0;
    int j = 1;
    int pairs = 0;
    while (j < n) {
        if (Math.abs(c[i] - c[j]) <= T) {
            pairs++;
            i += 2;
            j += 2;
        } else {
            i++;
            j++;
        }
    }
    return pairs;
}
}