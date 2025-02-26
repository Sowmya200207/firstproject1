package org.example.libraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    String libraryAdministrator;
    List<Book> books;
    List<Member>members;

    public Library()
    {

    }
    public Library(String libraryAdministrator) {
        this.libraryAdministrator = libraryAdministrator;
        this.books=new ArrayList<>();
        this.members=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addMember(Member member){
        members.add(member);
    }

    public List<Member> getMembers() {
        return members;
    }
}
