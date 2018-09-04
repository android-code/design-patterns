public abstract class Nominal {

    protected Nominal successor;
    //some fields

    protected abstract void withdraw(Exchange transaction);
    protected abstract boolean canWithdraw(Exchange transaction);

    public void setSuccessor(Nominal successor) {
        this.successor = successor;
    }

    public Exchange calculate(Exchange transaction) {
        if(canWithdraw(transaction))
            withdraw(transaction);
        if(transaction.getLeftAmount() > 0 && successor != null)
            return successor.calculate(transaction);
        else
            return transaction;
    }

    //some other methods
}