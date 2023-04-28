package expo.modules.isadbenabled

import android.content.Context
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition
import android.provider.Settings
import android.util.Log

class ExpoIsAdbEnabledModule : Module() {
  // Each module class must implement the definition function. The definition consists of components
  // that describes the module's functionality and behavior.
  // See https://docs.expo.dev/modules/module-api for more details about available components.
  override fun definition() = ModuleDefinition {
    // Sets the name of the module that JavaScript code will use to refer to the module. Takes a string as an argument.
    // Can be inferred from module's class name, but it's recommended to set it explicitly for clarity.
    // The module will be accessible from `requireNativeModule('ExpoIsAdbEnabled')` in JavaScript.
    Name("ExpoIsAdbEnabled")

    Function("isAdbEnabled") {
      return@Function isAdbEnabled()
    }
  }

  private val context
  get() = requireNotNull(appContext.reactContext)

  private fun isAdbEnabled(): Boolean {
    val check = Settings.Secure.getInt(context.contentResolver, Settings.Secure.ADB_ENABLED, 0) != 0
    return check
  }
}
