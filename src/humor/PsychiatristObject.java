package humor;

public class PsychiatristObject
{
    // usa polimorfismo de inclusao para examinar todos os objetos HUMOR genericamente
    public void examine(MoodyObject object){
        System.out.println("Tell me, object, how do you fell today?");
        object.queryMood();
        System.out.println();
    }

    // usa sobrecarga para observar objetos especificamente, mas com um metodo chamado genericamente
    public void observe(SadObject sadObject){
        sadObject.cry();
        System.out.println("Hmm... very, very interesting. Something makes this object sad. ");
        System.out.println();
    }
    // usa sobrecarga
    public void observe(HappyObject happyObject){
        happyObject.laugh();
        System.out.println("Hmm... very, very interesting. This object seems very happy.");
        System.out.println();
    }
}
