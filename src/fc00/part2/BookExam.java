package fc00.part2;

public class BookExam {
    public static void main(String args[]){
        Book b = new Book();
        b.title = "java";
        b.price = 30000;
        b.company = "한빛";
        b.author = "박성민";
        b.page = 300;
        b.isbn = "1111111";
        System.out.println(b.title+"\t"+b.price+"\t"+b.company+"\t"+b.author+"\t"+b.page+"\t"+b.isbn);
    }
}
