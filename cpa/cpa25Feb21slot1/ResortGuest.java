class ResortGuest{
    private int guestId;
    private String guestName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String mealOption;
    private double totalBill;
    public ResortGuest(int guestId, String guestName, String dateOfBooking, int noOfRoomsBooked, String mealOption, double totalBill){
        this.guestId = guestId;
        this.guestName = guestName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.mealOption = mealOption;
        this.totalBill = totalBill;
    }
    public int getGuestId(){
        return guestId;
    }
    public String getGuestName(){
        return guestName;
    }
    public String getDateOfBooking(){
        return dateOfBooking;
    }
    public int getNoOfRoomsBooked(){
        return noOfRoomsBooked;
    }
    public String getMealOption(){
        return mealOption;
    }
    public double getTotalBill(){
        return totalBill;
    }
}
