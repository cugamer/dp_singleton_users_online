package dp_singleton_users_online;

import java.util.LinkedList;

public class UseCurrentUsers {

	public static void main(String[] args) {
		CurrentUsersOnline currentUsersOnline = CurrentUsersOnline.getCurrentUsersOnline();
		
		currentUsersOnline.addUserId(52);
		currentUsersOnline.addUserId(198);
		currentUsersOnline.addUserId(42);
		LinkedList<String> currentList = currentUsersOnline.getCurrentOnlineUserIds();
		System.out.println(currentList);
		currentUsersOnline.addUserId(42);
		currentUsersOnline.addUserId(43);
		System.out.println(currentList);
		try{
			currentUsersOnline.removeUserId(199);
		}catch(RuntimeException e){
			System.out.println("Item 199 not found");
		}
		
		System.out.println(currentList);
	}

}
