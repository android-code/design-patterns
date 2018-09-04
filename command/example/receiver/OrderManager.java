public class OrderManager {

    //constructors and fields

    public void scheduleStandingOrder(String recipient, int amount, int intervalDays) {
        //do action
        Log.log("Standing order to: " + recipient + " for: " + amount + " with interval: " + intervalDays + " days");
        //save in history
    }

    public void transferMoney(String recipient, int amount, String title) {
        //do action
        Log.log("Transfer to: " + recipient + "for: " + amount + " with title: " + title);
        //save in history
    }

    public void takeLoan(int amount, int repaymentDays) {
        //do action
        Log.log("Loan for: " + amount + " to repayment until: " + manager.getRepaymentDate(repaymentDays));
        //save in history
    }

    public String getRepaymentDate(int repaymentDays) {
        return LocalDateTime.now().plusDays(repaymentDays).toString();
    }
}