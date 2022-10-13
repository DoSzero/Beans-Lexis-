package com.posl.beanslexis.model

import com.posl.beanslexis.R

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "Как переводится Almonds ?",
            R.drawable.ic_beans1,
            "Миндаль ",
            "Нут",
            "Арахис",
            "Грецкие орехи",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Как переводится Black eyed peas ?",
            R.drawable.ic_beans2,
            "Каштан",
            "Чорноокий горошок",
            "Часнок",
            "Арахис",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Как переводится Cashew nuts ?",
            R.drawable.ic_beans3,
            "Кофейные зёрна",
            "Орех",
            "Орехи кешью",
            "Какао-бобов",
            3
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Как переводится Chestnuts ?",
            R.drawable.ic_beans4,
            "Нут",
            "Фасоль",
            "Арахис",
            "Каштаны",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Как переводится Chickpeas ?",
            R.drawable.ic_beans5,
            "Миндаль.",
            "Каштан",
            "Фасоль",
            "Арахис",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Как переводится Cocoa beans?",
            R.drawable.ic_beans6,
            "Какао-боб",
            "Кофейные зёрна ",
            "Каштан",
            "Орех",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7,"Как переводится Coffee beans ?",
            R.drawable.ic_beans7,
            "Миндаль.",
            "Кофейные зёрна",
            "Какао-боб",
            "Арахис",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "Как переводится Haricot beans ?",
            R.drawable.ic_beans8,
            "Фасоль.",
            "Какао-боб",
            "Арахис",
            "Грецкие орехи",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "Как переводится Peanuts ?",
            R.drawable.ic_beans9,
            "Арахис",
            "Грецкие орехи",
            "Миндаль.",
            "Каштан",
            2
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "Как переводится Walnuts ?",
            R.drawable.ic_beans10,
            "Фасоль",
            "Арахис",
            "Каштаны",
            "Грецкие орехи",
            4
        )
        questionsList.add(que10)

        return questionsList
    }
}