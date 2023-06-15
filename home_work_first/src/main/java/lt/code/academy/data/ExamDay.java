package lt.code.academy.data;


import java.text.SimpleDateFormat;
import java.util.List;

public class ExamDay {

    // objektas kuriame yra viskas surasyta, ir studentas, ir jo egzaminas ir jo atsakymai ir data, kada laike
    private Student student;

    private Exam exam;

    private List<StudentAnswer> studentAnswers;

    private String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());



}
