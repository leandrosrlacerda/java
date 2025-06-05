public class Polimorfismo {

    public static class PersonalityObject {
        public String speak() {
            return "I am an Object.";
        }

        public void makeSpeak(PersonalityObject obj) {
            System.out.println(obj.speak());
        }

    }

    public static class PessimisticObject extends PersonalityObject {
        public String speak() {
            return "The glass is half empty.";
        }

    }

    public static class OptimisticObject extends PersonalityObject {
        public String speak() {
            return "The glass is half full.";
        }

    }

    public static class IntrovertedObject extends PersonalityObject {
        public String speak() {
            return "hi";
        }
    }

    public static class ExtrovertedObject extends PersonalityObject {
        public String speak() {
            return "Hello, blah blah blah, did you know that blah blah blah.";
        }
    }

    public static void main(String[] args) {

        PersonalityObject personality = new PersonalityObject();
        PessimisticObject pessimistic = new PessimisticObject();
        OptimisticObject optimistic = new OptimisticObject();
        IntrovertedObject introverted = new IntrovertedObject();
        ExtrovertedObject extroverted = new ExtrovertedObject();

        // a capacidade de subtituição permite fazer o seguinte
        PersonalityObject[] personalities = new PersonalityObject[5];
        personalities[0] = personality;
        personalities[1] = pessimistic;
        personalities[2] = optimistic;
        personalities[3] = introverted;
        personalities[4] = extroverted;

        int count = 0;
        for (PersonalityObject p : personalities) {
            System.out.println("Personalities[" + count + "] speaks: " + p.speak());
            count++;
        }
        System.out.println("");

        PersonalityObject obj = new PersonalityObject();
        obj.makeSpeak(pessimistic);
        obj.makeSpeak(optimistic);
        obj.makeSpeak(introverted);
        obj.makeSpeak(extroverted);

    }

}
