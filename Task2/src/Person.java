public class Person {
    private String name;
    private String address;

    public Person() {
        this.name = name;
        this.address = address;
    }

        public Person(String name, String address){
            this.name = name;
            this.address = address;
        }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Personi me [emrin="+this.name+" ka adresen="+this.address+"]";
    }
}
