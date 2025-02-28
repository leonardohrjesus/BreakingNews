package com.course.breakingnews.plataform

import android.os.Build

actual class Plataform{
    actual val osName: String
        get() = "Android"
    actual val onVersion: String
        get() = "${Build.VERSION.SDK_INT}"
    actual val deviceModel: String
        get() = "${Build.MANUFACTURER} ${Build.MODEL}"

}