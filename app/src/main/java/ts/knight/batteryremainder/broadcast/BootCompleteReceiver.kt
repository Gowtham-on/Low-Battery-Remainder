package ts.knight.batteryremainder.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import ts.knight.batteryremainder.service.ForegroundService

class BootCompleteReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (context != null) {
            ForegroundService.startService(context)
        }
    }
}