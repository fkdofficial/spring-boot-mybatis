package com.sayone.mybatis.springbootmybatis.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

//@MapperScan
@Entity
@Table(name = "book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;
    @Column(nullable = false)
    private String bookName;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String publisher;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private String bookStatus;
    @Column(nullable = false)
    private String bookLink;
    @Column(nullable = false)
    private long yearOfPublication;
    @Column(nullable = false)
    private String bookDescription;
//    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private PublisherEntity pid;

    public BookEntity() {
    }

    public BookEntity(long bookId, String bookName, String author, String publisher, String genre, String bookStatus, String bookLink, long yearOfPublication, String bookDescription) {
        this.bookId= bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.bookStatus = bookStatus;
        this.bookLink = bookLink;
        this.yearOfPublication = yearOfPublication;
        this.bookDescription = bookDescription;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookLink() {
        return bookLink;
    }

    public void setBookLink(String bookLink) {
        this.bookLink = bookLink;
    }

    public long getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(long yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public PublisherEntity getPid() {
        return pid;
    }

    public void setPid(PublisherEntity pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", genre='" + genre + '\'' +
                ", bookStatus='" + bookStatus + '\'' +
                ", bookLink='" + bookLink + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", bookDescription='" + bookDescription + '\'' +
                '}';
    }
}
