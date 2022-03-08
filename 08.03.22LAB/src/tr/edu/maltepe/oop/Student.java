package tr.edu.maltepe.oop;

public class Student {

    int std_id;
    Student(int id){
        std_id = id;
    }

    void learns(){
        System.out.println(" student : "+ std_id +" is learning now.");
    }

}

