package com.jens.recipes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WebViewFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_webview, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            fileName = bundle.getString("fileName");
        }

        // init webView
        WebView myWebView = getView().findViewById(R.id.webView);
        // displaying content in WebView from html file that stored in assets folder
        myWebView.loadUrl("file:///android_asset/" + fileName);
    }
    private String fileName;
}
