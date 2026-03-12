public class TestDriver {
    public static void main(String[] args) {
    
        MyResizableIntArrayList list = new MyResizableIntArrayList();
        
        System.out.println("Αρχική κατάσταση:");
        System.out.println("Λίστα: " + list + " | Στοιχεία: " + list.size() + " | Χωρητικότητα πίνακα: " + list.getCapacity());

        System.out.println("\n--- 1.Προσθήκη & Διπλασιασμός Πίνακα ---");
        // Θα προσθέσουμε 5 στοιχεία. Αρχική χωρητικότητα = 1.
        // Προσθήκες: 1->2, 2->4, 3->4, 4->8, 5->8
        for (int i = 1; i <= 5; i++) {
            list.add(i * 10);
            System.out.println("Προσθήκη " + (i*10) + ": Λίστα " + list + " | Στοιχεία: " + list.size() +  " | Χωρητικότητα: " + list.getCapacity());
                                    
        }

        System.out.println("\n--- 2. Προσθήκη σε συγκεκριμένο index ---");
        list.add(2, 25);
        System.out.println("Εισαγωγή 25 στη θέση 2:");
        System.out.println(list + " | Στοιχεία: " + list.size() + " | Χωρητικότητα: " + list.getCapacity());

        System.out.println("\n--- 3. Αλλαγή τιμής (set) & Έλεγχος (contains) ---");
        list.set(0, 5);
        System.out.println("Αλλαγή θέσης 0 στην τιμή 5: " + list);
        System.out.println("Περιέχει το 30; " + list.contains(30));
        System.out.println("Περιέχει το 99; " + list.contains(99));

        System.out.println("\n--- 4. Δοκιμή Διαγραφής & Υποδιπλασιασμού Πίνακα ---");
        // Τρέχοντα στοιχεία: 6, Χωρητικότητα: 8.
        // Θα αφαιρέσουμε στοιχεία μέχρι η χωρητικότητα (8) να γίνει >= 4 * στοιχεία (δηλ. όταν στοιχεία = 2).
        
        list.remove(5); // Αφαιρεί το τελευταίο στοιχείο (50)
        System.out.println("Διαγραφή (θέση 5): " + list + " | Στοιχεία: " + list.size() + " | Χωρητικότητα: " + list.getCapacity());
        
        list.remove(4); // Αφαιρεί το (40)
        System.out.println("Διαγραφή (θέση 4): " + list + " | Στοιχεία: " + list.size() + " | Χωρητικότητα: " + list.getCapacity());
        
        list.remove(3); // Αφαιρεί το (30)
        System.out.println("Διαγραφή (θέση 3): " + list + " | Στοιχεία: " + list.size() + " | Χωρητικότητα: " + list.getCapacity());
        
        list.remove(2); // Αφαιρεί το (25) - Εδώ τα στοιχεία γίνονται 2. 
                        // Η συνθήκη (8 >= 4 * 2) ικανοποιείται! Ο πίνακας πρέπει να γίνει 8 / 2 = 4.
        System.out.println("Διαγραφή (θέση 2): " + list + " | Στοιχεία: " + list.size() + " | Χωρητικότητα: " + list.getCapacity());

        System.out.println("\n--- 5. Άδειασμα Λίστας (clear) ---");
        list.clear();
        System.out.println("Μετά την clear():");
        System.out.println("Λίστα: " + list + " | Είναι άδεια; " + list.isEmpty() + 
                           " | Στοιχεία: " + list.size() + " | Χωρητικότητα: " + list.getCapacity());
    }
}