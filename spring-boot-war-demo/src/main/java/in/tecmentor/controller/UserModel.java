package in.tecmentor.controller;

import java.io.Serializable;

public class UserModel implements Serializable {

	private Long id;

	private String firstName;

	private String lastName;

	private String email;

	private String password;

	private UserProfileModel userProfile;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserProfileModel getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfileModel userProfile) {
		this.userProfile = userProfile;
	}

}