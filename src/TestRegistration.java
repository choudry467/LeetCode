
class Course{
  private String code;
  private int    number;
  public Course( String c, int n )
  {
    code = c;
    number = n; 
  }
  public int    getNumber() { return number; }
  public String getCode()   { return code; }
  public String toString()  { return code + " " + number; }
}



class Student
{
  private Course c1, c2, c3;
  private int id;
  public Student( int num )
  {
    id = num; 
  } 
  public Student( int num, Course a1, Course a2, Course a3 )
  {
    id = num;
    c1 = a1;
    c2 = a2;
    c3 = a3;
  } 
  public Course getC1() { return c1; }
  public Course getC2() { return c2; }
  public Course getC3() { return c3; }
  public void setC1( Course c ) { c1 = c; }
  public void setC2( Course c ) { c2 = c; }
  public void setC3( Course c ) { c3 = c; }
  public String toString()
  {
    String str = "";
    str = "Student " + id + " is taking: \n" + c1.toString() + ", " 
        + c2.toString() + ", " + c3.toString() + "\n";
    return str;
  }
 } 


//This is the main part. I made other classes part of this file so that the code could be run easily

public class TestRegistration {
	public static void main(String[] args) {
		Course cosc101 = new Course("COSC", 101);
		Course cosc111 = new Course("COSC", 111);
		Course math100 = new Course("MATH", 100);
		Course phys112 = new Course("PHYS", 112);
		
		Student mary = new Student(17467);
		mary.setC1(math100);
		mary.setC2(phys112);
		mary.setC3(cosc111);
		
		Student john = new Student(17466,cosc101,cosc111,math100);
		Student stef = new Student(17468,cosc101,math100,phys112);
		
		Student[] Student = new Student[3];
		Student[0]=mary;
		Student[1]=john;
		Student[2]=stef;
		
		for(int i =0; i<3;i++) {
			System.out.println(Student[i].toString());
		}
		
		int count=0;
		for(int i =0; i<3;i++) {
			if (Student[i].getC1().equals(cosc111))
				count++;
			if (Student[i].getC2().equals(cosc111))
				count++;
			if (Student[i].getC3().equals(cosc111))
				count++;	
		}
		
		System.out.println("There are "+ count+" students taking COSC 111");
		
	}
}
