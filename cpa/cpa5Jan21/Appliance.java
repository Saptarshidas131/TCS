class Appliance{
    private int applianceId;
    private String applianceName;
    private String applianceCategory;
    private double applianceAmount;
    public Appliance(int applianceId, String applianceName, String applianceCategory, double applianceAmount){
        this.applianceId = applianceId;
        this.applianceName = applianceName;
        this.applianceCategory = applianceCategory;
        this.applianceAmount = applianceAmount;
    }
    public int getApplianceId(){
        return applianceId;
    }
    public String getApplianceCategory(){
        return applianceCategory;
    }
    public String getApplianceName(){
        return applianceName;
    }
    public void setApplianceAmount(double applianceAmount){
        this.applianceAmount = applianceAmount;
    }
    public double getApplianceAmount(){
        return applianceAmount;
    }
}
