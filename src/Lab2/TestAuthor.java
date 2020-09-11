package Lab2;

public class TestAuthor {
    public static void main(String args[]) {
        Author author = new Author("Mac", "caoducmanh2411999@gmail.com", 'M');
        System.out.println(author.toString());
        author.setEmail("caoducmanhluu@gmail.com");
        System.out.println(author.toString());
    }
}
