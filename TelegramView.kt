package org.brewcode.hamster.view.tg

import com.codeborne.selenide.Selenide.element
import io.appium.java_client.AppiumBy

object TelegramView {

    val goBack = element(AppiumBy.ByAndroidUIAutomator("new UiSelector().description(\"Go back\")"))
    val telegramApp = element(AppiumBy.ByAndroidUIAutomator("new UiSelector().description(\"Telegram\")"))
    val searchButton = element(AppiumBy.accessibilityId("Search"))
    val searchInput = element(AppiumBy.className("android.widget.EditText"))
    val hamsterItem = element(AppiumBy.ByAndroidUIAutomator("new UiSelector().textContains(\"Hamster Kombat, Verified\")"))
    val playButton = element(AppiumBy.ByAndroidUIAutomator("new UiSelector().description(\"Bot menu\")"))
    val playOneCLickButton = element(AppiumBy.ByAndroidUIAutomator("new UiSelector().textContains(\"Play in 1 click\")"))
}
