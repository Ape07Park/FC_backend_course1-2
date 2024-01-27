package fc00.part2;

public class MovieTest {
    public static void main(String[] args){
        Movie a = new Movie();
        a.name = "avata";
        a.open = "2022.12.14";
        a.char_ = "jake";
        a.gan = "action";
        a.run_time = 192;
        a.age = 12;
        System.out.println(a.name+"\t"+a.open+"\t"+a.char_+"\t"+a.gan+"\t"+a.run_time+"\t"+a.age);
    }

}
