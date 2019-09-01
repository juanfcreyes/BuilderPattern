package udemy.android.builderpattern.builder.headers

import udemy.android.builderpattern.builder.LayoutView
import udemy.android.builderpattern.builder.Shading

abstract class Header : LayoutView {

    override fun shading(): Shading = HeaderShading()

}