package Quiz;


public class Question {
    public String question;
    public String[] answers = new String[4];
    public int rightAnswer;
    public int difficulty;
    public String hint;

    public Question (Questiont q){
        this.question = q.question;
        this.answers[0] = q.answer1;
        this.answers[1] = q.answer2;
        this.answers[2] = q.answer3;
        this.answers[3] = q.answer4;
        this.rightAnswer = q.answer;
        this.difficulty = q.difficulty;
        this.hint = q.hint;
    }

    public int getDifficulty() {
        return this.difficulty;
    }

}
