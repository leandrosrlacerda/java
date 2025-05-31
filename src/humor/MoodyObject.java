package humor;

public abstract class MoodyObject {

    // retorna o humor
    protected abstract String getMood();

    // pergunta ao objeto como ele se sente
    public void queryMood(){
        System.out.println("I feel " + getMood() + " today.");
    }

}
