public class Main {

	public static void main(String[] args) {
		//����һ���������
		MyFrame f = new MyFrame();
	}

}

class Student{
	private String stuNo;				//ѧ��
	private String stuName;				//����
	private String stuSex;				//�Ա�
	private String stuBirthday;			//��������
	
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public String getStuBirthday() {
		return stuBirthday;
	}
	public void setStuBirthday(String stuBirthday) {
		this.stuBirthday = stuBirthday;
	}
	
}