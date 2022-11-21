package com.packagesmaster.thememanager

import com.packagesmaster.sharedutils.SharedUtils


class ThemeManager {

    companion object {
        private lateinit var instance: ThemeManager

        fun getThemeManager(): ThemeManager {
            if (!::instance.isInitialized) {
                instance = ThemeManager()
            }
            return instance
        }
    }

    fun getCurrentAppTheme(): Int {
        return SharedUtils.getSharedUtils().getSharedPreferences().getInt(Constants.SharedPreferencesKeys.AppTheme.key, Constants.AppThemes.Dark.theme)
    }

    fun onDarkThemeSelected(onDarkThemeSelected: () -> Unit): ThemeManager {
        if (getCurrentAppTheme() == Constants.AppThemes.Dark.theme) {
            onDarkThemeSelected()
        }
        return this
    }

    fun onLightThemeSelected(onLightThemeSelected: () -> Unit): ThemeManager {
        if (getCurrentAppTheme() == Constants.AppThemes.Light.theme) {
            onLightThemeSelected()
        }
        return this
    }

    fun onDynamicThemeSelected(onDynamicThemeSelected: () -> Unit): ThemeManager {
        if (getCurrentAppTheme() == Constants.AppThemes.Dynamic.theme) {
            onDynamicThemeSelected()
        }
        return this
    }

    fun onAnyThemeSelected(onAnyThemeSelected: () -> Unit): ThemeManager {
        onAnyThemeSelected()
        return this
    }

}