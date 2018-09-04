public class ConcreteNominal extends Nominal {

    private final int NOMINAL;

    public Nominal(int nominal) {
    	this.NOMINAL = nominal;
    }

    @Override
    protected void withdraw(Exchange transaction) {
        if(transaction.getLeftAmount() >= NOMINAL) {
        	int count = transaction.getLeftAmount() / NOMINAL;
        	int rest = transaction.getLeftAmount() % NOMINAL;
        	transaction.setLeftAmount(rest);
        	transaction.addOperation(count + " x Nominal " + NOMINAL);
        }
    }

    @Override
    protected boolean canWithdraw(Exchange transaction) {
        if(transaction.getLeftAmount() >= NOMINAL && isDepositEnough(transaction))
            return true;
        else
            return false;
    }

    private boolean isDepositEnough(Exchange transaction) {
    	//check is concrete nominal enough in deposit 
    	return true; //mocked
    }
}