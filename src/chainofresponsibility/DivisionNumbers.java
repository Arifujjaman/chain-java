package chainofresponsibility;

public class DivisionNumbers implements Chain {
private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain){
		this.nextInChain=nextChain;
	}
	@Override
	public double calculate(Numbers requests){
		if(requests.getCalculationWanted()=="div"){
			return (requests.getNumber1()/requests.getNumber2());
		}
		
		else{
			return -999.99;
		}
	}

}
