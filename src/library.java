import java.util.Scanner;

class library_item{
    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
class Book extends library_item
{
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;

    }
}
class Magazine extends library_item
{
    void issue_date(int issue)
    {
        System.out.println("Issue:"+issue);

    }
}
class library{
    public static void main(String[] args) {
        Magazine magazine=new magazine();
        Book book=new book();
        Scanner scanner=new Scanner(System.in);
        int id,issue;
        String author,title;
        id=scanner.nextInt();
        title=scanner.next();
        issue=scanner.nextInt();
        author=scanner.next();
        book.setId(id);
        System.out.println("Id: "+book.getId());
        book.setTitle(title);
        System.out.println("Title: "+book.getTitle());
        book.setAuthor(author);
        System.out.println("Author: "+book.getAuthor());
        magazine.issue_date(issue);

    }
}
