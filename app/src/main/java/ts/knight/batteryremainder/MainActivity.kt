package ts.knight.batteryremainder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ts.knight.batteryremainder.service.ForegroundService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ForegroundService.startService(this)
    }
}