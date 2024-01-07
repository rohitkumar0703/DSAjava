// Java program to illustrate creating
//  an array of objects
class student{
    public String name;
    student(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}

// Elements of the array are objects of a class Student.
public class practice3
{
    public static void main (String[] args)
    {
           // declares an Array and initializing  the elements of the array
        student[] myStudents = new student[]{new student("Dharma"),new student("sanvi"),new student("Rupa"),new student("Ajay")};
   
        // accessing the elements of the specified array
        for(student m:myStudents){    
            System.out.println(m);
        }
    }
}
    
