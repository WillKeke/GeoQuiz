package com.bignerdranch.android.geoquiz

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean) //textRes is an int because it holds the resource ID (an int)