package com.MyNetwork;

public class Post {
    private long timestamp;
    private String text;
    private int likes;

    public Post(long timestamp, String text, int likes) {
        // Initialize post
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public void like() {
        // Increment likes
    }

  
    @Override
    public String toString() {
        return "Post{" +
                "timestamp=" + timestamp +
                ", text='" + text + '\'' +
                ", likes=" + likes +
                '}';
    }

}
