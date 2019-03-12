package by.itacademy.cleancodeproject.presentation.test.mvp

import android.app.Activity
import android.os.Bundle
import by.itacademy.cleancodeproject.R

class TestMvpActivity : Activity(){

    private val abc: String? = null
    private var text: Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvp_mvvm)
    }
}