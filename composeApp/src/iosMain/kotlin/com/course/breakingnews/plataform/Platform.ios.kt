package com.course.breakingnews.plataform

import platform.UIKit.UIDevice

actual class Plataform{
    actual val osName: String
        get() = UIDevice.currentDevice().systemName
    actual val onVersion: String
        get() = UIDevice.currentDevice().systemVersion
    actual val deviceModel: String
        get() = UIDevice.currentDevice().model

}