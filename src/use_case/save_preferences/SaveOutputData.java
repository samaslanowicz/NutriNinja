package use_case.save_preferences;

public class SaveOutputData {
    private final String message;

    public SaveOutputData(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
