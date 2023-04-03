package com.guilhermemendes.workshopspringbootmongodb.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CommentDTO implements Serializable {
    private String text;
    private Date date;

    private AuthorDTO author;

    public CommentDTO(){

    }



    public CommentDTO(String text, Date date, AuthorDTO author) {
        super();
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommentDTO that)) return false;

        if (!Objects.equals(text, that.text)) return false;
        if (!Objects.equals(date, that.date)) return false;
        return Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
