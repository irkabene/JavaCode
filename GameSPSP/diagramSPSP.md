# DIAGRAM

## Classes

- **Person**
    - Fields (Πεδια)
        - String name
    - Constructor (Κατασκευαστής)
        > Για να αποφασισεις την μορφη του κατασκευαστή, θα πρέπει να κάνεις την ερώτηση : "Πως θα θελα να μπορούσα να δημιουργήσω ένα αντικείμενο αυτής της κλάσης ?" Πχ. Person christos = new Person(name);
        
        - Input arguments (String name)

    - Methods (Μέθοδοι)
        > Παντα γράφουμε setters/getters για τα πεδία μιας κλάσης (αν τα πεδία είναι private)
        - void setName(String nameUser)
        - String getName()


- **Player** implements **Person**
    - Fields
        - int wins
        - int tie
        - int loss
    - Constructor (Κατασκευαστής)
        > Player christos = new Player(name);
    - Methods
        int play()
        
        > int xeironomia = Random(4)
        > return xeironomia

- **Driver**
    - public static void main(String[] args)
        - int N
        - create player1
        - create player2 
        - for loop
            - player1.play()
            - player2.play()
            - συγκρινεις αποτελεσματα
            - update τα wins ties loss
            - στατιστικα

           
    




