public class Auto {
	private String firm;
	private int maxSpeed;
	public void setFirm(String firma) {
	firm=firma;
 }
public void setMaxSpeed (int speed) {
	maxSpeed=speed;
 }
public int getMaxSpeed() {
	return maxSpeed;
 }
public String getFirm() {
	return firm;
 }
public Auto() {
	firm="без названия";
	maxSpeed=0;
 }
public Auto (String firma, int speed) {
	firm=firma;
	maxSpeed=speed;
}
}
