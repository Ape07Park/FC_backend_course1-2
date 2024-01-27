package fc00.model;

public class CarDAO {
    // C R U D
    // create = insert(저장)
    // SQL insert 쿼리
    public void carInsert(CarDTO car){
        // DB 연결, SQL insert 쿼리
        System.out.println("car 정보가 DB에 저장됨");
    }

    public void carSelect(CarDTO car){
        // DB 연결, SQL select 쿼리
        System.out.println("car 정보가 DB에서 선택됨");
    }
}
