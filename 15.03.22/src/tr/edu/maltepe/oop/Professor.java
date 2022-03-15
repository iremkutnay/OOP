package tr.edu.maltepe.oop;

public class Professor extends Person{

    public Professor(String name, String surname, int id) {
        super(name, surname, id);
    }
    void teaches(){
        System.out.println(" prof : "+ getName()+" is teaching now.");
    }
}
