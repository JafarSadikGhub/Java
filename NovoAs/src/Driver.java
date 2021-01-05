public class Driver {
    public static void main(String[] args) {
    String[] courses1 = {"CSE115", "CSE173", "CSE215"};
    String[] courses2 = {"CSE215", "CSE115", "CSE225"};
    String[] courses3 = {"CSE331", "CSE373", "CSE215"};
    Faculty data1=new Faculty("Nova", "Ahmed", "123", 40, "456", "Assistant Professor", courses1);  
    Faculty data2=new Faculty("Silvia", "Ahmed", "313", 42, "236", "Professor", courses2);
    Faculty data3=new Faculty("Abc", "xyz", "223", 30, "456", "Lecturer", courses3);
    System.out.println(data1.toString());
    System.out.println(data2.toString());
    System.out.println(data3.toString());
    
    Student data4=new Student("Mohaiminul","Islam","abcXYZ", "200000042", 22, (float)3.11, courses1);
    Student data5=new Student("ABC", "XYZ", "WWW", "2100000042", 23, (float)2.99, courses2);
    Student data6=new Student("Abu", "Sayed", "NatID", "2100001030", 24, (float)3.32, courses3);
    
    float maxCGPA = 0;
    float[] cgArray = {data4.getCgpa(), data5.getCgpa(), data6.getCgpa()};
    for(int i=0; i<cgArray.length; i++)
    {   int stdIndex =0;
        if(maxCGPA< cgArray[i])
        {
            maxCGPA = cgArray[i];
            stdIndex = i;
        }
        
    }
    System.out.println("Maximum CGPA: " + maxCGPA);
    //System.out.println(Person.petName);
    
        
    
    
    }
       
}