public class Person {
//public static String petName;
private String lastName;
private int age;
protected String nationalID;
 Person(){
    
}

Person(String firstName,String lastName, int age, String nationalID){ 
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.nationalID=nationalID;
}
    public String getFullName(){
    return firstName+" "+lastName;
}
    public String getNationalId(){
        return nationalID;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge)
    {
        this.age=newAge;
        
    }

public String toString(){
    return "First Name:< " + firstName + " >\n" + "Last Name:< " + lastName + ">\n" + "Age:< " + age + " >\n";
   
} 

}