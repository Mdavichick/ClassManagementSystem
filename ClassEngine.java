public class ClassEngine {
    
    public static void main(String[] args){
        Student A = new Student();
        System.out.println(A.getLastName());
        A.setLastName("Davichick");
        A.setFirstName("Michael");
        System.out.println("Welcome " + A.getFullName());
    }// end main
}
