package entity;

import java.util.ArrayList;

public class Book {

    private String title;
    private int page;
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Character> characters;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setPage(int page){
        this.page=page;
    }

    public int getPage(){
        return page;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacter(ArrayList<Character> characters) {
        this.characters = characters;
    }
}
