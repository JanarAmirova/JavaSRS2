package oslt;
import com.mysql.cj.jdbc.Driver;
import subject.Abonent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TestDB {

	public static void main(String[] args) {
		System.out.println("Loading driver...");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
		    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
		}
		String url = "jdbc:mysql://localhost:3306/knigimagazin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&verifyServerCertificate=false&useSSL=TRUE";
		String username = "Zhanar";
		String password = "123456";
		Connection cn = null;
		try (Connection cn1 = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		   // try { // 1 ����
				//cn = DriverManager.getConnection(url, username, password);
					//cn = DriverManager.getConnection(url, prop);
		    	cn = DriverManager.getConnection(url, username, password);
				Statement st = null;
				try { // 2 ����
					st = cn1.createStatement();
					ResultSet rs = null;
					try { // 3 ����
						rs = st.executeQuery("SELECT * FROM books");
						System.out.println("result table ...");
						ArrayList lst = new ArrayList<>();
						while (rs.next()) {
							
							ArrayList abonent= new ArrayList();
							int id = rs.getInt(1);
							String athname = rs.getString(2);
							String bookname = rs.getString(3);
							String genre = rs.getString(4);
							int datepubl = rs.getInt(5);
							int age = rs.getInt(6);
							//System.out.println("name "+name);
							abonent.add(rs.getString(1));
							abonent.add(rs.getString(2));
							abonent.add(rs.getString(3));
							abonent.add(rs.getString(4));
							abonent.add(rs.getString(5));
							abonent.add(rs.getString(6));
							lst.add(abonent);
						}
						if (lst.size() > 0) {
							System.out.println(lst);
						} else {
							System.out.println("Not found");
						}
					} finally { // ��� 3-�� ����� try
							if (rs != null) { // ��� �� ������ ResultSet
								rs.close();
							} else {
								System.err.println("������ �� ����� ������ �� ��");
								}
						}
				} finally {// 2 ����
						if (st != null) { // ��� 2-�� ����� try
							st.close();
						} else {
								System.err.println("Statement �� ������");
							}
					}
				} 
		 catch (SQLException e) {
			System.out.println("Database disconnected!");
			System.out.println("SQL Exception: "+ e.toString());
			e.getStackTrace();
		} finally {
				if (cn != null) {
					try {
						cn.close();
						System.out.println("�onnection close!");
					} catch (SQLException e) {
							System.err.println("�onnection close error: " + e);
					}
				}
		}
	}
}

