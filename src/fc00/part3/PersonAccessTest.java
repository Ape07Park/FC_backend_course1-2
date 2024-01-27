package fc00.part3;

public class PersonAccessTest {
    public static void main(String[] args){
        personDTO sung = new personDTO();
        sung.name = "성민";
        sung.age = 1000;
        sung.phone = "010-0000-1111";
        System.out.println(sung.name + "\t" + sung.age+ "\t"+ sung.phone);
    }

}
