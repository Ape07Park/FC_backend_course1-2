package fc00.part2;

public class ObjectArrayTest {
    public static void main(String [] args){
        Book [] a = new Book[3]; //객체 배열 3개 생성
        a[0] = new Book(); //배열의 0번째에 들어가는 객체 생성
        a[0].title = "java";
        a[0].price = 30000;
        a[0].company = "한빛";
        a[0].author = "박성민";
        a[0].page = 300;
        a[0].isbn = "1111111";
        System.out.println(a[0].title+"\t"+a[0].price+"\t"+a[0].company+"\t"+a[0].author+"\t"+a[0].page+"\t"+a[0].isbn);

        a[1] = new Book();
        a[1].title = "python";
        a[1].price = 30000;
        a[1].company = "한빛";
        a[1].author = "박성민";
        a[1].page = 300;
        a[1].isbn = "1111112";
        System.out.println(a[1].title+"\t"+a[1].price+"\t"+a[1].company+"\t"+a[1].author+"\t"+a[1].page+"\t"+a[1].isbn);

        a[2] = new Book();
        a[2] = new Book();
        a[2].title = "javascript";
        a[2].price = 30000;
        a[2].company = "한빛";
        a[2].author = "박성민";
        a[2].page = 300;
        a[2].isbn = "1111113";
        System.out.println(a[2].title+"\t"+a[2].price+"\t"+a[2].company+"\t"+a[2].author+"\t"+a[2].page+"\t"+a[2].isbn);
        // 반복문
        for(int i =0; i < a.length; i++){
            System.out.println(a[i].title+"\t"+a[i].price+"\t"+a[i].company+"\t"+a[i].author+"\t"+a[i].page+"\t"+a[i].isbn);
        }
    }
}
