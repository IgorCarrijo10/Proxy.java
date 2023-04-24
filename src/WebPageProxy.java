public class WebPageProxy implements WebPage {
    private WebPage webPage;
    public WebPageProxy() {
        webPage = new WebPageImpl();
    }
    @Override
    public void renderPage(String url) throws Exception {
        if (url.equalsIgnoreCase("www.youtube.com")) {
            throw new Exception(url + " está bloqueado pelo ISP");
        } else {
            webPage.renderPage(url);
        }
    }
}

