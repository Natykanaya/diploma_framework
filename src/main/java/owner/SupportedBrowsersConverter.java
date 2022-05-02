package owner;

import enumerations.SupportedBrowsers;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class SupportedBrowsersConverter implements Converter {
    public SupportedBrowsers convert(Method method, String s) {
        return SupportedBrowsers.valueOf(s);
    }
}
