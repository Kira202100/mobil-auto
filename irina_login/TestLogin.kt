package com.example.irina_login
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.irina_login.ui.login.LoginActivity
import org.hamcrest.CoreMatchers.not


import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

class TestLogin {


    @RunWith(AndroidJUnit4::class)
    class LoginTest1 {

        @get:Rule
        val activityRule = ActivityScenarioRule(LoginActivity::class.java)

        @Test
        fun checkLoginButtonIsDisplayed() {
            LoginPage()
                .setUserName("irina")
                .checkLoginButtonIsDisable()
        }
    }

}