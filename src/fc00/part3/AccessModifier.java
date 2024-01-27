package fc00.part3;

import fc00.model.MemberDTO;

public class AccessModifier{
    public static void main(String[] args){
        MemberDTO a = new MemberDTO();
        a.name = "sung";
        a.phone_number = "010-2222-2222";
        /* a.age = 1000;  접근 불가 */
        System.out.println(a.name + "\t"+ a.phone_number);
        a.eat();
    }
}
