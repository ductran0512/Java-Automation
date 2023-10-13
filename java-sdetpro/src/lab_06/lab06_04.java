package lab_06;

public class lab06_04 {
    public static void main(String[] args) {
        String url = "https://google.com";
        // Get Protocol
        int protocolIndex = url.indexOf("://");
        String protocol = url.substring(0, protocolIndex);
        System.out.println("Protocol is: " + protocol);

        // Get domain
        int domainStartIndex = protocolIndex + 3;
        int domainEndIndex = url.indexOf("/", domainStartIndex);
        if (domainEndIndex == - 1) {
            domainEndIndex = url.length();
        }
        String domain = url.substring(domainStartIndex, domainEndIndex);
        System.out.println("Domain is: " + domain);

        // Get domain type
        int domainTypeIndex = domain.indexOf(".");
        String domainType = domain.substring(domainTypeIndex + 1);
        System.out.println("Domain Type is: " + domainType);
    }
}