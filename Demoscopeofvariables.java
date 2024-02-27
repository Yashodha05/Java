package Week2;
class Hospital{
	//instance variables
		String patientname;
		int patientid;
		//static variables
		static String Docname="Dr. Murthy";
		void setHospital(String pn, int pid) {
			patientname=pn;
			patientid=pid;
		}
        String getpatientname() {
        	return patientname;
        }
        int getpatientid() {
        	return patientid;
        }
}
public class Demoscopeofvariables {
	public static void main(String args[]) {
		//local variables
		String Hospitalname="Apollo Hospital";
		Hospital patient1= new Hospital();
		patient1.setHospital("pranav", 102);
		System.out.println( " the patient " + patient1.getpatientname() + " with the id " + patient1.getpatientid() + "is treated by " +  patient1.Docname + " at " + Hospitalname );
	}

}
