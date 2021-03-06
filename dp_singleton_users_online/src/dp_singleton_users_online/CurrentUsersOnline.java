package dp_singleton_users_online;

import java.util.LinkedList;

public class CurrentUsersOnline {
	private volatile static CurrentUsersOnline currentUsersOnline;
	private LinkedList<Integer> currentUserList = new LinkedList<>();
	
	private CurrentUsersOnline(){}
	
	public static CurrentUsersOnline getCurrentUsersOnline(){
		if(currentUsersOnline == null){ 			 // Check for an instance, if there is none enter the synch block
			synchronized(CurrentUsersOnline.class){  // Synch on the first go through
				if(currentUsersOnline == null){      // Once synched across threads, check for an instance again and create if needed
					return new CurrentUsersOnline();
				}
			}
		}
		return currentUsersOnline;
	}
	
	public void addUserId(int id){
		if(!currentUserList.contains((Integer) id)){
			currentUserList.add((Integer) id);
		}
	}
	
	public LinkedList<Integer> getCurrentOnlineUserIds(){
		return currentUserList;
	}
	
	public void removeUserId(int id){
		if(currentUserList.contains((Integer) id)){
			currentUserList.remove((Integer) id);
		}else{
			throw new RuntimeException("User id not found in target collection");
		}
	}
}
