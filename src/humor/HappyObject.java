package humor;

public class HappyObject extends MoodyObject {

    // redefine o humor
    @Override
    protected String getMood() {
        return "happy";
    }

    // especialização
    public void laugh() {

        System.out.println("hahaha");
    }
}
