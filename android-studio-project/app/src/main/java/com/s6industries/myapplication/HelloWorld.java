package com.s6industries.myapplication;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.SignalInfo;
import org.godotengine.godot.plugin.UsedByGodot;

import java.util.Set;
import android.util.ArraySet;

public class HelloWorld extends GodotPlugin {

    private String testSignal = "testSignal";

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
        return "Helllooooo Woooorrrllldd!!";
    }

    @UsedByGodot
    public void getHelloSignal(String s) {
        emitSignal(testSignal, s);
    }
}
