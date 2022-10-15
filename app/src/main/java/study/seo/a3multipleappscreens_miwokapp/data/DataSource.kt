package study.seo.a3multipleappscreens_miwokapp.data

import study.seo.a3multipleappscreens_miwokapp.R

class DataSource {
    fun loadNumbers(): List<ActivityData> {
        return listOf<ActivityData>(
            ActivityData("1", "James1", R.drawable.number_one, R.raw.number_one),
            ActivityData("2", "James2", R.drawable.number_two, R.raw.number_two),
            ActivityData("3", "James3", R.drawable.number_three, R.raw.number_three),
            ActivityData("4", "James4", R.drawable.number_four, R.raw.number_four),
            ActivityData("5", "James5", R.drawable.number_five, R.raw.number_five),
            ActivityData("6", "James6", R.drawable.number_six, R.raw.number_six),
            ActivityData("7", "James7", R.drawable.number_seven, R.raw.number_seven),
            ActivityData("8", "James8", R.drawable.number_eight, R.raw.number_eight),
            ActivityData("9", "James9", R.drawable.number_nine, R.raw.number_nine),
            ActivityData("10", "James10", R.drawable.number_ten, R.raw.number_ten),
        )
    }

    fun loadFamily(): List<ActivityData> {
        return listOf(
            ActivityData("James", "bro1", R.drawable.family_grandfather, R.raw.family_grandfather),
            ActivityData("Amy", "bro2", R.drawable.family_grandmother, R.raw.family_grandmother),
            ActivityData("Tehe", "bro3", R.drawable.family_father, R.raw.family_father),
            ActivityData("James1", "bro4", R.drawable.family_mother, R.raw.family_mother),
            ActivityData("James2", "bro5", R.drawable.family_son, R.raw.family_son),
            ActivityData("James3", "bro6", R.drawable.family_daughter, R.raw.family_daughter),
            ActivityData(
                "James4",
                "bro7",
                R.drawable.family_older_brother,
                R.raw.family_older_brother
            ),
            ActivityData(
                "James5",
                "bro8",
                R.drawable.family_older_sister,
                R.raw.family_older_sister
            ),
            ActivityData(
                "James6",
                "bro9",
                R.drawable.family_younger_brother,
                R.raw.family_younger_brother
            ),
            ActivityData(
                "James7",
                "bro10",
                R.drawable.family_younger_sister,
                R.raw.family_younger_sister
            ),
        )
    }

    fun loadColors(): List<ActivityData> {
        return listOf(
            ActivityData("black", "color1", R.drawable.color_black, R.raw.color_black),
            ActivityData("brown", "color2", R.drawable.color_brown, R.raw.color_brown),
            ActivityData("gray", "color3", R.drawable.color_gray, R.raw.color_gray),
            ActivityData("green", "colo4", R.drawable.color_green, R.raw.color_green),
            ActivityData("red", "color5", R.drawable.color_red, R.raw.color_red),
            ActivityData(
                "dusty_yellow",
                "color6",
                R.drawable.color_dusty_yellow,
                R.raw.color_dusty_yellow
            ),
            ActivityData(
                "mustard-yellow",
                "color7",
                R.drawable.color_mustard_yellow,
                R.raw.color_mustard_yellow
            ),
            ActivityData("white", "color8", R.drawable.color_white, R.raw.color_white),
        )
    }

    fun loadPharse(): List<ActivityData> {
        return listOf(
            ActivityData("hi", "안녕", -1, R.raw.phrase_are_you_coming),
            ActivityData("name", "이름", -1, R.raw.phrase_come_here),
            ActivityData("apple", "사과", -1, R.raw.phrase_lets_go),
            ActivityData("banana", "바나나", -1, R.raw.phrase_im_feeling_good),
            ActivityData("kiwi", "키위", -1, R.raw.phrase_how_are_you_feeling),
            ActivityData("star", "별", -1, R.raw.phrase_where_are_you_going),
            ActivityData("bye", "잘가", -1, R.raw.phrase_my_name_is),
            ActivityData("bike", "자전거", -1, R.raw.phrase_what_is_your_name),
            ActivityData("tree", "나무", -1, R.raw.phrase_yes_im_coming),
        )
    }

}