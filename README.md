# Godot Android Plugin Demo

## Instructions

1. Open `android-studio-project` in Android Studio and make the project. This will build an AAR (Android archive) file in the `android-studio-project/app/build/outputs/aar` directory.
2. Open `godot-project` in Godot. Click **Project** > **Install Android Build Template**.
3. Copy the AAR file from step #1 into the `godot-project/android/plugins` directory.
4. Run `adb logcat` in a terminal.
5. Connect an Android device to your computer and build the Godot project to the device.
6. Observe the adb output in the terminal for the expected output shown here:

```
10-19 20:59:14.485  6719  6777 I godot   : Helllooooo Woooorrrllldd!!
10-19 20:59:14.507  6719  6777 I godot   : TEST SIGNAL RECEIVED: this is our test signal from ANDROID PLUGIN
```


## References

* https://youtu.be/kwf8SFfH4s8?si=WZNB_V2oMg3MM6dh
* https://docs.godotengine.org/en/stable/tutorials/platform/android/android_plugin.html
* https://developer.android.com/studio/projects/android-library
* https://github.com/godotengine/godot/issues/47327