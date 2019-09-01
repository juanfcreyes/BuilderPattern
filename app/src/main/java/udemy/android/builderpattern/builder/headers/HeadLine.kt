package udemy.android.builderpattern.builder.headers

import android.view.ViewGroup
import udemy.android.builderpattern.R

class HeadLine : Header() {

    override fun textSize(): Int = 24

    override fun content(): Int = R.string.headline

    override fun padding(): IntArray = intArrayOf(24,16,16,0)

    override fun layoutparams(): ViewGroup.LayoutParams {
        val width: Int = ViewGroup.LayoutParams.MATCH_PARENT
        val height: Int = ViewGroup.LayoutParams.WRAP_CONTENT
        return ViewGroup.LayoutParams(width, height)
    }
}