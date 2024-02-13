package helper;

public class Endpoint {
    public static final String url = "http://192.168.7.110";
    public static final String url_pub = "http://182.253.33.106"; //pub

    public static final String urlDev = "http://192.168.202.151";
    public static final String port = "9797";
    public static final String host_galileo = url + ":"  + port;
    public static final String galileo_home = host_galileo + "/dashboard";
    public static final String galileo_loyalty_add = host_galileo + "/loyalty-program/loyalty/add";
}
