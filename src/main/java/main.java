import org.transport.wsdlService.NumberConversion;
import org.transport.wsdlService.NumberConversionSoapType;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URL;

public class main {
    public static void main(String arg[]) throws Exception{
        String endPoint = "https://www.dataaccess.com/webservicesserver/numberconversion.wso";
        URL url = URI.create(endPoint).toURL();
        NumberConversion service = new NumberConversion(url);
        NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);
        System.out.println("retuen value= "+port.numberToDollars(BigDecimal.valueOf(2563)));
    }
}
