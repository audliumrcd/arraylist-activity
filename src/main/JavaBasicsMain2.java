package main;

import entity.Book;
import entity.Character;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaBasicsMain2 {
    public static void main(String [] args){

        Book book1 = new Book();
        book1.setTitle("The Lightning Thief");
        book1.setPage(640);


        Book book2 = new Book();
        book2.setTitle("Twilight");
        book2.setPage(850);


        Book book3 = new Book();
        book3.setTitle("New Moon");
        book3.setPage(390);

        Book book4 = new Book();
        book4.setTitle("The Selection");
        book4.setPage(510);

        Character character1 = new Character();
        character1.setName("Claire");

        Character character2 = new Character();
        character2.setName("Ben Foster");

        Character character3 = new Character();
        character3.setName("Anna");

        Character character4 = new Character();
        character4.setName("John");

        Character character5 = new Character();
        character5.setName("Mary");

        Character character6 = new Character();
        character6.setName("Ara");

        Character character7 = new Character();
        character7.setName("Joselle");

        Character character8 = new Character();
        character8.setName("Cabs");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add(character1);
        characters.add(character2);
        book1.setCharacter(characters);

        ArrayList<Character> characters1 = new ArrayList<>();
        characters1.add(character3);
        characters1.add(character4);
        book2.setCharacter(characters1);

        ArrayList<Character> characters2 = new ArrayList<>();
        characters2.add(character5);
        characters2.add(character6);
        book3.setCharacter(characters2);

        ArrayList<Character> characters3 = new ArrayList<>();
        characters3.add(character7);
        characters3.add(character8);
        book4.setCharacter(characters3);

        ArrayList<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        books.stream().forEach(book -> {
            System.out.println("Title: " +book.getTitle() + "\nPages: " +book.getPage());
            book.getCharacters().stream().forEach(character ->
                    System.out.println("Character: " +character.getName()));
                    System.out.println();
        });



//        Iterator itr = libro.iterator();
//        while(itr.hasNext()){
//            Book book = (Book) itr.next();
//            System.out.println("Title: " +book.getTitle() + "\nPages: " +book.getPage() );
//        }

    /*Book book = new Book();
    String title = "Twilight";
    book.setTitle(title);
    book.setPage(409);

    System.out.println("Book Title: ");
    System.out.println(book.getTitle());

    System.out.println("Book Pages: ");
    System.out.println(book.getPage());

    System.out.println("Book Characters: ");

    Character bella = new Character();
    bella.setName("Bella");

    Character edward = new Character();
    edward.setName("Edward");

    Character jacob = new Character();
    jacob.setName("Jacob");



    Character[] characters = book.getCharacters();
        for(int i=0; i<characters.length; i++) {
            if (characters[i] != null) {
                System.out.println(characters[i].getName());
            }
        }*/





    }
}
