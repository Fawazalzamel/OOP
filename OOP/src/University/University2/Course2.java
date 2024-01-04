package University.University2;

public class Course2 {
    
//CLASS property
String courseName;
String instructor;
int noOfStudentsEnrolled;

//constuctor 

public Course2(String newCourseName, String  newInstructor, int newNoOfStudentsEnrolled )
{

    courseName= newCourseName;
    instructor = newInstructor;
    noOfStudentsEnrolled = newNoOfStudentsEnrolled;

}

public String getCourseName(){

    return courseName;
}


public void setCourseName(String newCourseName){
    courseName= newCourseName;
}




public String getInstructor(){

    return instructor;
}


public void setInstructor(String newInstructor){
    instructor= newInstructor;
}





public int getNoOfStudentsEnrolled(){

    return noOfStudentsEnrolled;
}


public void setNoOfStudentsEnrolled(int newNoOfStudentsEnrolled){
    noOfStudentsEnrolled= newNoOfStudentsEnrolled;
}





public String toString(){

    return "Name: " + courseName + " Instructor Name: " + instructor + "No. of people enrolled"+ noOfStudentsEnrolled;
}






    public static void main(String[] args) {
        
    }
}
