package udemy.android.builderpattern.builder.contents

import udemy.android.builderpattern.R
import udemy.android.builderpattern.builder.Shading

class ContentShading : Shading {

    override fun shade(): Int = R.color.text_secondary_dark

    override fun background(): Int = R.color.text_content

}