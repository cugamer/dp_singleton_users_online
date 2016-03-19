package dp_singleton_users_online;

public class CurrentUsersOnline {
	private static CurrentUsersOnline currentUsersOnline;
	
	private CurrentUsersOnline(){}
	
	public static CurrentUsersOnline getCurrentUsersOnline(){
		if(currentUsersOnline == null){
			return new CurrentUsersOnline();
		}
		return currentUsersOnline;
	}
}
