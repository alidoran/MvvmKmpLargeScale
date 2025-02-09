package ir.dorantech.util

import ir.dorantech.model.PlatformContext
import java.awt.Desktop

actual val platformContextProvider: PlatformContext
    get() = PlatformContext(Desktop.getDesktop())