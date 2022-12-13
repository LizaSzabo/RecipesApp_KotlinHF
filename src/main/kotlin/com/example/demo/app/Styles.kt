package com.example.demo.app

import javafx.scene.text.FontWeight
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val buttonBorderColor = c("#157e28")
        val searchColor = c("#a5d10d")
        val backgroundBoxColor = c("#e1fbbc")
        val searchBoxColor = c("f4f7d3")
    }

    init {
        label {
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }
        button {
            backgroundColor += searchColor
            borderColor += box(buttonBorderColor)
        }
    }
}