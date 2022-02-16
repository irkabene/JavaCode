package Classes;

class Square{

    private int side;

    // O constructor ειναι μια ειδικου τυπου μεθοδος. 
    public Square(int pleuraUser){
        side = pleuraUser;  
    }

    public Square(){
        // side = pleuraUser;  
        side = 1;
    }

    public int getArea(){
        return side*side;
    }
    

    // Χρησιμοποιουμε public getters για να δοσουμε προσβαση σε private πεδια.
    public int getSide(){
        return side;
    }
    // Χρησιμοποιουμε public setters για να αλλαξουμε την τιμη σε private πεδια.
    public void setSide(int pleuraUser){
        side = pleuraUser;
    }

}

public class ClassUnderstanding {

    public static void main(String[] args){

        // typos - onoma = arxikopoiisi
        int n = 4;

        n = 5;
        Square irini = new Square(n);
        // η new "καλει" τον κατασκευαστη της Square
        
        int pleura = irini.getSide();

        System.out.println(pleura);
      
        Square xristos = new Square();

        System.out.println(xristos.getSide());

        xristos.setSide(10);

        irini.setSide(20);

        System.out.println(xristos.getArea());




    }
}
