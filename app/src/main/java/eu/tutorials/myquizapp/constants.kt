package eu.tutorials.myquizapp

object constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"



    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
R.drawable.india,
            "India", " Australia",
            "Armenia", "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
    2, "What country does this flag belong to?",
    R.drawable.argentina,
    "Argentina", " Australia",
    "Armenia", "Austria",
    1
)
questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.australia,
            "Argentina", " Australia",
            "Armenia", "Austria",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.austria,
            "Argentina", " Australia",
            "Armenia", "Austria",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.armenia,
            "Argentina", " Australia",
            "Armenia", "Austria",
            3
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.kuwait,
            "Argentina", " Australia",
            "Armenia", "kuwait",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.pakistan,
            "Pakistan", " Australia",
            "China", "Austria",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.bangladesh,
            "Argentina", " Bangladesh",
            "Armenia", "Austria",
            2
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.america,
            "Argentina", " Australia",
            "America", "Austria",
            3
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.malaysia,
            "Argentina", " Australia",
            "Armenia", "Malaysia",
            4
        )
        questionsList.add(que10)


        return questionsList
    }
}
