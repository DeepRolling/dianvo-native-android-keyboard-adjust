package com.dianvonativeandroidkeyboardadjust

import android.app.Activity
import android.view.WindowManager
import com.facebook.react.bridge.*

class DianvoNativeAndroidKeyboardAdjustModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return "DianvoNativeAndroidKeyboardAdjust"
  }



  @ReactMethod
  fun setStateUnspecified() {
    val activity: Activity = currentActivity ?: return
    activity.runOnUiThread {
      activity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_UNSPECIFIED)
    }
  }

  @ReactMethod
  fun setAdjustNothing() {
    val activity: Activity = currentActivity ?: return
    activity.runOnUiThread {
      activity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING)
    }
  }

  @ReactMethod
  fun setAdjustPan() {
    val activity: Activity = currentActivity ?: return
    activity.runOnUiThread {
      activity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
    }
  }

  @ReactMethod
  fun setAdjustResize() {
    val activity: Activity = currentActivity ?: return
    activity.runOnUiThread {
      activity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
    }
  }

  @ReactMethod
  fun setAdjustUnspecified() {
    val activity: Activity = currentActivity ?: return
    activity.runOnUiThread {
      activity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED)
    }
  }

  @ReactMethod
  fun setAlwaysHidden() {
    val activity: Activity = currentActivity ?: return
    activity.runOnUiThread {
      activity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
    }
  }

  @ReactMethod
  fun setAlwaysVisible() {
    val activity: Activity = currentActivity ?: return
    activity.runOnUiThread {
      activity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
    }
  }

  @ReactMethod
  fun setVisible() {
    val activity: Activity = currentActivity ?: return
    activity.runOnUiThread {
      activity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
    }
  }

  @ReactMethod
  fun setHidden() {
    val activity: Activity = currentActivity ?: return
    activity.runOnUiThread {
      activity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN)
    }
  }

  @ReactMethod
  fun setUnchanged() {
    val activity: Activity = currentActivity ?: return
    activity.runOnUiThread {
      activity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_UNCHANGED)
    }
  }


}
