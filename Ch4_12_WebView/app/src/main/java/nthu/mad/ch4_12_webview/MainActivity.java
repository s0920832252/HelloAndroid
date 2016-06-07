package nthu.mad.ch4_12_webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private Button btn;
    private EditText et;
    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        et = (EditText) findViewById(R.id.editText);
        wv = (WebView) findViewById(R.id.webView);

        int start = "https://".length();
        int end = et.getText().toString().length();
        et.setSelection(start, end);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String url = et.getText().toString();
                wv.loadUrl(url);
            }
        });

        //開啟APP預設載入EditText中的網址內容
        wv.getSettings().setJavaScriptEnabled(true); //讓javascript語法可在webView元件使用
        wv.loadUrl(et.getText().toString()); //設定webView元件欲連結的網址
        wv.setWebViewClient(new MyWebView()); //要使用自製的webView來處理URL要求,(必須改寫)
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK && wv.canGoBack())
        {
            wv.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public class MyWebView extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }
    }
}
