public class Book {
    String title;
    Double publicationDate;
    String author;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(Double publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book info [title:" + this.title + ", publicationDate:" +
                this.publicationDate + ", author:" + this.author+"]";
    }
}
