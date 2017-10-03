package com.yacov.assessmentquiz;

/**
 * Created by YacovR on 03-Oct-17.
 */

public class Questions {

    public String mQuestions[] = {
            "Qual é o primeiro planeta no sistema solar?",
            "Qual o segundo o planeta do sistmea solar?",
            "Qual o terceiro o planeta do sistmea solar?",
            "Qual é o quarto planeta no sistema solar?",
            "Qual é o quinto planeta no sistema solar?"
    };

    private String mChoices[][] = {
            {"Mercurio"," Venus", "Marte"},
            {"Jupter", "Venus", "Terra"},
            {"Terra", "Marte", "Saturno"},
            {"Plutao", "Saturno", "Marte"},
            {"Marte", "Jupter", "Jupter"}
    };

    private String mCorrectAnswer[] = {
            "Mercurio",
            "Venus",
            "Terra",
            "Marte",
            "Jupter"
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }


}
