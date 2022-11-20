package com.packagesmaster.thememanager

import androidx.annotation.RestrictTo

@RestrictTo(RestrictTo.Scope.LIBRARY)
internal class Constants {

    enum class SharedPreferencesKeys(var key: String) {
        AppTheme("appTheme"),
    }

    enum class AppThemes(var theme: Int) {
        Dynamic(0),
        FollowSystem(1),
        Dark(2),
        Light(3),
    }

}