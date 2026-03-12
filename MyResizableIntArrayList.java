/**
 * Η κλάση MyResizableIntArrayList υλοποιεί μια λίστα ακεραίων μεταβλητού μεγέθους.
 * Βασίζεται σε έναν εσωτερικό πίνακα (array) και αυξομειώνει το μέγεθός του
 * δυναμικά ανάλογα με τις ανάγκες αποθήκευσης.
 */
public class MyResizableIntArrayList {
    
    // Ο πίνακας που αποθηκεύει τα στοιχεία (χωρητικότητα/capacity)
    private int[] data;
    // Ο τρέχων αριθμός των πραγματικών στοιχείων στη λίστα
    private int size;

    /**
     * Σύμφωνα με την εκφώνηση, το αρχικό μέγεθος του διανύσματος είναι ένα (1). Το διάνυσμα δεν έχει στοιχεία.
     */
    public MyResizableIntArrayList() {
        data = new int[1];
        size = 0;
    }

    /**
     initialCapacity Το αρχικό μέγεθος (χωρητικότητα) του πίνακα.
     */
    public MyResizableIntArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Η αρχική χωρητικότητα πρέπει να είναι θετικός αριθμός.");
        }
        data = new int[initialCapacity];
        size = 0;
    }

    /**
     * Προσθέτει ένα στοιχείο στο τέλος της λίστας.
     * Αν ο πίνακας είναι γεμάτος, διπλασιάζει το μέγεθός του πριν την προσθήκη.
     * @param elem Το στοιχείο προς προσθήκη.
     */
    public void add(int elem) {
        if (size == data.length) {
            resize(data.length * 2);
        }
        data[size] = elem;
        size++;
    }

    /**
     * Προσθέτει ένα στοιχείο σε συγκεκριμένη θέση (index).
     * Μετατοπίζει τα υπάρχοντα στοιχεία προς τα δεξιά για να κάνει χώρο.
     * @param index Η θέση στην οποία θα προστεθεί το νέο στοιχείο.
     * @param elem Το νέο στοιχείο.
     */
    public void add(int index, int elem) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Μη έγκυρος δείκτης: " + index);
        }
        
        // Αν ο πίνακας είναι γεμάτος, διπλασιάζουμε το μέγεθος
        if (size == data.length) {
            resize(data.length * 2);
        }
        
        // Μετατόπιση στοιχείων προς τα δεξιά ξεκινώντας από το τέλος
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        
        data[index] = elem;
        size++;
    }

    /**
     * Αδειάζει εντελώς τη λίστα.
     * Επαναφέρει τον πίνακα στο αρχικό του μέγεθος (1) και το πλήθος στοιχείων στο 0.
     */
    public void clear() {
        data = new int[1];
        size = 0;
    }

    /**
     * Ελέγχει αν ένα συγκεκριμένο στοιχείο υπάρχει στη λίστα.
     * @param elem Το στοιχείο προς αναζήτηση.
     * @return true αν το στοιχείο βρεθεί, διαφορετικά false.
     */
    public boolean contains(int elem) {
        for (int i = 0; i < size; i++) {
            if (data[i] == elem) {
                return true;
            }
        }
        return false;
    }

    /**
     * Ελέγχει αν η λίστα είναι άδεια.
     * @return true αν δεν υπάρχουν στοιχεία (size == 0), διαφορετικά false.
     */
    public boolean isEmpty() {
        return size == 0;
    }
    /**
     * Βοηθητική μέθοδος (private) που αναλαμβάνει να δημιουργήσει έναν νέο πίνακα
     * με τη νέα χωρητικότητα και να αντιγράψει τα παλιά δεδομένα.
     * @param newCapacity Το νέο μέγεθος του πίνακα.
     */
    private void resize(int newCapacity) {
        int[] newData = new int[newCapacity];
        // Αντιγραφή των παλιών στοιχείων στο νέο πίνακα
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData; // Αντικατάσταση της αναφοράς
    }

    /**
     * Διαγράφει το στοιχείο που βρίσκεται στη συγκεκριμένη θέση.
     * Μετατοπίζει τα στοιχεία προς τα αριστερά. Αν μετά τη διαγραφή η χωρητικότητα
     * του πίνακα είναι 4 φορές μεγαλύτερη από τα στοιχεία, την μειώνει στο μισό.
     * @param index Ο δείκτης του στοιχείου προς διαγραφή.
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Μη έγκυρος δείκτης: " + index);
        }
        
        // Μετατόπιση στοιχείων προς τα αριστερά για να καλυφθεί το κενό
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;

        // Έλεγχος σμίκρυνσης του πίνακα:
        // Αν η χωρητικότητα είναι 4 φορές το μέγεθος (και υπάρχουν στοιχεία), μειώνεται στο μισό.
        if (size > 0 && data.length >= 4 * size) {
            resize(data.length / 2);
        } else if (size == 0 && data.length > 1) {
            // Αν αδειάσει με διαγραφές, το επαναφέρουμε στο default
            resize(1);
        }
    }

    /**
     * Αλλάζει την τιμή ενός υπάρχοντος στοιχείου σε μια συγκεκριμένη θέση.
     * @param index Η θέση του στοιχείου.
     * @param elem Η νέα τιμή.
     */
    public void set(int index, int elem) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Μη έγκυρος δείκτης: " + index);
        }
        data[index] = elem;
    }

    /**
     * Επιστρέφει το τρέχον πλήθος των στοιχείων στη λίστα.
     * @return Ο αριθμός των στοιχείων.
     */
    public int size() {
        return size;
    }


    /* --- Βοηθητικές μέθοδοι για το TestDriver --- 
    *Επειδή το ο πίνακας data είναι private, όταν θέλω να την καλέσω από το TestDriver
    *με την εντολή data.length δεν θα μπορώ. Για αυτό φτιάχνω μια public method
    *η οποία κάνει ακριβώς αυτό.
    /*
     * Επιστρέφει την τρέχουσα χωρητικότητα (συνολικό μέγεθος) του εσωτερικού πίνακα.
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * Επιστρέφει μια String αναπαράσταση της λίστας.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}