package humor;

public class Main {

    public final static void main(String[] args) {

        SadObject sadObject = new SadObject();
        HappyObject happyObject = new HappyObject();

        System.out.println("");
        System.out.println("How does the sad object feel today? ");
        sadObject.queryMood(); // note que a sobreposição muda o humor
        sadObject.cry();
        System.out.println("");
        System.out.println("How does the happy object feel today? ");
        happyObject.queryMood();
        happyObject.laugh();
        System.out.println("");

        MoodyObject moodyObject = new SadObject();
        MoodyObject moodyObject2 = new HappyObject();
        PsychiatristObject psychiatristObject = new PsychiatristObject();
        psychiatristObject.examine(moodyObject);
        psychiatristObject.examine(moodyObject2);
        psychiatristObject.observe((SadObject) moodyObject);
        psychiatristObject.observe((HappyObject) moodyObject2);

    }
}
