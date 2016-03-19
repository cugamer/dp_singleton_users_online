package dp_singleton_users_online;

import java.util.LinkedList;

public class CurrentUsersOnline {
	private static CurrentUsersOnline currentUsersOnline;
	private LinkedList<String> currentUserList = new LinkedList<>();
	
	private CurrentUsersOnline(){}
	
	public static CurrentUsersOnline getCurrentUsersOnline(){
		if(currentUsersOnline == null){
			return new CurrentUsersOnline();
		}
		return currentUsersOnline;
	}
	
	public void addUserId(int id){
		String stringId = Integer.toString(id);
		if(!currentUserList.contains(stringId)){
			currentUserList.add(stringId);
		}
	}
	
	public LinkedList<String> getCurrentOnlineUserIds(){
		return currentUserList;
	}
	
	public void removeUserId(int id){
		String stringId = Integer.toString(id);
		if(currentUserList.contains(stringId)){
			currentUserList.remove(stringId);
		}else{
			throw new RuntimeException("User id not found in target collection");
		}
	}
}
