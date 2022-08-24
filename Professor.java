public final class Professor extends ActiveUser{
  int numOfClasses = 0, salary;
  
  public void addClass(){
    this.numOfClasses ++;
  }
  public void dropClass(){
    this.numOfClasses --;
  }
  public int getNumClasses(){
    return this.numOfClasses;
  }
  public void setSalary(int salary){
    this.salary = salary;
  }
  public int getSalary(){
    return this.salary;
  } 



    
}
