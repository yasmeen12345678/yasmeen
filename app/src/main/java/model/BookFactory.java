package model;



public class BookFactory {

    public IBookDa getModel()
    {
        return new BookDa();
    }
}

