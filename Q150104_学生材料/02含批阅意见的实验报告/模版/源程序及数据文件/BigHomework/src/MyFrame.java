import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	public MyFrame() throws HeadlessException {
		super();
		
		this.setTitle("ѧ���ɼ�����ϵͳ");
		this.setSize(700,320);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		StuPanel p1 = new StuPanel();
		this.add(p1);
		this.setVisible(true);
	}
	
}

class StuPanel extends JPanel{

	private JTextField stuNo=new JTextField();											//ѧ��
	private JTextField stuName=new JTextField();										//����
	private JTextField stuSex=new JTextField();											//�Ա�
	private JTextField stuBirthday=new JTextField();
	
	StuPanel(){
		this.setLayout(null);
		//��ʾѧ��
		JLabel lb1=new JLabel("ѧ�ţ�");
		lb1.setBounds(30, 10, 100, 20);
		this.add(lb1);
		stuNo.setBounds(100,10, 100, 20);
		this.add(stuNo);
		//��ʾ����
		JLabel lb2=new JLabel("������");
		lb2.setBounds(30, 60, 100, 20);
		this.add(lb2);
		stuName.setBounds(100,60, 100, 20);
		this.add(stuName);
		//��ʾ�Ա�
		JLabel lb3=new JLabel("�Ա�");
		lb3.setBounds(30, 110, 100, 20);
		this.add(lb3);
		stuSex.setBounds(100,110, 100, 20);
		this.add(stuSex);
		//��ʾ��������
		JLabel lb4=new JLabel("���գ�");
		lb4.setBounds(30, 160, 100, 20);
		this.add(lb4);
		stuBirthday.setBounds(100,160, 100, 20);
		this.add(stuBirthday);
	}
}
