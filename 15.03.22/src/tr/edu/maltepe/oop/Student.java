package tr.edu.maltepe.oop;

class Student extends Person{

    public Student(String name, String surname, int id) {
        super(name, surname, id);
    }

    void studies(){
        System.out.println(" student : "+ getName() +" is studying now.");
    }


}
