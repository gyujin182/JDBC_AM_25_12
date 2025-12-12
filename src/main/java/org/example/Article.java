package org.example;

import java.time.LocalDateTime;

public class Article {
    private int id;
    private String title;
    private String body;
    private LocalDateTime regdate;
    private LocalDateTime updatedate;

    public LocalDateTime getRegdate() {
        return regdate;
    }

    public void setRegdate(LocalDateTime regdate) {
        this.regdate = regdate;
    }

    public LocalDateTime getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(LocalDateTime updatedate) {
        this.updatedate = updatedate;
    }

    public Article(LocalDateTime regadte, LocalDateTime updatedate, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.regdate = regadte;
        this.updatedate = updatedate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}