public class Student extends Person{
    String tipiStudimit;
    int vitiStudimit;
    double pagesaStudimit;

    public Student(String name, String address, String tipiStudimit, int vitiStudimit, double pagesaStudimit) {
        super(name, address);
        this.tipiStudimit = tipiStudimit;
        this.vitiStudimit = vitiStudimit;
        this.pagesaStudimit = pagesaStudimit;
    }


        public String getTipiStudimit() {
        return tipiStudimit;
    }

    public int getVitiStudimit() {
        return vitiStudimit;
    }

    public double getPagesaStudimit() {
        return pagesaStudimit;
    }

    public void setTipiStudimit(String tipiStudimit) {
        this.tipiStudimit = tipiStudimit;
    }

    public void setVitiStudimit(int vitiStudimit) {
        this.vitiStudimit = vitiStudimit;
    }

    public void setPagesaStudimit(double pagesaStudimit) {
        this.pagesaStudimit = pagesaStudimit;
    }

    @Override
    public String toString() {
        return "Studenti [Personi[emer:"+getName()+" ,adresa:"+getAddress()+"],tip studimi:"+this.tipiStudimit+" ,viti:"+this.vitiStudimit+" ,pagesa e vitit:"+this.pagesaStudimit;
    }
}
