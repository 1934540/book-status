public class Book {
    String title;
    Status status;

    public Book(String book) {
        this.title=book;
        this.status=Status.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
