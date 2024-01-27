package fc00.Algo.Class;
public class Movie {
    private String title;
    private String date;
    private String character;
    private String ganre;
    private int runtime;
    private int mark;

    public Movie(){

    }
    public Movie(String title, String date, String character, String ganre, int runtime, int mark){
        this.title = title;
        this.date = date;
        this.character = character;
        this.ganre = ganre;
        this.runtime = runtime;
        this.mark = mark;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setRuntime(int runtime){
        this.runtime = runtime;
    }
    public int getRuntime(){
        return runtime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", character='" + character + '\'' +
                ", ganre='" + ganre + '\'' +
                ", runtime=" + runtime +
                ", mark=" + mark +
                '}';
    }
}
