public class M7Q9 {
    // Identify whether a sorting algorithm is stable or unstable with examples.
    // Stable sort: preserves the relative order of equal keys.
    // Unstable sort: equal keys may change relative order.

    static class Pair {
        int key;
        String tag; // to track original order

        Pair(int key, String tag) {
            this.key = key;
            this.tag = tag;
        }

        @Override
        public String toString() {
            return "(" + key + "," + tag + ")";
        }
    }

    // Stable bubble sort for Pair by key (uses '>' not '>=')
    static void bubbleSortStable(Pair[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j].key > a[j + 1].key) {
                    Pair tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Unstable selection sort for Pair by key (swapping can break relative order)
    static void selectionSortUnstable(Pair[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j].key < a[minIdx].key) minIdx = j;
            }
            Pair tmp = a[i];
            a[i] = a[minIdx];
            a[minIdx] = tmp;
        }
    }

    static String arrToString(Pair[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i > 0) sb.append(' ');
            sb.append(a[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Pair[] original = {
                new Pair(2, "A"),
                new Pair(1, "B"),
                new Pair(2, "C"),
                new Pair(1, "D"),
        };

        Pair[] a1 = {
                new Pair(2, "A"),
                new Pair(1, "B"),
                new Pair(2, "C"),
                new Pair(1, "D"),
        };
        Pair[] a2 = {
                new Pair(2, "A"),
                new Pair(1, "B"),
                new Pair(2, "C"),
                new Pair(1, "D"),
        };

        System.out.println("Original:          " + arrToString(original));

        bubbleSortStable(a1);
        System.out.println("Stable (Bubble):   " + arrToString(a1));
        System.out.println("Note: For key=1, order stays B then D; for key=2, A then C.");

        selectionSortUnstable(a2);
        System.out.println("Unstable (Select): " + arrToString(a2));
        System.out.println("Note: Selection sort may change the order of equal keys because it swaps non-adjacent elements.");

        System.out.println();
        System.out.println("Common stability:");
        System.out.println("- Stable: Bubble, Insertion, Merge (standard implementation).");
        System.out.println("- Unstable: Selection, Quick (typical in-place), Heap.");
    }
}

