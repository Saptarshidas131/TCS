class Museum{
    private int museumId;
    private String museumName;
    private String museumLocation;
    private int established;
    private double rating;
    private boolean researchCentre;
    public Museum(int museumId, String museumName, String museumLocation, int established, double rating, boolean researchCentre){
        this.museumId = museumId;
        this.museumName = museumName;
        this.museumLocation = museumLocation;
        this.established = established;
        this.rating = rating;
        this.researchCentre = researchCentre;
    }
    public int getMuseumId(){
        return museumId;
    }

    public String getMuseumName() {
        return museumName;
    }

    public String getMuseumLocation() {
        return museumLocation;
    }

    public int getEstablished() {
        return established;
    }

    public double getRating() {
        return rating;
    }

    public boolean isResearchCentre() {
        return researchCentre;
    }
}
