package model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")

public class Book {
    private Long id;
    private String name;
    private String code;
    private String price;
    private String authors;
    private String isbn;
    private String publisher;
    private Date publishedOn;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    @Column(length = 15, nullable = false)
    public String getCode() {
        return code;
    }

    @Column(length = 10)
    public String getPrice() {
        return price;
    }

    @Column(nullable = false)
    public String getAuthors() {
        return authors;
    }

    @Column
    public String getIsbn() {
        return isbn;
    }

    @Column
    public String getPublisher() {
        return publisher;
    }

    @Column(name = "published_date")
    public Date getPublishedOn() {
        return publishedOn;
    }
}
