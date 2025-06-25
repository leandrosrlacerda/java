package humor;

public class SadObject extends MoodyObject {

    // redefine o humor da classe
    @Override
    protected String getMood() {
        return "sad";
    }

    // especialização
    public void cry() {
        System.out.println("boo hoo");
    }
}
