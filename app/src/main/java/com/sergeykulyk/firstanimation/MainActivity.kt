package com.sergeykulyk.firstanimation

import android.animation.AnimatorInflater
import android.animation.ValueAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val valueAnimator = ValueAnimator.ofFloat(0f, 700f)
//        valueAnimator.interpolator = AccelerateDecelerateInterpolator()
//        valueAnimator.duration = 2000

        val valueAnimator = AnimatorInflater
            .loadAnimator(this, R.animator.animator) as ValueAnimator

        valueAnimator.addUpdateListener { animation ->
            val progress = animation.animatedValue as Float
            animatedText.translationY = progress
        }

        valueAnimator.start()
    }
}
