package by.academy.homeworkStart.classes;

public class Book {
    String nameOfBook;
    String author;
    int yearOfIssue;
    int pages;

    public Book(String nameOfBook, String author, int yearOfIssue, int pages) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name of book='" + nameOfBook + '\'' +
                ", author='" + author + '\'' +
                ", year of issue='" + yearOfIssue + '\'' + ", pages='" + pages + '\'' +
                '}';
    }
}    
