public class PresenterImpl {

    private View view;
    private Model model;

    public Presenter(View view) {
        this.view = view;
        this.model = model; //can be injected by the View
    }

    @Override
    public void onButtonClicked(String input) {
        //do proper action
        view.showProgress(true);
        String response = model.getDescription(input);

        if(response.equals("EMPTY")) {
          view.showProgress(false);      
          view.showError();
        }
        else {
          view.showProgress(false);      
          view.updateText(response);
        }
    }
}