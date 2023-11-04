package com.s6industries.myapplication;

import android.app.Activity;
import android.util.ArraySet;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.MobileAds;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.SignalInfo;
import org.godotengine.godot.plugin.UsedByGodot;

import java.util.Set;

public class HelloWorld extends GodotPlugin {

    private String testSignal = "testSignal";
    private String TAG = "HelloWorldGodotPlugin";

    public HelloWorld(Godot godot) {
        super(godot);
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "HelloWorld";
    }

    @NonNull
    @Override
    public Set<SignalInfo> getPluginSignals() {
        Set<SignalInfo> signals = new ArraySet<>();
        signals.add(new SignalInfo(testSignal, String.class));
        return signals;
    }

    @UsedByGodot
    public String getHello() {
        getHelloSignal("this is our test signal from ANDROID PLUGIN");
        Log.d(TAG, "logging getHello()..");
        Activity activity = this.getActivity();
        Log.d(TAG, "this.getActivity() completed..");
        if (activity != null) {
            MobileAds.initialize(activity);
            Log.d(TAG, "MobileAds initialized!");
        }
        return "Helllooooo Woooorrrllldd!!";
    }

    @UsedByGodot
    public void getHelloSignal(String s) {
        emitSignal(testSignal, s);
    }
}
