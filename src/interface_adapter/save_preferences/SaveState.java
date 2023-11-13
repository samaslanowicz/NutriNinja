package interface_adapter.save_preferences;
import java.util.ArrayList;
import java.util.List;

import entity.NutrientRange;

public class SaveState {
    private NutrientRange nutrientRange = new NutrientRange(new Range(), new Range(), new Range(), new Range());
    private List<String> healthPreferences = new ArrayList<>();
    private List<String> dishType = new ArrayList<>();

    public SaveState(SaveState copy) {
        nutrientRange = copy.nutrientRange;
        healthPreferences = copy.healthPreferences;
        dishType = copy.dishType;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public SaveState() {}

    public NutrientRange getNutrientRange() {
        return nutrientRange;
    }

    public List<String> getHealthPreferences() {
        return healthPreferences;
    }

    public List<String> getDishType() {
        return dishType;
    }

    public void setNutrientRange(NutrientRange nutrientRange) {
        this.nutrientRange = nutrientRange;
    }

    public void setHealthPreferences(List<String> healthPreferences) {this.healthPreferences = healthPreferences;}

    public void setDishType(List<String> dishType) {this.dishType = dishType;}


}
