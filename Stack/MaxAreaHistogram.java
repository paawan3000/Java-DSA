import java.util.*;
public class MaxAreaHistogram {

    public static int getMaxArea(int hist[])

    {

        int maxArea = 0;
        int lsr[] = new int[hist.length];
        int lsl[] = new int[hist.length];

        Stack<Integer> s = new Stack<>();
        // Right minimum

        for (int i = hist.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && hist[s.peek()] >= hist[i]) {
                s.pop();

            }
            if (s.isEmpty()) {
                lsr[i] = hist.length;
            } else {
                lsr[i] = s.peek();
            }
                s.push(i);
        }

        // Left minimum
        s = new Stack<>();
        for (int i = 0; i < hist.length; i++) {

            while (!s.isEmpty() && hist[s.peek()] >=  hist[i]) {
                s.pop();

            }
            if (s.isEmpty()) {
                lsl[i] = -1;
            } else {
                lsl[i] = s.peek();
            }

            s.push(i);
        }

        // Area of histogram

        for (int i = 0; i < hist.length; i++) {
            int height = hist[i];
            int widht = lsr[i] - lsl[i] - 1;
            int currArea = height * widht;

            maxArea = Math.max(currArea , maxArea);

        }

            return maxArea;
    }

    public static void main(String[] args) {
        int hist[] = { 2, 1, 5, 6, 2, 3};

        // getMaxArea(hist);

        System.out.println(getMaxArea(hist));
    }
}
