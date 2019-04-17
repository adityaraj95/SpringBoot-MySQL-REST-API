package com.ac968.Library.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class books {

    @Id
    @Column(name="Barcode")
    private Integer Barcode;

    @Column(name="B_title")
    private String title;

    @Column(name="ISBN")
    private Long ISBN;

    @Column(name="B_pages")
    private Integer Pages;

    @Column(name="Status")
    private Integer status;

    @Column(name="B_author")
    private String author;

    @Column(name="Comments")
    private String comment;


    public books() {
    }

    public Integer getBarcode() {
        return Barcode;
    }

    public void setBarcode(Integer barcode) {
        Barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getPages() {
        return Pages;
    }

    public void setPages(Integer pages) {
        Pages = pages;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}


