package udemy.android.builderpattern.builder

import udemy.android.builderpattern.builder.contents.DetailContent
import udemy.android.builderpattern.builder.contents.SimpleContent
import udemy.android.builderpattern.builder.headers.HeadLine
import udemy.android.builderpattern.builder.headers.SubHeadLine

class LayoutBuilder {

    fun displaySimple() : ArrayList<LayoutView> {
        val views: ArrayList<LayoutView> = ArrayList()
        views.add(HeadLine())
        views.add(SimpleContent())
        return views
    }

    fun displayDetail() : ArrayList<LayoutView> {
        val views: ArrayList<LayoutView> = ArrayList()
        views.add(HeadLine())
        views.add(SubHeadLine())
        views.add(SimpleContent())
        views.add(DetailContent( ))
        return views
    }
}