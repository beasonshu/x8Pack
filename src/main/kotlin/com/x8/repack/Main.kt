package com.x8.repack

import javafx.application.Application
import javafx.application.Platform
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import kotlin.system.exitProcess

class Main : Application() {
    override fun start(stage: Stage) {

        mainStage = stage
        val root = FXMLLoader.load<Parent>(javaClass.getResource("main.fxml"))
        stage.title = "打包平台"
        stage.scene = Scene(root, 968.0, 615.0).apply {
            stylesheets.add(Main::class.java.getResource("editor.css").toExternalForm())
        }
        stage.show()
        stage.setOnCloseRequest {
            Platform.exit()
            exitProcess(0)
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Main::class.java, *args)
        }
    }
}