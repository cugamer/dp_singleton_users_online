Current User Online singleton pattern
=====================================

An implementation of the singleton pattern as applied to a class used to track online users.  A single class is implemented, the
CurrentUsersOnline class which hold id numbers for users.  This class can be instantiated only once via a static method and holds
a linked list which can add, remove and list id's for online users.  getCurrentUsersOnline uses the synchronized method to ensure 
the method is threadsafe via double-checked locking.  This is basic practice with the singleton pattern.
