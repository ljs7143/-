public class OracleDao implements DataAccessObject{
    // public void dbWork(DataAccessObject dao){
    //     select();
    //     insert();
    //     update();
    //     delete();
    // }
    
    public void select(){
        System.out.println("Oracle에서 검색");
    }
    public void insert(){
        System.out.println("Oracle에서 삽입");
    }
    public void update(){
        System.out.println("Oracle에서 수정");
    }
     
    public void delete(){
        System.out.println("Oracle에서 삭제");
    }
}
