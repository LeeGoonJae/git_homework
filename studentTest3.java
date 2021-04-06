package bori1;

public class studentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 studentLee = new student1();
		studentLee.setStudentName("ÀÌ±ºÀç");
		System.out.println(student1.serialNum);
		System.out.println(studentLee.studentName + " ÇĞ¹ø : " + studentLee.studentID);
		
		student1 studentKim = new student1();
		studentKim.setStudentName("±è´ëÀ±");
		System.out.println(student1.serialNum);
		System.out.println(studentKim.studentName + " ÇĞ¹ø : " + studentKim.studentID);
	}

}
