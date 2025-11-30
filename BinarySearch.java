import java.util.Comparator;

import javax.management.ObjectName;

public class BinarySearch {

    public static int binarySearch(Integer[] a, Integer x, Comparator<Integer> c, int left, int right) {
        if (left > right) {
            return -1; // Το στοιχείο δεν βρέθηκε
        }

        int mid = (right + left) / 2; // Υπολογισμός μέσης θέσης
        int cmp = c.compare(x, a[mid]); // Σύγκριση του στοιχείου x με το μέσο στοιχείο

        if (cmp == 0) {
            return mid; // Βρέθηκε το στοιχείο
        } 
        else if (cmp < 0) { 
            return binarySearch(a, x, c, left, mid - 1); // Αναζήτηση στο αριστερό τμήμα
        } 
        else {
            return binarySearch(a, x, c, mid + 1, right); // Αναζήτηση στο δεξί τμήμα
        }
    }

    public static void main(String[] args) {
        Integer[] a = {1,3,5,7,9};
        Integer target = 5;

        Comparator<Integer> comparator = Integer::compare; // or o1.compareTo(o2);

        int result = binarySearch(a, target, comparator, 0, a.length - 1);

        if (result != -1) {
            System.out.println("Το στοιχείο βρέθηκε στη θέση: " + result);
        } else {
            System.out.println("Το στοιχείο δεν βρέθηκε.");
        }
    }
}
