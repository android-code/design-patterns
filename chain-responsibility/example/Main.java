public class Main {

    public static void main() {
        //create default nominals scheme
        Nominal nominal100 = new ConcreteNominal(100);
        Nominal nominal50 = new ConcreteNominal(50);
        Nominal nominal20 = new ConcreteNominal(20);
        Nominal nominal10 = new ConcreteNominal(10)
        Nominal nominal5 = new ConcreteNominal(5);
        Nominal nominal2 = new ConcreteNominal(2);
        Nominal nominal1 = new ConcreteNominal(1);

        //cashier gets client's transaction
        Exchange transaction1 = new Exchange(1500, Currency.PLN, Currency.USD);

        //cashier defines default nominals scheme
        nominal100.setSuccessor(nominal50);
        nominal50.setSuccessor(nominal20);
        nominal20.setSuccessor(nominal10);
        nominal10.setSuccessor(nominal5);
        nominal5.setSuccessor(nominal2);
        nominal2.setSuccessor(nominal1);

        //simulate transaction
        Exchange result1 = nominal100.calculate(transaction1);
        if(result.getLeftAmount() == 0) {
            //success - can withdraw
        }
        else {
            //fail - can not withdraw this transaction based on current nominals scheme
        }
        //show nominals to withdraw
        result.getOperations();
        //for course 3.67 the result is:
        //4x100, 1x5, 1x2, 1x1

        //cashier gets new transaction
        Exchange transaction2 = new Exchange(5000, Currency.USD, Currency.GBP);
        //nominals GBP are the same like USD so no need to update the chain

        //in deposit there is a lot of nominal 1
        //so cashier wants to spent nominal 1 before nominal 5 and 2
        nominal10.setSuccessor(nominal1);
        nominal1.setSuccessor(nominal2);
        nominal2.setSuccessor(nominal5);

        //simulate transaction like above
        nominal100.calculate(transaction2);
        //for course 0.761 and 100x20, 50x30, 10x20 nominals available in deposit to withdraw the result is:
        //20x100, 30x50, 10x20, 10x10, 5x1 
    }
}