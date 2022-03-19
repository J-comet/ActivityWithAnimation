package hs.project.activitywithanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hs.project.activitywithanimation.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        overridePendingTransition(R.anim.verical_enter, R.anim.anim_none)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (isFinishing) {
            // back 버튼으로 화면 종료가 야기되면 동작한다.
            overridePendingTransition(R.anim.anim_none, R.anim.verical_exit)
        }
    }
}