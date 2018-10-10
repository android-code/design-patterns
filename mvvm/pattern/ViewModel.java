public class ViewModel {

    //those fields should be observable
    private String data = "";
    private String input = "";
    
    private Model model;

    public ViewModel() {
        model = new Model();
    }

    private void onButtonClicked() {
        //do proper action
        try {
            data = model.getStatus(input);
        }
        catch(Exception exception) {
            data = "No data has found";
        }
    }
}