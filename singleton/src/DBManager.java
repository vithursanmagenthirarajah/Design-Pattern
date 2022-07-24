
public class DBManager {
	public static volatile DBManager dbmanager =new DBManager();
	public static volatile Connection connection;

	private DBManager() {
	  if (dbmanager != null) {
		  System.out.println("Please use get DBManager method!");
	  }
	}

	public static DBManager getDbmanager() {
		if(dbmanager ==null) {
			synchronized (DBManager.class) {
				if(dbmanager == null) {
					dbmanager =new DBManager();
				}
			}
		}
		return dbmanager;
	}

	
}
