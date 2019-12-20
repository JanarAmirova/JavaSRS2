import java.util.Scanner;

public class Truck extends Auto{
	private String model;
	private int power;
	private Boolean trailer; 
	private Scanner in;
	public Truck(){
		super();
		model="";
		power=0;
		trailer=false;
	}
	public Truck(String firma, int speed, String name, int
			n, Boolean f){
		super(firma,speed);
		model=name;
		power=n;
		trailer=f;
	}
	public void setModel(String name){
		model=name;
	}
	public String getModel(){
		return model;
	}
	public void setPower(int n){
		power=n;
	}
	public int getPower(){
		return power;
	}
	public void setTrailer(Boolean b){
		trailer=b;
	}
	public Boolean isTrailer(){
		return trailer;
	}
	public void setAllInfo(){
		in = new Scanner(System.in);
		System.out.print("������� �����-������������� ��������� ����: ");
		String nazv=in.next(); 
		setFirm(nazv);
		System.out.print("������� ������������ �������� ��������� ����: ");
		int s=in.nextInt();
		setMaxSpeed(s);
		System.out.print("������� ������ ��������� ����: ");
		model=in.next();
		System.out.print("������� �������� ��������� ����: ");
		power=in.nextInt();
		System.out.print("������� ������� ������� ��������� ���� (true/false): ");
		trailer=in.nextBoolean();
		System.out.println();
	}
	public String toString(){
		return "\n\t��������"+"\n\t"+"�����: "+getFirm()+"\n\t"+"������������ ��������: "+getMaxSpeed()+ "\n\t"+"������: "+model+"\n\t"+"��������: "+power+"\n\t"+"������� �������: " +trailer+"\n";
	}
}