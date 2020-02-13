import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        System.out.println("enter USD: ");
        double usd = scanner.nextDouble();
        System.out.println("VNĐ: "+ usd*vnd);
    }

}
