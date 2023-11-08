package interface_adapter.save_preferences;

import entity.NutrientRange;
import use_case.save_preferences.SaveInputBoundary;
import use_case.save_preferences.SaveInputData;

public class SaveController{
    final SaveInputBoundary saveUseCaseInteractor;
    public SaveController(SaveInputBoundary saveUseCaseInteractor) {
        this.saveUseCaseInteractor = saveUseCaseInteractor;
    }
    public void execute(NutrientRange nutrientRange, String healthPreferences,
                        String dishType) {
        SaveInputData saveInputData = new SaveInputData(nutrientRange, healthPreferences, dishType);
        saveUseCaseInteractor.execute(saveInputData);
    }
}
