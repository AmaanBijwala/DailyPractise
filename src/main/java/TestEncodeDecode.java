public class TestEncodeDecode {
    public static void main(String[] args) {
        EncodeAndDecodeTinyURL codec=new EncodeAndDecodeTinyURL();
        String url= url = "https://leetcode.com/problems/design-tinyurl";
        codec.decode(codec.encode(url));
    }
}
