public class Books extends BookShop {
	private String nazvanie;
	private int kolStranic;
	public Books(){
		super();
		nazvanie=""; 
		kolStranic="";
	}
	public Books(String firma, int year, String name, int n){
		super(firma,year); 
		nazvanie=name; 
		kolStranic=n;
	}
	public void setNazvanie(String name){
		nazvanie=name;
	}
	public String getNazvanie(){
		return nazvanie;
	}
	public void setKolStranic(int n){
		kolStranic=n;
	}
	public int getKolStranic(){
		return kolStranic;
	}
	public String toString(){
		return getIzdatel()+" "+getGogVipuska()+" "+nazvanie+""+kolStranic;
	}
}