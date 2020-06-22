package com.example.user.quiznnu;

public class Questions {

    public String mQuestions[] = {
            "What is 1+1?",
            "What is 1+2?",
            "What is 1+3?",
            "What is 1+4?"
    };


    private String mChoices[][] =
            {
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"5", "2", "3", "9"}
            };


    private String mCorrectAns[] = {"2", "3", "4", "5"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;

    }

    public String getChoice0(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAns[a];
        return answer;
    }
}

