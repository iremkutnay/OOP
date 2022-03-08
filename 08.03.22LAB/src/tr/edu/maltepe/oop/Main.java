package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        Prof p1,p2;
        p1 = new Prof("ensar gul");
        p1.teaches();
        p2 = new Prof("oruc raif onvural");
        p2.teaches();

        Student st1, st2, st3;
        st1 = new Student(210704308);
        st1.learns();
        st2 = new Student(210704309);
        st2.learns();
        st3 = new Student(210704310);
        st3.learns();

    }
}
