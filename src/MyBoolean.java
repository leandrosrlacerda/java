public class MyBoolean {

    public static final Class<Boolean> TYPE = Boolean.TYPE;

    private boolean value;

    public MyBoolean(){
        value = false;
    }

    public MyBoolean(boolean value){
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public static boolean getBoolean(String name){
        return Boolean.getBoolean(name);
    }

    public static MyBoolean valueOf(String s){
        return new MyBoolean(Boolean.getBoolean(s));
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyBoolean) {
            return ((MyBoolean) obj).value == value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(value);
    }

    public static void main(String[] args) {

        MyBoolean myBoolean1 = new MyBoolean();
        System.out.println(myBoolean1);
        MyBoolean myBoolean = new MyBoolean(true);
        System.out.println(myBoolean.isValue());
        myBoolean.setValue(false);
        System.out.println(myBoolean.isValue());
        System.out.println(MyBoolean.getBoolean("myBoolean"));
        System.out.println(MyBoolean.valueOf("myBoolean"));
    }

}
