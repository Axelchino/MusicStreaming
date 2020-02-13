package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samantharain
 */
import java.util.*;
import java.io.*;


public class User {
    
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private static int numOfUsers;
	private int userID;
	private String password;
	private ArrayList<Playlist> playlists;
	
	public User(String fname, String lname, String email, String username, String password) {
                this.firstName = fname;
                this.lastName = lname;
                this.email = email;
		this.username = username;
		this.password = password;
		this.userID = numOfUsers++;
		this.playlists = new ArrayList();
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public void addPlaylist(Playlist playlist) {
		this.playlists.add(playlist);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public int getNumOfUsers() {
		return numOfUsers;
	}
	
	public boolean checkEmail(String email) {
		return this.email.equals(email);
	}
	
	public boolean checkUsername(String username) {
		return this.username.equals(username);
	}
	
	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}
        
        public void addPlaylist(String name) {
            
             for(Playlist p : playlists) {
                if(name.equals(p.getName())) {
                    System.out.println("ERROR: A PLAYLIST WITH THE NAME " + name + " ALREADY EXIST!");
                     return;
                }
            }
            playlists.add(new Playlist(name));
        }
	
        
        public void addSong(Music song, String p_name) {
            
            for(Playlist p : playlists) {
                if(p_name.equals(p.getName())) {
                    p.addSong(song);
                }
                return;
            }
            System.out.println("ERROR: A PLAYLIST " + p_name + " DOES NOT EXIST!");
        }
        
        
        public void removePlaylist(String name) {
            
            for(Playlist p : playlists) {
                if(p.getName().equals(name)) {
                    playlists.remove(p);
                }
                return;
            }
            System.out.println("ERROR: A PLAYLIST " + name + " DOES NOT EXIST!");
            
        }
}