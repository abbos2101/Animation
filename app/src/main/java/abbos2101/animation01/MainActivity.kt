package abbos2101.animation01

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAnimation()
    }

    fun initAnimation() {
        val animStb = AnimationUtils.loadAnimation(this, R.anim.stb)

        tv_title.startAnimation(animStb)
        tv_content.startAnimation(AnimationUtils.loadAnimation(this, R.anim.blink))
        img.startAnimation(AnimationUtils.loadAnimation(this, R.anim.stb))
        cv_reward.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in))
        cv_video.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))
        cv_mvp.startAnimation(AnimationUtils.loadAnimation(this, R.anim.flip))
        btn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_down))
        tv_reward.startAnimation(AnimationUtils.loadAnimation(this, R.anim.sequential))
        tv_video.startAnimation(AnimationUtils.loadAnimation(this, R.anim.sequential))
        tv_mvp.startAnimation(AnimationUtils.loadAnimation(this, R.anim.sequential))
    }
}