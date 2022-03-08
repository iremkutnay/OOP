package tr.edu.maltepe.oop;

public class Prof {

    String prof_name;
    Prof(String name){
        prof_name = name;
    }

    void teaches(){
        System.out.println(" prof : "+ prof_name+" is teaching now.");
    }

}
