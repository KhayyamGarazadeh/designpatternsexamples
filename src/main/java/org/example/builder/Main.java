package org.example.builder;

public class Main {

    public static void main(String[] args) {
        LessonBuilder lessonBuilder = new NewStudentLessonBuilder();

        LessonDirector lessonDirector = new LessonDirector(lessonBuilder);
        lessonDirector.make();

        Lesson lesson = lessonBuilder.getResult();

        String result = String.format("%s %f %f", lesson.name, lesson.price, lesson.discountedPrice);
        System.out.println(result);
    }
}
