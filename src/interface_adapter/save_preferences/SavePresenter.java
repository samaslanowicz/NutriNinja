package interface_adapter.save_preferences;

import use_case.save_preferences.SaveOutputBoundary;
import use_case.save_preferences.SaveOutputData;

public class SavePresenter implements SaveOutputBoundary {
    private final SaveViewModel saveViewModel;

    public SavePresenter(SaveViewModel saveViewModel){
        this.saveViewModel = saveViewModel;
    }
    @Override
    public void prepareSuccessView(SaveOutputData response) {
        // On success, present the user with the success message

        SaveState saveState = saveViewModel.getState();
        this.saveViewModel.setState(saveState);
    }
    public void prepareFailView(SaveOutputData response) {
        // On fail, present the user with the fail message


    }
}
