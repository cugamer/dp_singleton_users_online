package dp_singleton_users_online;

import java.util.LinkedList;

public class UseCurrentUsers {

	public static void main(String[] args) {
		CurrentUsersOnline currentUsersOnline = CurrentUsersOnline.getCurrentUsersOnline();
		LinkedList<Integer> currentList = currentUsersOnline.getCurrentOnlineUserIds();
		
		currentUsersOnline.addUserId(52);
		currentUsersOnline.addUserId(198);
		currentUsersOnline.addUserId(42);
		System.out.println(currentList + " current list after intitial creation and addition");
		
		CurrentUsersOnline currentUsersOnline2 = CurrentUsersOnline.getCurrentUsersOnline();
		LinkedList<Integer> currentList2 = currentUsersOnline.getCurrentOnlineUserIds();
		System.out.println(currentList2 + " current list after attempting to instantiate the class a second time");
		
		currentUsersOnline.addUserId(42);
		currentUsersOnline.addUserId(43);
		System.out.println(currentList + " current list after using the addUserId method");
		
		try{
			currentUsersOnline.removeUserId(199);
		}catch(RuntimeException e){
			System.out.println("Item 199 not found");
		}
		
		try{
			currentUsersOnline.removeUserId(198);
		}catch(RuntimeException e){
			System.out.println("Item 198 not found");
		}
		
		System.out.println(currentList + " current list after using the removeUserId method.");
	}

}
