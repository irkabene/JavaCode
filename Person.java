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

