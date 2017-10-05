package io.callstack.react.opentok;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.opentok.android.Publisher;

public class PublisherViewManager extends SessionViewManager<PublisherView> {
    @ReactProp(name = "cameraPosition")
    public void setCameraPosition(PublisherView view, String key) {
      view.setCameraPosition(key);
    }

    @Override
    public String getName() {
        return "RCTOpenTokPublisherView";
    }

    @Override
    protected PublisherView createViewInstance(ThemedReactContext reactContext) {
        return new PublisherView(reactContext);
    }
}
