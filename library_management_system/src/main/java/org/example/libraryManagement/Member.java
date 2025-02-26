package org.example.libraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Member {
    int memberId;
    String memberName;
    List<String> borrowedBooks;

    Book book = new Book();

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.borrowedBooks = new ArrayList<>();
    }

    public Member() {

    }


    public void borrowBooks(int bookId){
        if(book.availability){
            borrowedBooks.add(String.valueOf(book));
            book.availability=false;
        }
        else{
            System.out.println("Book is not available");
        }
    }

    public void returnBooks(String bookName){
        System.out.println("Book returned"+bookName);
           book.availability=true;

    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
