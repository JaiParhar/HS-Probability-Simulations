
public class RunData {
	
	/*
	 Spinner Result Index:
	 0 = Black
	 1 = Red
	 2 = Club
	 3 = Spade
	 4 = Heart
	 5 = Diamond
	 6 = Choose Rank
	 7 = Choose Rank and Colour
	*/
	
	int spinnerResult;
	int failsBeforeSuccess;
	boolean houseWin;
	
	public RunData() {}
	public RunData(int sR, int fBS, boolean hW) {
		spinnerResult = sR;
		failsBeforeSuccess = fBS;
		houseWin = hW;
	}
	
	public void setSpinnerResult(int sR) { spinnerResult = sR; }
	public void setFailsBeforeSuccess(int fBS) { failsBeforeSuccess = fBS; }
	public void setHouseWin(boolean hW) {  houseWin = hW; }
	
	public int getSpinnerResult() { return spinnerResult; }
	public int getFailsBeforeSuccess() { return failsBeforeSuccess; }
	public boolean getHouseWin() { return houseWin; }
	
}
