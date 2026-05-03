package common;

public class Book{
    private String title;
    private String author;
    private int pageCount;

    //constructor
    public Book(String title,String author,int pageCount){
        this.author=author;
        this.title=title;
        this.pageCount=pageCount;
    }

    public void read(){
        System.out.println("Reading book with title:"+this.title+" having page count:"+this.pageCount+" by:"+this.author);
    }
}
