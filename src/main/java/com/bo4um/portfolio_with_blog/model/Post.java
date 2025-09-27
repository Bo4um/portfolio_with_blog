package com.bo4um.portfolio_with_blog.model;

public class Post {
    private final Long id;
    private final String title;
    private final String content;

    public Post(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Long getId() {
        return id;
    }
}
