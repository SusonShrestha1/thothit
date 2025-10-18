package jdbc;

public class MainUser {

	public static void main(String[] args) {
		Dao dao = new Dao();

		// insert new row
//		dao.insertRecord(106, "Chatur", "chatur@gmail.com");
//		dao.insertRecord(107, "Sisan", "sisan@gmail.com");

		// delete existing row
		// dao.deleteRecord(201);

		// update exiting row
		//dao.updateRecord(106, "suson@gmail.com");
		
		// fetch all the data
		//dao.fetchRecord();
		
//		1.update name and email for id=105
		//dao.updateRecord(105,"Suson", "suson@gmail.com");
		
//		2.print name of all users whose id>102
		//dao.fetchRecord(102);
		
//		3.delete all users whose name is "Suson"
		dao.deleteRecord("Suson");

	}

}
