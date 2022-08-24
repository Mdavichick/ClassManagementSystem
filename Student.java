public final class Student extends ActiveUser {
    int balance, unitsTaken = 0;

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance() {
        return this.balance;
    }
    public void addBalance(int balance){
        this.balance += balance;
    }
    public void payBalance(int balance){
        this.balance -= balance;
    }
    public int getUnitsTaken(){
        return this.unitsTaken;
    }
    public void addUnits(int units){
        this.unitsTaken += units;
    }
    public void dropUnits(int units){
        this.unitsTaken -= units;
    }

    // public boolean enroll() {
    //     // TODO Auto-generated method stub
    //     return false;
    // }

    
    
}
