import java.util.Scanner;

public class Magazines extends BookShop{
	private String nazvanie;
	private int tirag; 
	private Scanner in;
	public Truck(){
		super();
		nazvanie="";
		tirag=0;
	}
	public Magazines (String firma, int year, String name, int n){
		super(firma,year);
		nazvanie=name;
		tirag=n;
	}
	public void setNazvanie(String name){
		nazvanie=name;
	}
	public String getNazvanie(){
		return nazvanie;
	}
	public void setTirag(int n){
		tirag=n;
	}
	public int getTirag(){
		return tirag;
	}
	public void setAllInfo(){
		in = new Scanner(System.in);
		System.out.print("������� �����-������������� �������: ");
		String nazv=in.next(); 
		setIzdatel(nazv);
		System.out.print("������� ��� ������� �������: ");
		int s=in.nextInt();
		setGodVipuska(s);
		System.out.print("������� �������� �������: ");
		nazvanie=in.next();
		System.out.print("������� ����� �������: ");
		tirag=in.nextInt();
		System.out.println();
	}
	public String toString(){
		return "\n\t������"+"\n\t"+"��������: "+getIzdatel()+"\n\t"+"��� �������: "+getGodVipuska()+ "\n\t"+"��������: "+nazvanie+"\n\t"+"�����: "+tirag;
	}
}