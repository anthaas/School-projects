package cz.upol.inf.pja.lecture02;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * Created by AntoninHaas.
 */
@Named(value = "bmicalc")
@SessionScoped
public class BMI implements java.io.Serializable{
    private double height;
    private double weight;
    private double bmi;
    private String result;

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String calc() {
        bmi = weight / (height * height);
        if (bmi < 16.5) {
            result = "Severely underweight";
        } else if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi < 25) {
            result = "Normal (healthy weight)";
        } else if (bmi < 30) {
            result = "Overweight</p>";
        } else if (bmi < 35) {
            result = "Obese Class I (Moderately obese)";
        } else if (bmi < 40) {
            result = "Obese Class II (Severely obese)";
        } else {
            result = "Obese Class III (Very severely obese)";
        }

        return null;
    }

}
