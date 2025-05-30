package humor;

public class MoodyObject {

    // retorna o humor
    protected String getMood() {
        return "moody";
    }

    // pergunta ao objeto como ele se sente
    public void queryMood(){
        System.out.println("I feel " + getMood() + " today.");
    }

}
