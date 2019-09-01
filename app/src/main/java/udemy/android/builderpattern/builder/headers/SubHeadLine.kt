package udemy.android.builderpattern.builder.headers

import android.view.ViewGroup
import udemy.android.builderpattern.R

class SubHeadLine : Header() {

    override fun textSize(): Int = 18

    override fun content(): Int = R.string.subheadline

    override fun padding(): IntArray =  intArrayOf(32,8,16,8)

    override fun layoutparams(): ViewGroup.LayoutParams {
        val width: Int = ViewGroup.LayoutParams.MATCH_PARENT
        val height: Int = ViewGroup.LayoutParams.WRAP_CONTENT
        return ViewGroup.LayoutParams(width, height)
    }
}