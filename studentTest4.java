package bori1;

public class studentTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student2 studentLee = new student2();
		studentLee.setStudentName("�̱���");
		System.out.println(student2.getSerialNum());
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID);
		
		student2 studentKim = new student2();
		studentKim.setStudentName("�����");
		System.out.println(student2.getSerialNum());
		System.out.println(studentKim.studentName + " �й� : " + studentKim.studentID);
	}

}
