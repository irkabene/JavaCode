package Classes;

class Cell{
    private int data;
    private Cell next;
    public Cell(int data){
        this.data = data;
        this.next = null;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return this.data;
    }
    public void setNext(Cell next){
        this.next = next;
    }
    public Cell getNext(){
        return this.next;
    }
}

class IntList{

    private Cell head;
    private Cell last;
    private int noOfElems;

    public IntList(){
        this.noOfElems=0;
    }

    public int size(){
        return noOfElems;
    }

    public void insertEnd(int y){
        Cell newCell = new Cell(y);
        this.last.setNext(newCell);
        this.noOfElems = this.noOfElems + 1;
        this.last = newCell;
    }

    public int deleteFront(){
        Cell B = this.head.getNext();
        int headData = this.head.getData();
        this.head = B;
        this.noOfElems = this.noOfElems - 1;
        return headData;   
    }

    public int deleteLast(){

        Cell beforeLast = this.head;
        for(int i=0; i<this.noOfElems-1; i++){
           beforeLast = beforeLast.getNext();
        }
        
        int lastData = this.last.getData();    
        beforeLast.setNext(null);
        this.last = beforeLast;
        this.noOfElems = this.noOfElems - 1;
        return lastData;
    }

    public void deleteElement(int elem){
        Cell before = this.head;
        Cell current = this.head;
        for (int i=0 ; i< this.noOfElems ; i++){
            if(current.getData()== elem){
                before.setNext(current.getNext());
            }
            else{
                before = current;
            }
        }
    }
    public void printPositive(){
        
        Cell keli = this.head;
        for(int i=0 ; i< this.noOfElems ; i++){
            if(keli.getData() > 0){
                System.out.println(keli.getData());
            }
        }
    }

}

public class Lists{
    // main/driver
}