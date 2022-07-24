
public class Application {

	public static void main(String[] args) {
		DBManager dbmanager =DBManager.getDbmanager();
		System.out.println(dbmanager);
		
		DBManager dbmanager1 =DBManager.getDbmanager();
		System.out.println(dbmanager1);

	}

}
