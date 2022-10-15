package study.seo.a3multipleappscreens_miwokapp.data

import study.seo.a3multipleappscreens_miwokapp.R

class DataSource {
    fun loadNumbers(): List<NumberData> {
        return listOf(
            NumberData("1", "James1", R.drawable.number_one, R.raw.number_one),
            NumberData("2", "James2", R.drawable.number_two, R.raw.number_two),
            NumberData("3", "James3", R.drawable.number_three, R.raw.number_three),
            NumberData("4", "James4", R.drawable.number_four, R.raw.number_four),
            NumberData("5", "James5", R.drawable.number_five, R.raw.number_five),
            NumberData("6", "James6", R.drawable.number_six, R.raw.number_six),
            NumberData("7", "James7", R.drawable.number_seven, R.raw.number_seven),
            NumberData("8", "James8", R.drawable.number_eight, R.raw.number_eight),
            NumberData("9", "James9", R.drawable.number_nine, R.raw.number_nine),
            NumberData("10", "James10", R.drawable.number_ten, R.raw.number_ten),
        )
    }

    fun loadFamily(): List<NumberData> {
        return listOf(
            NumberData("James", "bro1", R.drawable.family_grandfather, R.raw.family_grandfather),
            NumberData("Amy", "bro2", R.drawable.family_grandmother, R.raw.family_grandmother),
            NumberData("Tehe", "bro3", R.drawable.family_father, R.raw.family_father),
            NumberData("James1", "bro4", R.drawable.family_mother, R.raw.family_mother),
            NumberData("James2", "bro5", R.drawable.family_son, R.raw.family_son),
            NumberData("James3", "bro6", R.drawable.family_daughter, R.raw.family_daughter),
            NumberData(
                "James4",
                "bro7",
                R.drawable.family_older_brother,
                R.raw.family_older_brother
            ),
            NumberData(
                "James5",
                "bro8",
                R.drawable.family_older_sister,
                R.raw.family_older_sister
            ),
            NumberData(
                "James6",
                "bro9",
                R.drawable.family_younger_brother,
                R.raw.family_younger_brother
            ),
            NumberData(
                "James7",
                "bro10",
                R.drawable.family_younger_sister,
                R.raw.family_younger_sister
            ),
        )
    }

    fun loadColors(): List<NumberData> {
        return listOf(
            NumberData("black", "color1", R.drawable.color_black, R.raw.color_black),
            NumberData("brown", "color2", R.drawable.color_brown, R.raw.color_brown),
            NumberData("gray", "color3", R.drawable.color_gray, R.raw.color_gray),
            NumberData("green", "colo4", R.drawable.color_green, R.raw.color_green),
            NumberData("red", "color5", R.drawable.color_red, R.raw.color_red),
            NumberData(
                "dusty_yellow",
                "color6",
                R.drawable.color_dusty_yellow,
                R.raw.color_dusty_yellow
            ),
            NumberData(
                "mustard-yellow",
                "color7",
                R.drawable.color_mustard_yellow,
                R.raw.color_mustard_yellow
            ),
            NumberData("white", "color8", R.drawable.color_white, R.raw.color_white),
        )
    }

    fun loadPharse(): List<NumberData> {
        return listOf(
            NumberData("hi", "안녕", -1, R.raw.phrase_are_you_coming),
            NumberData("name", "이름", -1, R.raw.phrase_come_here),
            NumberData("apple", "사과", -1, R.raw.phrase_lets_go),
            NumberData("banana", "바나나", -1, R.raw.phrase_im_feeling_good),
            NumberData("kiwi", "키위", -1, R.raw.phrase_how_are_you_feeling),
            NumberData("star", "별", -1, R.raw.phrase_where_are_you_going),
            NumberData("bye", "잘가", -1, R.raw.phrase_my_name_is),
            NumberData("bike", "자전거", -1, R.raw.phrase_what_is_your_name),
            NumberData("tree", "나무", -1, R.raw.phrase_yes_im_coming),
        )
    }

}