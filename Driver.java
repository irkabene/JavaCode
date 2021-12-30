class Driver{
    private static final int ROWS=8;
    private static final int COLS=8;
    public static void main(String[] args)
    
    { 
        String skakiera[][];
        skakiera= new String[ROWS][COLS];
        for(int i=0; i<ROWS; i++ )
        {
            for(int j=0; j<COLS; j++)
            {
                if ( (i+j)%2==0 ){
                    skakiera[i][j]= "White";
                }
                else{
                    skakiera[i][j]="Black";
                }
            }
        }
        for(int i=0; i<ROWS; i++ )
        {
           // System.out.print(skakiera[i][j]);
            for(int j=0; j<COLS; j++)
            {
                System.out.print( skakiera[i][j] + " " ) ;               
            }
        System.out.print("\n");
        }

        // person - christo - 28
        Person christos = new Person(28, "Christos");
        christos.printInfo();
        Student thea = new Student(18, "eirini");
        thea.printInfo();
        thea.grades.printGrades();
    }
}

class Person{
   private int age;
   private String name;

    public Person(int ageUser, String nameUser){
        // thes na apothikeyseis την τιμη του χρηστη, στο πεδιο age της κλασης
        this.age = ageUser; // this == αυτηνης, ετουτης
        this.name = nameUser;
       
    }
   // getter
    public int getAge(){
        return this.age;
    }
    public void setAge(int ageUser){
       this.age = ageUser;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String nameUser){
        this.name = nameUser;
    }
     
    public String printInfo(){
        String info =  "O/H " + this.name + " EINAI " + this.age + " XRONON" ;
        System.out.println(info);
        return info;   
    }
}

class Grades extends Object{
    private int math;
    public int physics;

    public Grades(){
        this.math=0;
        this.physics=0;
    }
    public Grades(int math, int physics){
        this.math=math;
        this.physics=physics;
    }
    public void printGrades(){
        String info =  "o bathmos ton mathimatikon einai " + this.math+ " kai tis fisikis  " + this.physics;
        System.out.println(info);
    }
    public int getMathGrade(){
        return this.math;
    }
    public void setMathGrade(int mathGrade){
        this.math = mathGrade;
    }

    @Override
    public String toString(){
        String info =  "o bathmos ton mathimatikon einai " + this.math+ " kai tis fisikis  " + this.physics;
        return info;
    }
   
}

class Student {
    public int age;
    public String name;
    public Grades grades;

    public Student(int age, String name, Grades grades){
        this.age=age;
        this.name=name;
        this.grades=grades;
    }
    public Student(int age, String name){
        this.age=age;
        this.name=name;
        this.grades=new Grades();
    }
    public Student(int age, String name, int mathGrade, int physicsGrade){
        this.age=age;
        this.name=name;
        this.grades=new Grades(mathGrade, physicsGrade);
        // // this.grades.math = mathGrade;
        // this.grades.setMathGrade(i);
        // this.grades.physics = physicsGrade;
    }

    public String printInfo(){
        String info =  "O/H " + this.name + " EINAI " + this.age + " XRONON " + this.grades;
        System.out.println(info);
        return info;   
    }

}



