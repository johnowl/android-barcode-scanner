package com.johnowl.store.barcode.scanner

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_show_barcode.*


class ShowBarcodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_barcode)

        val barcode = intent.getStringExtra(EXTRA_MESSAGE)
        barcodeTextView.text = barcode
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}