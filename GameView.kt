package org.brewcode.hamster.view.base

import com.codeborne.selenide.Selenide.element
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator
import org.brewcode.hamster.util.configureSession
import org.brewcode.hamster.util.xBy
import org.brewcode.hamster.util.xText
import org.brewcode.hamster.view.base.GameView.CommonBlock.takeThePrize

abstract class GameView {

    private object X {
        val app = xText("Hamster Kombat", "android.webkit.WebView")
    }

    val app = element(X.app.xBy())
    val common = CommonBlock
    val navigation = NavigationBlock
    val bottomMenu = BottomMenuBlock

    object CommonBlock {

        val levelUpProcessing = element(ByAndroidUIAutomator("new UiSelector().textContains(\"Level up processing\")"))
        val goAheadButton = element(ByAndroidUIAutomator("new UiSelector().text(\"Go ahead\")"))
        val insufficientFunds = element(ByAndroidUIAutomator("new UiSelector().text(\"Insufficient funds\")"))
        val takeThePrize = element(ByAndroidUIAutomator("new UiSelector().textContains(\"Take the prize\")"))
    }

    object NavigationBlock {

        val backButton = element(ByAndroidUIAutomator("new UiSelector().description(\"Go back\")"))
        val settings = element(ByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)"))
        val reload = element(ByAndroidUIAutomator("new UiSelector().text(\"Reload Page\")"))
    }

    object BottomMenuBlock {

        val exchange = element(ByAndroidUIAutomator("new UiSelector().description(\"Exchange\")"))
        val mine = element(ByAndroidUIAutomator("new UiSelector().description(\"Mine\")"))
        val friends = element(ByAndroidUIAutomator("new UiSelector().description(\"Friends\")"))
        val earn = element(ByAndroidUIAutomator("new UiSelector().description(\"Earn\")"))
        val airdrop = element(ByAndroidUIAutomator("new UiSelector().description(\"Airdrop\")"))
    }
}

fun main() {
    configureSession()
    println(takeThePrize.isDisplayed)
}
