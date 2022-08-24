public class ActiveUser {
    String firstName, lastName, email;
    int id;

    ActiveUser(){};
    ActiveUser(String firstName, String lastName, String email, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
    }
    
    public void setFirstName(String name){
        this.firstName = name;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String name){
        this.lastName = name;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setID(int id){
        this.id = id;
    }
    public int getID() {
        return this.id;
    }
}
