public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    private void actionRequest() {
        //controller catches some event like click on the button
        //do proper action
        String input = view.getInput();
        try {
            boolean success = model.addData(input);
            if(success)
                view.updateText();
            else
                view.showError("Task has not been added.").
        }
        catch(Exception exception) {
            view.showError("Unexpected error occured.").
        }
    }
}