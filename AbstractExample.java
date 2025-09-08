package first;

abstract class RBI {
	abstract void calculateInterest();
}

class SBI extends RBI {
	@Override
	void calculateInterest() {
		// TODO Auto-generated method stub

	}
}

public class AbstractExample {
	public static void main(String[] args) {
			SBI objsbi=new SBI();
			objsbi.calculateInterest();
			RBI obj=new RBI();
	}
}
