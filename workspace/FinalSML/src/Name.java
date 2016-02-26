public  class Name{
	 String FName = "";
	 String MName = "";
	 String LName = "";
	  public Name(String FN, String MN, String LN)
	  {
		  this.FName = FN;
		  this.LName = LN;
		  this.MName = MN;
	  }
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getMName() {
		return MName;
	}
	public void setMName(String mName) {
		MName = mName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
}