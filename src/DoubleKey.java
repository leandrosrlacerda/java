public class DoubleKey {

    private String key1, key2;

    // um construtor sem argumentos
    public DoubleKey() {
        key1 = "Key1";
        key2 = "Key2";
    }

    // um construtor com argumentos
    public DoubleKey(String key1, String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    // acessor
    public String getKey1() {
        return key1;
    }

    // modificador
    public void setKey1(String key1) {
        this.key1 = key1;
    }

    // acessor
    public String getKey2() {
        return key2;
    }

    // modificador
    public void setKey2(String key2) {
        this.key2 = key2;
    }


}
