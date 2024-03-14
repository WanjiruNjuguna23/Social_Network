package com.MyNetwork;

import java.util.*;

public class User {
    private String displayName;
    private String username;
    private String password;
    private ArrayList<Post> posts;
    private HashSet<User> followers;
    private HashSet<User> followedUsers;

    public User(String displayName, String username, String password) {
        // Initialize user
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Set<User> getFollowers() {
        return followers;
    }

    public Set<User> getFollowedUsers() {
        return followedUsers;
    }

    public void addPost(Post post) {
        // Add post to user's posts
    	
    }

    public void followUser(User user) {
        // Follow a user
    }

    private void addFollower(User user) {
        // Add a follower
    }

    @Override
    public String toString() {
        return "User{" +
                "displayName='" + displayName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
