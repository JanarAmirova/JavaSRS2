import java.util.Scanner; 
public class test {
	private static Scanner in;

	public static void main(String[] args) {
		Auto myAuto1=new Auto(); 
		in = new Scanner(System.in); 
		System.out.print("������� �����: ");
		String nazv=in.next(); 
		myAuto1.setFirm(nazv); 
		System.out.print("������� ������������ ��������: ");
		int s=in.nextInt();
		myAuto1.setMaxSpeed(s);
		System.out.println(myAuto1.getFirm()+""+myAuto1.getMaxSpeed());
		Car myCar1=new Car("Ford", 200,"Mustang",2,false);
		Car myCar2=new Car();
		System.out.print("������� �����-������������� ��������� ����: ");
		nazv=in.next();
		myCar2.setFirm(nazv);
		System.out.print("������� ������������ �������� ��������� ����: ");
		s=in.nextInt();
		myCar2.setMaxSpeed(s);
		System.out.print("������� ������ ��������� ����: ");
		nazv=in.next();
		myCar2.setModel(nazv);
		System.out.print("������� ���-�� ������ ��������� ����:	");
		s=in.nextInt();
		myCar2.setNumDoors(s);
		System.out.print("������� ������� ������� ������� ��������� ���� (true/false): ");
		Boolean f=in.nextBoolean();
		System.out.println();
		System.out.println("������ �������� ����������:	"+myCar1.toString());
		System.out.println("������ �������� ����������:"+myCar2.toString());
		Truck myTruck=new Truck();
		myTruck.setAllInfo();
		System.out.println(myTruck.toString());
	}
}