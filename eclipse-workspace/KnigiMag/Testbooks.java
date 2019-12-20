import java.util.Scanner; 
public class Testbooks {
	private static Scanner in;

	public static void main(String[] args) {
		BookShop myBookShop1 = new BookShop(); 
		in = new Scanner(System.in); 
		System.out.print("¬ведите фирму: ");
		String nazv=in.next(); 
		myBookShop1.setIzdatel(nazv); 
		System.out.print("¬ведите год выпуска: ");
		int s=in.nextInt();
		myBookShop1.setGodVipuska(s);
		System.out.println(myBookShop1.getIzdatel()+""+myBookShop1.getGodVipuska());
		Books myBook2=new Books();
		System.out.print("¬ведите издател€ книги: ");
		nazv=in.next();
		myBook2.setIzdatel(nazv);
		System.out.print("¬ведите год выпуска книги: ");
		s=in.nextInt();
		myBook2.setGodVipuska(s);
		System.out.print("¬ведите название книги: ");
		nazv=in.next();
		myBook2.setNazvanie(nazv);
		System.out.print("¬ведите количество страниц книги:	");
		s=in.nextInt();
		myBook2.setKolStranic(s);
		System.out.println();
		System.out.println(" нига номер 1:"+myBook2.toString());
		Magazines myMagazine=new Magazines();
		myMagazine.setAllInfo();
		System.out.println(myMagazine.toString());
	}
}