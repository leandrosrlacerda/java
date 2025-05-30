package humor;

public class HappyObject extends MoodyObject {

    // retorna o humor
    protected String getMood(){
        return "happy";
    }

    public void laugh(){
        System.out.println("hahaha");
    }
}
