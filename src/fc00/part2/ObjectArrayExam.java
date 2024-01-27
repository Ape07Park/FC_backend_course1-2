package fc00.part2;

public class ObjectArrayExam {
    public static void main(String[] args){
        Movie [] a = new Movie[3];
        a[0] = new Movie();
        a[0].name = "starwars";
        a[0].age = 15;
        a[0].char_="skywalker";
        a[0].gan = "SF";
        a[0].run_time = 120;

        a[1] = new Movie();
        a[1].name = "starwars2";
        a[1].age = 15;
        a[1].char_="skywalker2";
        a[1].gan = "SF";
        a[1].run_time = 130;

        a[2] = new Movie();
        a[2].name = "starwars3";
        a[2].age = 15;
        a[2].char_="skywalker3";
        a[2].gan = "SF";
        a[2].run_time = 140;

        for(int i =0;i < a.length; i++){
            System.out.println(a[i].name+"\t"+a[i].age+"\t"+a[i].char_+"\t"+a[i].gan+"\t"+a[i].run_time);
        }

    }
}
