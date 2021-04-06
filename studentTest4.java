package bori1;

public class studentTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student2 studentLee = new student2();
		studentLee.setStudentName("ÀÌ±ºÀç");
		System.out.println(student2.getSerialNum());
		System.out.println(studentLee.studentName + " ÇĞ¹ø : " + studentLee.studentID);
		
		student2 studentKim = new student2();
		studentKim.setStudentName("±è´ëÀ±");
		System.out.println(student2.getSerialNum());
		System.out.println(studentKim.studentName + " ÇĞ¹ø : " + studentKim.studentID);
	}

}
