package org.example.libraryManagement;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Book book =new Book();

        Member m1=new Member();

        Library library=new Library("Admin");

        library.addBook(new Book(1,"Head First Java","Kathy Sierra",true));
        library.addBook(new Book(2,"Effective Java","Bloch Joshua",true));
        library.addBook(new Book(3,"Core Java","Cay Horstmann",true));
        library.addBook(new Book(4,"Head First Object","Brett D. McLaughlin",true));
        library.addBook(new Book(5,"Java Performance","Scott Oaks",true));

        Member member1 = new Member(101, "Someswari");
        library.addMember(member1);

        Member member2 = new Member(102, "apple");
        library.addMember(member2);

        while(true) {
            System.out.println("1.To see the books");
            System.out.println("2.To borrow a book");
            System.out.println("3.To return a book");
            System.out.println("4.exit");
            System.out.println("choose the option:");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("The books available in the library: " + library.getBooks());
                    break;
                case 2:
                    System.out.println("To borrow a book");
                    System.out.println("Enter your id:");
                    int id=sc.nextInt();
                    List<Member> members = library.getMembers();

                    for(Member member:members)
                    {
                        if(member.memberId==id){
                            System.out.println("Enter the id of the book you want:");
                            int bookId=sc.nextInt();
                            m1.borrowBooks(bookId);
                            break;
                        }
                        else{
                            System.out.println("You are not a member of library");
                            break;
                        }
                    }


                default:
            }
        }


//        member1.borrowBooks(library.books.get(0));
//        member1.borrowBooks(library.books.get(4));
//
//        member1.returnBooks("Head First Java");
//
//        member2.borrowBooks(library.books.get(0));

       // System.out.println(library.books);
        //System.out.println(library.members);



    }
}
