package bori1;

public class studentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 studentLee = new student1();
		studentLee.setStudentName("�̱���");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID);
		
		student1 studentKim = new student1();
		studentKim.setStudentName("�����");
		System.out.println(studentKim.serialNum);
		System.out.println(studentKim.studentName + " �й� : " + studentKim.studentID);
	}

}
