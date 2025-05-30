package humor;

public class SadObject extends MoodyObject{

    // retorna o humor
    protected String getMood() {
        return "sad";
    }

    public void cry(){
        System.out.println("boo hoo");
    }
}
