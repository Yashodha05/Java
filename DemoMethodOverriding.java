package Week9;
import java.util.Scanner;
class Student1{
	String name;
	float[] CIE = {0,0,0};
	float avg;
	byte rollNo;
	void setStudent (String n, float ia[], byte rno) {
		
		name=n;
		avg=0.0f;
		rollNo=rno;
		for(byte i=0; i<3; i++) {
			CIE[i]=ia[i];
			this.CalculateAverage();
		}
	
	}
	void CalculateAverage() {
		float sum=0.0f;
		for(byte i=0; i<3; i++) {
			sum=sum+CIE[i];
			avg=sum/3.0f;
		}
	}
	void showStudent() {
		System.out.println(rollNo+"\t\t"+name+"\t\t"+avg+"\t");
		
	}
}
class Grade extends Student1{
	final byte grace=10;float attendance;
	Scanner sc=new Scanner(System.in);
	void setStudent (String n,float ia[],byte rno) {
		System.out.println("enter the attendance of Student...");
		attendance=sc.nextFloat();
		if (attendance>=75.0f) {
			ia [2]=grace;
			super.setStudent(n, ia, rno);
			
		}
		else {
			super.setStudent(n, ia, rno);
		}
	}
}
public class DemoMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade deeps=new Grade();
		float[] CIE= {18.4f,23.7f,0};
		deeps.setStudent("Deepika", CIE, (byte)15);
		System.out.println("the internal details of a Student...");
		System.out.println("RollNo.\t\tName\t\tAverage");
		deeps.showStudent();

	}

}
