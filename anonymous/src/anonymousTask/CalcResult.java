package anonymousTask;

public class CalcResult {
	private int sumResult;
	private int mulResult;
	private int subResult; 
	private double divResult;
	
	public CalcResult() {;}

	public CalcResult(int sumResult, int mulResult, int subResult, double divResult) {
		this.sumResult = sumResult;
		this.mulResult = mulResult;
		this.subResult = subResult;
		this.divResult = divResult;
	}

	public int getSumResult() {
		return sumResult;
	}

	public void setSumResult(int sumResult) {
		this.sumResult = sumResult;
	}

	public int getMulResult() {
		return mulResult;
	}

	public void setMulResult(int mulResult) {
		this.mulResult = mulResult;
	}

	public int getSubResult() {
		return subResult;
	}

	public void setSubResult(int subResult) {
		this.subResult = subResult;
	}

	public double getDivResult() {
		return divResult;
	}

	public void setDivResult(double divResult) {
		this.divResult = divResult;
	}
	
}
