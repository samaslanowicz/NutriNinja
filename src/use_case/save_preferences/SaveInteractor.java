package use_case.save_preferences;
    public class SaveInteractor implements SaveInputBoundary {
        final SaveDataAccessInterface saveDataAccessObject;
        final SaveOutputBoundary savePresenter;


    public SaveInteractor(SaveDataAccessInterface saveDataAccessObject,
                          SaveOutputBoundary savePresenter){
        this.saveDataAccessObject = saveDataAccessObject;
        this.savePresenter = savePresenter;
    }

    @Override
    public void execute(SaveInputData saveInputData) {
        saveDataAccessObject.save();
        SaveOutputData saveOutputData = new SaveOutputData("Preferences Successfully Saved!");
        savePresenter.prepareSuccessView(saveOutputData);
    }

}
