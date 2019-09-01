package udemy.android.builderpattern.builder.contents

import udemy.android.builderpattern.builder.LayoutView
import udemy.android.builderpattern.builder.Shading

abstract class Content : LayoutView {

    override fun shading(): Shading = ContentShading()

}