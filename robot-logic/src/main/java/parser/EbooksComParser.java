package parser;

import book.Book;

import java.util.List;


public class EbooksComParser implements Parser {

    // dummy for now...

    @Override
    public List<Book> parse(String link) {
        System.out.println(link);
        return null;
    }
}