package Classes;

class Square{
    private double plevra;
    public Square(double plevra){
        this.plevra = plevra;
    }
    public double area(){
        return this.plevra*this.plevra;
    }
    public double getPlevra(){
        return this.plevra;
    }
    public void setPlevra(double plevra){
        this.plevra=plevra
    }

}