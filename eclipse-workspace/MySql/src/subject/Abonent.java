package subject;

import java.io.Serializable;

public abstract class Abonent implements Serializable, Cloneable {
	private int id;
	private String athname;
	private String bookname;
	private String genre;
	private int datepubl;
	private int age;
	
	public void Abonent() {
	}
	public void Abonent(int id, String athname,String bookname,String genre,int datepubl, int age) {
	this.id = id;
	this.athname = athname;
	this.bookname = bookname;
	this.datepubl = datepubl;
	this.age = age;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}

}
