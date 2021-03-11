class Vote{
    private int voterId;
    private String voterName;
    private int voterAge;
    private boolean isVoteCasted;
    private String constituency;
    public Vote(int voterId, String voterName, int voterAge, boolean isVoteCasted, String constituency){
        this.voterId = voterId;
        this.voterName = voterName;
        this.voterAge = voterAge;
        this.isVoteCasted = isVoteCasted;
        this.constituency = constituency;
    }
    public int getVoterId(){
        return voterId;
    }
    public String getVoterName(){
        return voterName;
    }
    public int getVoterAge(){
        return voterAge;
    }
    public boolean getIsVoteCasted(){
        return isVoteCasted;
    }
    public String getConstituency(){
        return constituency;
    }
}
