package com.example.demo.view


import com.example.demo.app.Styles.Companion.backgroundBoxColor
import tornadofx.*

class RecipesListView : View() {
    private val headerView = find(HeaderView::class)

    override val root = hbox {
        style {
            minWidth = 800.px
            minHeight = 600.px
            backgroundColor += backgroundBoxColor
        }
        borderpane {
            top = headerView.root
        }
    }
}