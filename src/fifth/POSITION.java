package fifth;

public enum POSITION {
    DIRECTOR(2),
    WORKER(1);

    private int rate;

    POSITION(int rate) {
        this.rate = rate;
    }

    public int getRate(){
        return rate;
    }
}
