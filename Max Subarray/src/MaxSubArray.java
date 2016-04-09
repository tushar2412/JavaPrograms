import java.util.Arrays;

public class MaxSubArray {

    private static class PairHolder<T> {
        int start = -1;
        int end = -1;
        int weight = -1;
        PairHolder(int start, int end) {
            this.start = start;
            this.end = end;
            this.weight = start == -1 ? -1 : end-start+1;
        }

        String getSubArray(T[] arr) {
            return Arrays.toString(Arrays.copyOfRange(arr, start, end+1));
        }

        @Override
        public String toString() {
            return "[" + start + ", " + end + ", weight: " + weight + "]";
        }
    }

    public static <T extends Comparable<? super T>> void getContiguousChain(T[] chain) {
        int start = -1, end = -1;
        PairHolder<T> longest = new PairHolder<T>(-1, -1);
        for (int i = 0; i < chain.length - 1; i++) {
            if (start == -1) {
                start = i;
                end = i;
            }

            if (chain[i+1].compareTo(chain[i]) == -1 || chain[i+1].compareTo(chain[i]) == 0) {
                if (end-start+1 > longest.weight) {
                    longest = new PairHolder<T>(start, end);
                }

                start = -1; end = -1;
                continue;
            }

            end = i+1;
        }

        if (end-start+1 > longest.weight) { //corner case where last element of chain is also end of array
            longest = new PairHolder<T>(start, end);
        }

        System.out.println(longest.getSubArray(chain));
    }

    public static void main(String[] args) {
        Integer[] arr = {2, 3, 3, 4, 5, 6, 2, 9, 10, 12, 14, 13};
        getContiguousChain(arr);
        getLargest(arr);
    }
    public static void getLargest(Integer[] arr) {
        int max = 1;
        int start = 0;
        int aux = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
            } else {
                aux = i;
                count = 1;
            }
            if (count > max) {
                max = count;
                start = aux;
            }
        }
        System.out.println(start+ " "+(start + max - 1));
    }

    public static class Range {
        public final int start;
        public final int end;
        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

}