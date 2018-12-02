
public class RunData {
	
	/*
	 Spinner Result Index:
	 0 = Black
	 1 = Red
	 2 = Club
	 3 = Spade
	 4 = Diamond
	 5 = Heart
	 6 = Choose Rank
	 7 = Choose Rank and Colour
	*/
	
	int failsBeforeSuccess;
	boolean houseWin;
	
	public RunData() {}
	public RunData(int fBS, boolean hW) {
		failsBeforeSuccess = fBS;
		houseWin = hW;
	}
	
	public void setFailsBeforeSuccess(int fBS) { failsBeforeSuccess = fBS; }
	public void setHouseWin(boolean hW) {  houseWin = hW; }
	
	public int getFailsBeforeSuccess() { return failsBeforeSuccess; }
	public boolean getHouseWin() { return houseWin; }
	
}
