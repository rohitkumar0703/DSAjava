class student{
    public int roll_no;
    public String name;
    student(int roll_no,String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

//Elements of the array are objects of a class student.
public class practice2 {
    public static void main(String[] args){
        student[] arr;    // declares an Array of Student
        arr = new student[6];    // allocating memory for 5 objects of type Student.
        // initialize the second elements of the array
        arr[0] = new student(1,"Rohit");
        arr[1] = new student(2, "vaibhav");
        arr[2] = new student(3,"Sachin");
        arr[3] = new student(4,"Virat");
        arr[4] = new student(5," Siraj");
        arr[2] = new student(6,"Surya");

        //accessing the element of the apecified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elemetn at " + i + ":"+ arr[i].roll_no+ " " + arr[i].name);
       }
    }

}