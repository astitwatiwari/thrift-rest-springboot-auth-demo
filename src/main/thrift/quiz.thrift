namespace java com.example.demo

struct TQuestion{
    1:  string questionId,
    2:  string questionStatement,
    3:  list<string> options,
    4:  i32 correctOption;
}

service TQuizService{
    list <TQuestion> getAllQuestions(1: string userId);
    string addQuestion(1: TQuestion tQuestion, 2: string userId);
    string deleteQuestion(1: TQuestion tQuestion, 2: string userId);
    string checkAnswerCorrectness(1: TQuestion tQuestion, 2: string userId, 3: i32 optionSelected);
}