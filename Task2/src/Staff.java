public class Staff extends Person{
    String specializimi;
    double paga;

    public Staff(String name, String address, String specializimi, double paga){
        super(name, address);
        this.specializimi = specializimi;
        this.paga = paga;
    }

    public String getSpecializimi() {
        return specializimi;
    }

    public double getPaga() {
        return paga;
    }

    public void setSpecializimi(String specializimi) {
        this.specializimi = specializimi;
    }

    public void setPaga(double paga) {
        this.paga = paga;
    }

    @Override
    public String toString() {
        return "Stafi["+"Personi[emri:"+getName()+" ,me adrese:"+getAddress()+"],me specializim:"+this.specializimi+" ,pagese:"+this.paga+"]";

    }
}
