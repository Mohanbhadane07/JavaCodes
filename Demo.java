class student {
   int rollno;
   String name;
   int marks;
}

public class Demo {

  public static void main(String[] args) {
    student s1 = new student();
    s1.rollno = 1;
    s1.name = "mohan"; 
    s1.marks = 90;

    student s2 = new student();
    s2.rollno = 2;
    s2.name = "ravi";
    s2.marks = 90;

    student s3 = new student();
    s3.rollno = 3;
    s3.name = "om";
    s3.marks = 85;

    student students[] = new student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for ( student n : students) {
      System.out.println(n.marks + " " + n.name + " " + n.rollno );
    }
  }
}
