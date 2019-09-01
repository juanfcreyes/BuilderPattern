package udemy.android.builderpattern.builder.headers

import udemy.android.builderpattern.R
import udemy.android.builderpattern.builder.Shading

class HeaderShading : Shading {

    override fun shade(): Int = R.color.text_primary_dark

    override fun background(): Int = R.color.text_background

}