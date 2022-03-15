package tr.edu.maltepe.oop;

class Main {
    public static void main(String[] args) {
    Professor professor = new Professor("ensar", "gul",123456);
    Student student = new Student("irem", "kutnay", 210704308);

    System.out.println(student.getName()+ " "+ student.getSurname()+" "+student.getId());
    System.out.println(professor.getName()+ " "+ professor.getSurname()+" "+professor.getId());

    student.studies();
    professor.teaches();

    }
}
