package education.org.retail;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by nikedigitalsports on 20/05/16.
 */
public class WebViewController extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}