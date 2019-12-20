import java.util.Scanner; 
public class test {
	private static Scanner in;

	public static void main(String[] args) {
		Auto myAuto1=new Auto(); 
		in = new Scanner(System.in); 
		System.out.print("¬ведите фирму: ");
		String nazv=in.next(); 
		myAuto1.setFirm(nazv); 
		System.out.print("¬ведите максимальную скорость: ");
		int s=in.nextInt();
		myAuto1.setMaxSpeed(s);
		System.out.println(myAuto1.getFirm()+""+myAuto1.getMaxSpeed());
		Car myCar1=new Car("Ford", 200,"Mustang",2,false);
		Car myCar2=new Car();
		System.out.print("¬ведите фирму-производитель легкового авто: ");
		nazv=in.next();
		myCar2.setFirm(nazv);
		System.out.print("¬ведите максимальную скорость легкового авто: ");
		s=in.nextInt();
		myCar2.setMaxSpeed(s);
		System.out.print("¬ведите модель легкового авто: ");
		nazv=in.next();
		myCar2.setModel(nazv);
		System.out.print("¬ведите кол-во дверей легкового авто:	");
		s=in.nextInt();
		myCar2.setNumDoors(s);
		System.out.print("¬ведите признак полного привода легкового авто (true/false): ");
		Boolean f=in.nextBoolean();
		System.out.println();
		System.out.println("ѕервый легковой автомобиль:	"+myCar1.toString());
		System.out.println("¬торой легковой автомобиль:"+myCar2.toString());
		Truck myTruck=new Truck();
		myTruck.setAllInfo();
		System.out.println(myTruck.toString());
	}
}