package fc00.model;

public class MovieVO {
    private String name;
    private String day;
    private String character;
    private String ganre;
    private int runtime;
    private int age;

    // default constructor
    public MovieVO(){

    }

    // 메서드 오버로딩
    public MovieVO(String name, String day, String character, String ganre, int runtime, int age){
        this.name = name;
        this.day = day;
        this.character = character;
        this.ganre = ganre;
        this.runtime = runtime;
        this.age = age;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }

    public void setDay(String day){
        this.day= day;
    }

    public void setCharacter(String character){
        this.character = character;
    }

    public void setGanre(String ganre){
        this.ganre = ganre;
    }

    public void setRuntime(int runtime){
        this.runtime = runtime;
    }

    public void setAge(int age){
        this.age = age;
    }

    // getter
    public String getName(){
        return this.name;
    }

    public String getDay(){
        return this.day;
    }

    public String getCharacter(){
        return this.character = character;
    }

    public String getGanre(){
        return this.ganre = ganre;
    }

    public int getRuntime(){
        return this.runtime;
    }

    public int getAge(){
        return this.age;
    }


    // toString

    @Override
    public String toString() {
        return "MovieVO{" +
                "name='" + name + '\'' +
                ", day='" + day + '\'' +
                ", character='" + character + '\'' +
                ", ganre='" + ganre + '\'' +
                ", runtime=" + runtime +
                ", age=" + age +
                '}';
    }
}
