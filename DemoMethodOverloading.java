package Week9;
class Student
{
	String name;
	float[] CIE = {0,0,0};
	float avg;
	byte rollNo;
	void setStudent (String n, float ia[], byte rno) {
		float sum=0.0f;
		name=n;
		avg=0.0f;
		rollNo=rno;
		for(byte i=0; i<3; i++)
		{
			CIE[i]=ia[i];
			sum=sum+CIE[i];
			
		}
		avg= sum/3.0f;
	}
	void setStudent (String n, float ia1,float ia2, byte rno) {
		name=n;
		rollNo=rno;
		CIE[0]=ia1;
		CIE[1]=ia2;
		avg=(CIE[0]+CIE[1])/3.0f;
		
	}
	void setStudent (String n, float ia, byte rno ) {
		name=n;
		rollNo=rno;
		CIE[0]=ia;
		avg= (CIE[0])/3.0f;
		
	}
	void showStudent() {
		System.out.println(rollNo+"\t\t"+name+"\t\t"+avg);
	}
}
public class DemoMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student deeps= new Student ();
		System.out.println("the internals details of a student...");
		System.out.println("Roll No.\t Name\t\t Average");
		deeps.setStudent("Deepika",19.4f,(byte)12);
		deeps.showStudent();
		deeps.setStudent("Pranav", 19.4f, 17.6f,(byte)10);
		deeps.showStudent();
		float[]cie= {17.0f, 12.6f, 19.2f};
		deeps.setStudent("Radha", cie, (byte)8);
		deeps.showStudent();

	}

}
