
public abstract class Insurance {
    private  String fuseName;
    private Double fusePrice;
    private String startFinshDate;


    public String getFuseName() {
        return fuseName;
    }

    public void setFuseName(String fuseName) {
        this.fuseName = fuseName.toLowerCase();
    }

    public double getFusePrice() {
        return fusePrice;
    }

    public void setFusePrice(double fusePrice) {
        this.fusePrice = fusePrice;
    }

    public String getStartFinshDate() {
        return startFinshDate;
    }

    public void setStartFinshDate(String startFinshDate) {
        this.startFinshDate = startFinshDate;
    }
}
