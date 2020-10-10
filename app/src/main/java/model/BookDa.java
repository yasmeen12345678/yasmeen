package model;

import java.util.ArrayList;
import java.util.List;

class BookDa implements IBookDa {
    private ArrayList<Book> books = new ArrayList<>();

    public BookDa()
    {
        books.add(new Book(300,"java", "programming"));
        books.add(new Book(200,"c", "programming"));
    }

    public List<Book> getBooks (String cat)
    {
        ArrayList<Book> data = new ArrayList<>();
        for (Book b: books)
        {
            if(b.getCategory().equals(cat))
            {
                data.add(b);
            }

        }
        return data;
    }

    @Override
    public String[] getCat() {
        String[] cats = {"java","programming","C#"};
        return cats;
    }
}

