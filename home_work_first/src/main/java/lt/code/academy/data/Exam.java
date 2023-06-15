package lt.code.academy.data;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private String examId;

    private String examSubject;


    List<StudentAnswer> studentAnswers = new ArrayList<>();

    public Exam(String examId, String examSubject, String examTopic) {
        this.examId = examId;
        this.examSubject = examSubject;
        this.studentAnswers = studentAnswers;
    }


}
