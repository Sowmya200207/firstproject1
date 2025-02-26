package org.example.libraryManagement;

public class Book {
    //Create a Book class with attributes like
    int id;
    String title;
    String author;
    boolean availability;
    //someswarii karanam
// Tannidi Revathi
    public Book(int id, String title, String author, boolean availability) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.availability = availability;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", availability=" + availability +
                '}';
    }
}
