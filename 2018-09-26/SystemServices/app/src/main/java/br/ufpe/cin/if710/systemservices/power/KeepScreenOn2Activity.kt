package br.ufpe.cin.if710.systemservices.power

import android.app.Activity
import android.os.Bundle
import br.ufpe.cin.if710.systemservices.R
import kotlinx.android.synthetic.main.activity_keep_screen_on2.*

class KeepScreenOn2Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keep_screen_on2)

        textView.keepScreenOn = true
    }
}
