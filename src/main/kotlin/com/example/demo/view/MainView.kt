package com.example.demo.view


import com.example.demo.app.Styles.Companion.backgroundBoxColor
import com.example.demo.model.RecipeListItem
import javafx.geometry.Pos
import tornadofx.*

class RecipesListView : View() {
    private val headerView = find(HeaderView::class)

    override val root = vbox {
        style {
            minWidth = 800.px
            minHeight = 600.px
            backgroundColor += backgroundBoxColor
            paddingRight = 20
            paddingLeft = 20
        }
        borderpane {
            top = headerView.root

        }
        tableview<RecipeListItem> {
            style{
                maxWidth = 785.px
                minHeight = 510.px
                maxHeight = 510.px
            }
            items = listOf(
                RecipeListItem("Title", "Cat")
            ).asObservable()

            column("Title", RecipeListItem::title){
                prefWidth = 500.0
            }
            column("Category", RecipeListItem::category){
                prefWidth = 285.0
            }
        }
    }
}