package retrofit;

import java.io.Serializable;

public class Data  implements Serializable {

    String user_id;
    String steps;
    String calories;
    String heart_rate;
    String systole;
    String diastole;

    public String getSystole() {
        return systole;
    }

    public void setSystole(String systole) {
        this.systole = systole;
    }

    public String getDiastole() {
        return diastole;
    }

    public void setDiastole(String diastole) {
        this.diastole = diastole;
    }
    /*
    {
"user_id":"1",
"steps":"20",
"calories":"34",
"heart_rate":"45",
"systole": "130",
"diastole" : "75"
}

     */

    public Data(String user_id, String steps, String calories, String heart_rate,String systole,
            String diastole) {
        this.user_id = user_id;
        this.steps = steps;
        this.calories = calories;
        this.heart_rate = heart_rate;
        this.systole = systole;
        this.diastole = diastole;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(String heart_rate) {
        this.heart_rate = heart_rate;
    }
}
