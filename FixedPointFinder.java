public class FixedPointFinder {
    public static int findFixedPoint(int[] A) {
        int left = 0;
        int right = A.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (A[mid] == mid) {
                return mid; // Βρήκαμε το A[i] = i
            } else if (A[mid] > mid) {
                right = mid - 1; // Ψάχνουμε αριστερά
            } else {
                left = mid + 1; // Ψάχνουμε δεξιά
            }
        }
        return -1; // Δεν βρέθηκε
    }

    public static void main(String[] args) {
        int[] A = {-3, -1, 1, 3, 5, 7}; // A[3] = 3 -> fixed point
        int index = findFixedPoint(A);
        System.out.println("Fixed point index: " + index);
    }
}
