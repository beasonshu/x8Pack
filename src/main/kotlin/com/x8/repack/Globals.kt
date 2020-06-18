package com.x8.repack

import javafx.stage.Stage

lateinit var mainStage: Stage

var isSyncingTitle: Boolean = false
var isSyncingContent: Boolean = false
var isSyncingSelection: Boolean = false

fun beginSyncing() {
    isSyncingTitle = true
    isSyncingContent = true
    isSyncingSelection = true
}

val isSyncing: Boolean
    get() {
        return isSyncingTitle || isSyncingContent || isSyncingSelection
    }